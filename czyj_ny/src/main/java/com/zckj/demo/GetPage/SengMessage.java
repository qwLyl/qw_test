package com.zckj.demo.GetPage;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.PostMethod;

/**
 * @author SHD
 * @date 20-7-6
 * @desc
 */

public class SengMessage {
     public static String send(HttpClient client,String st,String text,String phone){
         String str="";
         try {
             String url="http://hn.ccoa.sgcc.com.cn/app/coa/src/core/common.nsf/OperateService?OpenAgent&Action=SendMobileMsg";
             PostMethod postMethod=new PostMethod(url);
             postMethod.setRequestHeader("cookie",st);
             postMethod.setRequestHeader("Accept","text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8");
             postMethod.setRequestHeader("Accept-Encoding","gzip, deflate");
             postMethod.setRequestHeader("Accept-Language","zh-CN,zh;q=0.9");
             postMethod.setRequestHeader("User-Agent","Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.110 Safari/537.36");
             postMethod.setRequestHeader("Upgrade-Insecure-Requests","1");
             postMethod.setRequestHeader("Host","hn.ccoa.sgcc.com.cn");
             postMethod.setRequestHeader("Origin","http://hn.ccoa.sgcc.com.cn");
             postMethod.setRequestHeader("Referer","http://hn.ccoa.sgcc.com.cn/app/coa/src/core/common.nsf/SendSMS?OpenForm");
             postMethod.setRequestHeader("Content-Type","application/x-www-form-urlencoded; charset=UTF-8");
             postMethod.addParameter("","");
             postMethod.addParameter("smsBody",text);
             postMethod.addParameter("smsMobile",phone);
             int statusCode=client.executeMethod(postMethod);
             str=postMethod.getResponseBodyAsString();
             System.out.println(str);
             System.out.println("短信已发送");
         }catch (Exception e){
             e.printStackTrace();
         }
         return  str;
     }



}
