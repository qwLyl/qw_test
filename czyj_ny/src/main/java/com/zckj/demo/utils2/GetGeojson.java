package com.zckj.demo.utils2;

import org.springframework.util.ResourceUtils;

import java.io.*;

public class GetGeojson {

	public static boolean getGEOJSON(String name,String str){
		String path = null;
		try {
			path = ResourceUtils.getURL("classpath:").getPath();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		/*int index = path.indexOf("WEB-INF");
		path = path.substring(0,index);*/
		path = new File(path).getAbsolutePath();
		//鏂囦欢瀛樺偍璺緞
		path = path + "\\static\\"+name+".geojson";
		path = path.replace("%20", " ");
       
		File f = new File(path);
		if(f.exists()){
			//濡傛灉涔嬪墠瀛樺湪锛屽垯鍏堝垹闄�
			f.delete();
		}
		//鏂囦欢鍐欏嚭
		try {
			OutputStreamWriter fos = new OutputStreamWriter(new FileOutputStream(f),"utf-8");
			fos.write(str);
			fos.close();
			return true;
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public static boolean getLineGEOJSON(String name,String str){
		String path = WriteCoor.class.getClassLoader().getResource("").getFile().toString();
		int index = path.indexOf("WEB-INF");
		path = path.substring(0,index);
		path = new File(path).getAbsolutePath();
		//鏂囦欢瀛樺偍璺緞
		path = path + "\\Line\\"+name+".geojson";
		path = path.replace("%20", " ");
       
		File f = new File(path);
		if(f.exists()){
			//濡傛灉涔嬪墠瀛樺湪锛屽垯鍏堝垹闄�
			f.delete();
		}
		//鏂囦欢鍐欏嚭
		try {
			OutputStreamWriter fos = new OutputStreamWriter(new FileOutputStream(f),"utf-8");
			fos.write(str);
			fos.close();
			return true;
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
	}
}
