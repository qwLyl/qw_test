package com.zckj.demo.login;

import com.zckj.demo.bean.Ny.Key;
import com.zckj.demo.util.Js;
import org.apache.commons.httpclient.Cookie;
import org.apache.commons.httpclient.Header;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.methods.PostMethod;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * @author SHD
 * @date 20-7-5
 * @desc
 */

public class UserLogin {
    public static String enterHomeTime="";
    public static String sessionid="";
    public static String st="";
    public HttpClient login(HttpClient client){
        String username="chenpy";
        String password="cpy2515067@.";
        if (client.getState().getCookies().length==0){
            Key key=getkey(client);
            String e=key.e;
            String m=key.m;
            String _eventId=key._eventId;
            String execution=key.execution;
            String lt=key.lt;
            String jessiond=key.jSessionId;
            String messageCode=key.messageCode;
            String authModeSerial=key.authModeSerial;
            password= Js.getPass(m,e,password);
            client =getLogin(client,username,password,_eventId,execution,lt,jessiond,messageCode,authModeSerial);
        }else {
            GetMethod getMethod=new GetMethod("http://home3.ccoa.sgcc.com.cn:8001/coa-webapp/modtree.action?modid=m14&sid=null&isrootDisplay=0&istreeDisplay=0&modname=%E5%8A%9E%E5%85%AC%E5%BF%AB%E8%BD%A6%E9%81%93");
            try {
             int statusCode =  client.executeMethod(getMethod);
             String str=getMethod.getResponseBodyAsString();
             if (str.contains("应用验证用户成功")){
                 System.out.println("协同办公平台登录成功");
             }
            } catch (HttpException ex) {
                ex.printStackTrace();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        return client;
    }

    public  static HttpClient getLogin(HttpClient client,String username,String password,String _eventId,String execution,String lt,String jessiond,String messageCode,String authModeSerial){
        try {
            String url="http://iscsso.sgcc.com.cn/isc_sso/login;jsessionid="+jessiond+"?service=http%3A%2F%2Fccoa.sgcc.com.cn%2Fsso%2Flogin%2FiscLogin.action%3Fservice%3Dhttp%253A%252F%252Fhome3.ccoa.sgcc.com.cn%253A8001%252Fcoa-webapp%252Findex.action%253Fsysid%253Ds0";
             PostMethod postMethod=new PostMethod(url);
            StringBuffer stringBuffer=new StringBuffer();
            stringBuffer.append("enterHomeTime="+enterHomeTime+"");
             postMethod.setRequestHeader("Referer","http://iscsso.sgcc.com.cn/isc_sso/login?service=http%3A%2F%2Fccoa.sgcc.com.cn%2Fsso%2Flogin%2FiscLogin.action%3Fservice%3Dhttp%253A%252F%252Fhome3.ccoa.sgcc.com.cn%253A8001%252Fcoa-webapp%252Findex.action%253Fsysid%253Ds0");
             postMethod.setRequestHeader("Host","iscsso.sgcc.com.cn");
             postMethod.setRequestHeader("Content-Type","application/x-www-form-urlencoded");
             postMethod.setRequestHeader("Connection","keep-alive");
             postMethod.setRequestHeader("Accept","application/x-ms-application, image/jpeg, application/xaml+xml, image/gif, image/pjpeg, application/x-ms-xbap, application/vnd.ms-excel, application/vnd.ms-powerpoint, application/msword, */*");
             postMethod.setRequestHeader("Accept-Encoding","gzip, deflate");
             postMethod.setRequestHeader("Accept-Language","zh-CN,zh;q=0.9");
             postMethod.setRequestHeader("User-Agent","Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 6.1; WOW64; Trident/4.0; chromeframe/24.0.1312.52; SLCC2; .NET CLR 2.0.50727; .NET CLR 3.5.30729; .NET CLR 3.0.30729; Media Center PC 6.0; .NET4.0C; .NET4.0E)");
             postMethod.setRequestHeader("Pragma","no-cache");
             postMethod.addParameter("wangsheng","hn");
            postMethod.addParameter("username",username);
            postMethod.addParameter("password",password);
            postMethod.addParameter("lt",lt);
            postMethod.addParameter("messageCode",messageCode);
            postMethod.addParameter("authModeSerial",authModeSerial);
            postMethod.addParameter("_eventId",_eventId);
            postMethod.addParameter("execution",execution);
            int code=client.executeMethod(postMethod);
            Cookie[] cookie=client.getState().getCookies();
            Header[] headers=postMethod.getResponseHeaders();
            StringBuffer sb=new StringBuffer();
            for (Cookie c:cookie){
                sb.append(c.toString()+";");
            }
            String s=postMethod.getResponseBodyAsString();
            if(code==302){
                String redirect=postMethod.getResponseHeader("Location").getValue();
                GetMethod getMethod3=new GetMethod(redirect);
                getMethod3.setRequestHeader("cookie",sb.toString());
                getMethod3.setRequestHeader("Accept","application/x-ms-application, image/jpeg, application/xaml+xml, image/gif, image/pjpeg, application/x-ms-xbap, application/vnd.ms-excel, application/vnd.ms-powerpoint, application/msword, */*");
                getMethod3.setRequestHeader("Accept-Encoding","gzip, deflate");
                getMethod3.setRequestHeader("Accept-Language","zh-CN,zh;q=0.9");
                getMethod3.setRequestHeader("User-Agent","Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 6.1; WOW64; Trident/4.0; chromeframe/24.0.1312.52; SLCC2; .NET CLR 2.0.50727; .NET CLR 3.5.30729; .NET CLR 3.0.30729; Media Center PC 6.0; .NET4.0C; .NET4.0E)");
                getMethod3.setRequestHeader("Pragma","no-cache");
                getMethod3.setRequestHeader("Referer","http://iscsso.sgcc.com.cn/isc_sso/login?service=http%3A%2F%2Fccoa.sgcc.com.cn%2Fsso%2Flogin%2FiscLogin.action%3Fservice%3Dhttp%253A%252F%252Fhome3.ccoa.sgcc.com.cn%253A8001%252Fcoa-webapp%252Findex.action%253Fsysid%253Ds0");
                getMethod3.setRequestHeader("Host","ccoa.sgcc.com.cn");
                getMethod3.setRequestHeader("Connection","keep-alive");
                int code1=client.executeMethod(getMethod3);
                String str=getMethod3.getResponseBodyAsString();
                Cookie[] cookie1=client.getState().getCookies();
                sessionid=cookie1[3].toString();
                Header[] h2=getMethod3.getResponseHeaders();
                StringBuffer stringBuffer1=new StringBuffer();
                for (Header h:h2){
                    if (h.getName().equals("Set-Cookie"))
                    stringBuffer1.append(h.getValue()+";");
                }
                 st=stringBuffer1.toString();
                String surl=str.substring(str.indexOf("location.href")+15,str.indexOf("ticket")+37);
                String ticket=surl.substring(surl.indexOf("ticket"));
                String loginurl="http://home3.ccoa.sgcc.com.cn:8001/coa-webapp/index.action?sysid=s0&"+ticket;
                GetMethod getMethod1=new GetMethod(loginurl);
                getMethod1.setRequestHeader("cookie",st);
                getMethod1.setRequestHeader("Referer","http://ccoa.sgcc.com.cn/sso/login/iscLogin.action;"+sessionid+"?service=http%3A%2F%2Fhome3.ccoa.sgcc.com.cn%3A8001%2Fcoa-webapp%2Findex.action%3Fsysid%3Ds0");
                 getMethod1.setRequestHeader("Host","home3.ccoa.sgcc.com.cn:8001");
                 int code2=client.executeMethod(getMethod1);
                 String str2=getMethod1.getResponseBodyAsString();
                System.out.println(str2);
            }
        }catch (Exception e1){
            e1.printStackTrace();
        }
        return  client;
    }
    public static Key getkey(HttpClient client){
        Key key=new Key();
        try {
            enterHomeTime=String.valueOf(getTimestamp());
            String url="http://iscsso.sgcc.com.cn/isc_sso/login?service=http%3A%2F%2Fccoa.sgcc.com.cn%2Fsso%2Flogin%2FiscLogin.action%3Fservice%3Dhttp%253A%252F%252Fhome3.ccoa.sgcc.com.cn%253A8001%252Fcoa-webapp%252Findex.action%253Fsysid%253Ds0";
            GetMethod get=new GetMethod(url);
            get.setRequestHeader("Cookie","enterHomeTime="+enterHomeTime);
            get.setRequestHeader("Host","iscsso.sgcc.com.cn");
            client.executeMethod(get);
            Header[]  headers=get.getResponseHeaders();
            String str=get.getResponseBodyAsString();
            Document doc= Jsoup.parse(str);
            Elements authModeSerial=doc.getElementsByAttributeValue("name","authModeSerial");
            key.authModeSerial=authModeSerial.val();
            Elements messageCode=doc.getElementsByAttributeValue("name","messageCode");
            key.messageCode=messageCode.val();
            Elements lt=doc.getElementsByAttributeValue("name","lt");
            key.lt=lt.val();
            Elements execution=doc.getElementsByAttributeValue("name","execution");
            key.execution=execution.val();
            Elements _eventId=doc.getElementsByAttributeValue("name","_eventId");
            key._eventId=_eventId.val();
//            str=str.substring(str.indexOf("css;jsessionid")+14);
//            key.jSessionId=str.substring(str.indexOf("=")+1,str.indexOf("/>")-2);
//            str=str.substring(str.indexOf("name=\"lt\"")+16);
//            key.lt=str.substring(str.indexOf("\"") + 1, str.indexOf("/>")-2);
//            str=str.substring(str.indexOf("name=\"execution\"")+23);
//            key.execution=str.substring(str.indexOf("\"")+1,str.indexOf("/>")-2);
//            str=str.substring(str.indexOf("name=\"_eventId\"")+22);
//            key. _eventId=str.substring(str.indexOf("\"")+1,str.indexOf("/>")-2);
//            str=str.substring(str.indexOf("name=\"m\"")+8);
//            key.m=str.substring(str.indexOf("\"")+1,str.indexOf("/>")-2);
//            str=str.substring(str.indexOf("name=\"e\"")+8);
//            key.e=str.substring(str.indexOf("\"")+1,str.indexOf("/>")-2);
        }catch (Exception e){
            e.printStackTrace();
        }
        return key;
    }

    //生成时间戳
    public static  long getTimestamp(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date=new Date();
        String timestamp=String.valueOf(date.getTime());
        return Long.valueOf(timestamp);
    }

}
