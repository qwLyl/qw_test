package com.zckj.demo.common;

import java.io.File;

/**
 * 获取当前项目绝对路径
 * @author yang
 *
 */
public class AbsolutePath {

	public static String getAbsolutePath(){
		String path = AbsolutePath.class.getClassLoader().getResource("").getFile().toString();//获取到对应的classes文件夹路径
		//int index = path.indexOf("WEB-INF");
		path = path.substring(0);//获取当前项目名称的绝对路径
		path = new File(path).getAbsolutePath();
		path = new File(path).getAbsolutePath();
		return path;
	}
}
