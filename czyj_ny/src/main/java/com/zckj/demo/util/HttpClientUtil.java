package com.zckj.demo.util;


import org.apache.http.config.Registry;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.conn.socket.PlainConnectionSocketFactory;
import org.apache.http.conn.ssl.DefaultHostnameVerifier;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

/**
 * @author SHD
 * @date 2020/4/13
 * @desc 使用连接池得到HttpClient连接
 */
@Component
public class HttpClientUtil {
    private static final Logger LOGGER = LoggerFactory.getLogger(HttpClientUtil.class);
    private PoolingHttpClientConnectionManager cm;
    private static HttpClientUtil httpClientUtil = null;
    private static final Integer MAX_TOTAL = 100;
    private static final String HTTP = "http";
    private static final String HTTPS = "https";

    /**
     * 初始化连接池
     */
    @PostConstruct
    private void init() {
        if (cm == null) {
            Registry<ConnectionSocketFactory> registry = RegistryBuilder.<ConnectionSocketFactory>create()
                    .register(HTTP, PlainConnectionSocketFactory.INSTANCE)
                    .register(HTTPS, buildSSLConnectionSocket())
                    .build();
            cm = new PoolingHttpClientConnectionManager(registry);
            cm.setMaxTotal(MAX_TOTAL);
            cm.setDefaultMaxPerRoute(cm.getMaxTotal());
        }
    }

    /**
     * 建立SSL Socket连接
     * @return
     */
    private ConnectionSocketFactory buildSSLConnectionSocket() {
        try {
            return new SSLConnectionSocketFactory(createIgnoreSSLVerify(), new String[]{"SSLv3", "TLSv1", "TLSv1.1", "TLSv1.2"},
                    null, new DefaultHostnameVerifier());
        } catch (KeyManagementException e) {
            LOGGER.error("ssl连接失败", e);
        } catch (NoSuchAlgorithmException e) {
            LOGGER.error("ssl连接失败", e);
        }
        return SSLConnectionSocketFactory.getSocketFactory();
    }

    private SSLContext createIgnoreSSLVerify() throws KeyManagementException, NoSuchAlgorithmException {
        X509TrustManager x509TrustManager = new X509TrustManager() {
            @Override
            public void checkClientTrusted(X509Certificate[] x509Certificates, String s) throws CertificateException {

            }

            @Override
            public void checkServerTrusted(X509Certificate[] x509Certificates, String s) throws CertificateException {

            }

            @Override
            public X509Certificate[] getAcceptedIssuers() {
                return null;
            }
        };
        SSLContext sslContext = SSLContext.getInstance("SSLv3");
        sslContext.init(null, new TrustManager[]{x509TrustManager}, null);
        return sslContext;
    }

    public CloseableHttpClient getHttpClient(){
        HttpClientBuilder builder = HttpClients.custom();
        builder.setConnectionManager(cm);
        builder.setUserAgent("Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.110 Safari/537.36");
        builder.setDefaultCookieStore(new BasicCookieStore());
        return builder.build();
    }
}