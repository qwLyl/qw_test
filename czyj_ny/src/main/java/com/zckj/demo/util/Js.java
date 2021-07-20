package com.zckj.demo.util;

import org.springframework.stereotype.Component;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.io.*;

@Component
public class Js {
	public static String getPass(String m,String e1,String pwd) {
		Object rs=null;
		try {
			StringBuffer sb=new StringBuffer();
			File file =new File("RSAUtils.js");
			FileReader fr=new FileReader(file);
			BufferedReader br=new BufferedReader(fr);
			String temp=null;
			while((temp=br.readLine())!=null) {
				sb.append(temp).append("\n");
			}
			br.close();
			fr.close();
			ScriptEngineManager mar=new ScriptEngineManager();
			ScriptEngine engine=mar.getEngineByName("javascript");
			engine.eval(sb.toString());
			Invocable inv=(Invocable) engine;
//			rs=inv.invokeFunction("createSecurityData", m,e1,pwd);
			rs=inv.invokeFunction("getEncryptPwd",pwd);
			System.out.println(rs);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ScriptException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return (String) rs;
	}

	/**
	 * 对signLoginname和signPassword加密
	 * @param content
	 * @param publicKey
	 * @return
	 */
	public static String getPass1(String content,String publicKey) {
		Object rs=null;
		try {
			StringBuffer sb=new StringBuffer();
			File file =new File("jsencrypt.js");
			FileReader fr=new FileReader(file);
			BufferedReader br=new BufferedReader(fr);
			String temp=null;
			while((temp=br.readLine())!=null) {
				sb.append(temp).append("\n");
			}
			br.close();
			fr.close();
			ScriptEngineManager mar=new ScriptEngineManager();
			ScriptEngine engine=mar.getEngineByName("javascript");
			engine.eval(sb.toString());
			Invocable inv=(Invocable) engine;
			rs=inv.invokeFunction("admin_SHA384_RSA", content,publicKey);
			System.out.println(rs);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ScriptException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return (String) rs;
	}


	/**
	 * 对用户名和密码进行加密
	 */
	/**
	 * 对signLoginname和signPassword加密
	 * @param content
	 * @param publicKey
	 * @return
	 */
	public static String getPass2(String content,String publicKey) {
		Object rs=null;
		try {
			StringBuffer sb=new StringBuffer();
			File file =new File("jsencrypt.js");
			FileReader fr=new FileReader(file);
			BufferedReader br=new BufferedReader(fr);
			String temp=null;
			while((temp=br.readLine())!=null) {
				sb.append(temp).append("\n");
			}
			br.close();
			fr.close();
			ScriptEngineManager mar=new ScriptEngineManager();
			ScriptEngine engine=mar.getEngineByName("javascript");
			engine.eval(sb.toString());
			Invocable inv=(Invocable) engine;
			rs=inv.invokeFunction("admin_RSA", content,publicKey);
			System.out.println(rs);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ScriptException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return (String) rs;
	}
}
