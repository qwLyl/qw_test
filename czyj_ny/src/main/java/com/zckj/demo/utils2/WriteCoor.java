package com.zckj.demo.utils2;

import com.zckj.demo.common.Test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.text.DecimalFormat;
import java.util.List;



/**
 * 文件输出类
 * @author yang
 *
 */
public class WriteCoor {

	/**
	 * 写出负载的kml文件，作为热力图数据源
	 * @param name 文件名字，不需要添加后缀名，自动补充为.kml
	 * @param list 数据集合
	 * @param time 容量为2的数组，第一个数为除数，第二个数为减数
	 * @return
	 */
	public static boolean WriteKML(String name, List<Test> list, int[] time){
		//获取绝对路径
		//   /D:/apache-tomcat-7.0.73/webapps/tqqjst/WEB-INF/classes/
		String path = WriteCoor.class.getClassLoader().getResource("").getFile().toString();
		int index = path.indexOf("WEB-INF");
		//   /D:/apache-tomcat-7.0.73/webapps/tqqjst/
		path = path.substring(0,index);
		//   //D:\apache-tomcat-7.0.73\webapps\tqqjst
		path = new File(path).getAbsolutePath();
		//文件存储路径
		path = path + "\\map\\"+name+".kml";
		
		//文件写出
		try {
			FileOutputStream fos = new FileOutputStream(new File(path));
			fos.write("<Document>\r\n".getBytes());
			fos.write("<Folder>\r\n".getBytes());
			Test t = null;
			int z = 0;
			for (int i = 0; i < list.size(); i++) {
				t = list.get(i);
				
				if(Integer.parseInt(t.getValue())<90){
					z = 1;
				} else if(Integer.parseInt(t.getValue()) < 100){
					z = 2;
				} else if(Integer.parseInt(t.getValue()) < 120){
					z = 3;
				} else {
					z = 4;
				}
				//该行需要自行设定热度范围time
				for (int j = 0; j < z; j++) {
					String str = "<Placemark id=\""+i+j+"\">";
					fos.write(str.getBytes());
					str = "<Point><coordinates>"+list.get(i).getX()+","+list.get(i).getY()+"</coordinates></Point>\r\n";
					fos.write(str.getBytes());
					fos.write("</Placemark>\r\n".getBytes());
				}
			}
			fos.write("</Folder>\r\n".getBytes());
			fos.write("</Document>\r\n".getBytes());
			fos.close();
			return true;
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	/**
	 * 写出电压kml文件，作为热力图数据源
	 * @param name 文件名字，不需要添加后缀名，自动补充为.kml
	 * @param list 数据集合
	 * @param time 容量为2的数组，第一个数为除数，第二个数为减数
	 * @return
	 */
	public static boolean WriteKML3(String name,List<Test> list,int[] time){
		//获取绝对路径
		//   /D:/apache-tomcat-7.0.73/webapps/tqqjst/WEB-INF/classes/
		String path = WriteCoor.class.getClassLoader().getResource("").getFile().toString();
		int index = path.indexOf("WEB-INF");
		//   /D:/apache-tomcat-7.0.73/webapps/tqqjst/
		path = path.substring(0,index);
		//   //D:\apache-tomcat-7.0.73\webapps\tqqjst
		path = new File(path).getAbsolutePath();
		//文件存储路径
		path = path + "\\map\\"+name+".kml";
		
		//文件写出
		try {
			FileOutputStream fos = new FileOutputStream(new File(path));
			fos.write("<Document>\r\n".getBytes());
			fos.write("<Folder>\r\n".getBytes());
			Test t = null;
			int z = 0;
			for (int i = 0; i < list.size(); i++) {
				t = list.get(i);
				
				if(Double.parseDouble(t.getValue())>0){
					z = 2;
				} else {
					z = 1;
				}
				//该行需要自行设定热度范围time
				for (int j = 0; j < z; j++) {
					String str = "<Placemark id=\""+i+j+"\">";
					fos.write(str.getBytes());
					str = "<Point><coordinates>"+list.get(i).getX()+","+list.get(i).getY()+"</coordinates></Point>\r\n";
					fos.write(str.getBytes());
					fos.write("</Placemark>\r\n".getBytes());
				}
			}
			fos.write("</Folder>\r\n".getBytes());
			fos.write("</Document>\r\n".getBytes());
			fos.close();
			return true;
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	/**
	 * 写出线损kml文件，作为热力图数据源
	 * @param name 文件名字，不需要添加后缀名，自动补充为.kml
	 * @param list 数据集合
	 * @param time 容量为2的数组，第一个数为除数，第二个数为减数
	 * @return
	 */
	public static boolean WriteKML2(String name,List<Test> list,int[] time){
		//获取绝对路径
		//   /D:/apache-tomcat-7.0.73/webapps/tqqjst/WEB-INF/classes/
		String path = WriteCoor.class.getClassLoader().getResource("").getFile().toString();
		int index = path.indexOf("WEB-INF");
		//   /D:/apache-tomcat-7.0.73/webapps/tqqjst/
		path = path.substring(0,index);
		//   //D:\apache-tomcat-7.0.73\webapps\tqqjst
		path = new File(path).getAbsolutePath();
		//文件存储路径
		path = path + "\\map\\"+name+".kml";
		
		//文件写出
		try {
			FileOutputStream fos = new FileOutputStream(new File(path));
			fos.write("<Document>\r\n".getBytes());
			fos.write("<Folder>\r\n".getBytes());
			Test t = null;
			int z = 0;
			for (int i = 0; i < list.size(); i++) {
				t = list.get(i);
				
				if(Double.parseDouble(t.getValue())>30){
					z = 4;
				} else if(Double.parseDouble(t.getValue()) > 20){
					z = 3;
				} else if(Double.parseDouble(t.getValue()) > 10){
					z = 2;
				} else {
					z = 1;
				}
				/*if(Double.parseDouble(t.getValue())<-2){
					z = 1;
				} else if(Double.parseDouble(t.getValue()) <= 10){
					z = 2;
				} else if(Double.parseDouble(t.getValue()) <= 20){
					z = 3;
				} else if(Double.parseDouble(t.getValue()) <= 30){
					z = 4;
				} else {
					z = 5;
				}*/
				//该行需要自行设定热度范围time
				for (int j = 0; j < z; j++) {
					String str = "<Placemark id=\""+i+j+"\">";
					fos.write(str.getBytes());
					str = "<Point><coordinates>"+list.get(i).getX()+","+list.get(i).getY()+"</coordinates></Point>\r\n";
					fos.write(str.getBytes());
					fos.write("</Placemark>\r\n".getBytes());
				}
			}
			fos.write("</Folder>\r\n".getBytes());
			fos.write("</Document>\r\n".getBytes());
			fos.close();
			return true;
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	/**
	 * 生成geojson文件，作为经纬度数据源
	 * @param name 文件名字，不需要添加后缀名，自动补充为.geojson
	 * @param list 数据集合
	 * @return
	 */
	public static boolean WriteGEOJSON(String name,List<Test> list){
		if(list.isEmpty()){
			return false;
		}
		//获取绝对路径
		//   /D:/apache-tomcat-7.0.73/webapps/tqqjst/WEB-INF/classes/
		String path = WriteCoor.class.getClassLoader().getResource("").getFile().toString();
		int index = path.indexOf("WEB-INF");
		//   /D:/apache-tomcat-7.0.73/webapps/tqqjst/
		path = path.substring(0,index);
		//   //D:\apache-tomcat-7.0.73\webapps\tqqjst
		path = new File(path).getAbsolutePath();
		//文件存储路径
		path = path + "\\map\\county\\"+name+".geojson";
		path = path.replace("%20", " ");
		File f = new File(path);
		if(f.exists()){
			//如果之前存在，则先删除
			f.delete();
		}
		//文件写出
		try {
			OutputStreamWriter fos = new OutputStreamWriter(new FileOutputStream(f),"utf-8");
			String s  = "{\"type\": \"FeatureCollection\",\"features\": [\r\n";
			fos.write(s);
			String str = "";
			Test t = null;
			DecimalFormat df = new DecimalFormat("0.00000");
			for (int i = 0; i < list.size()-1; i++) {
				t = list.get(i);
				t.setX(df.format(Double.parseDouble(t.getX())+0.00523)+"");//横坐标纠偏
				t.setY(df.format(Double.parseDouble(t.getY())-0.00359)+"");//纵坐标纠偏
				t.setValue(t.getValue().replace("	", ""));
				t.setValue(t.getValue().replace("\\", ""));
				//每个点的格式
				str = "{\"type\": \"Feature\",\"properties\": {\"name\":\""+t.getValue()+
						"\",\"tqlx\":\""+t.getTemp1()+"\",\"tqno\":\""+t.getTemp2()+"\",\"value\":\""+t.getTemp3()+"\"}," +
						"\"geometry\": {\"type\": \"Point\",\"coordinates\": ["+t.getX()+","+
						t.getY()+"]}},\r\n";
				fos.write(str);
			}
			//最后一组数据不需要逗号，提出来额外输出
			t = list.get(list.size()-1);
			t.setX(df.format(Double.parseDouble(t.getX())+0.00523)+"");
			t.setY(df.format(Double.parseDouble(t.getY())-0.00359)+"");
			t.setValue(t.getValue().replace("	", ""));
			t.setValue(t.getValue().replace("\\", ""));
			//每个点的格式
			str = "{\"type\": \"Feature\",\"properties\": {\"name\":\""+t.getValue()+
					"\",\"tqlx\":\""+t.getTemp1()+"\",\"tqno\":\""+t.getTemp2()+"\",\"value\":\""+t.getTemp3()+"\"}," +
					"\"geometry\": {\"type\": \"Point\",\"coordinates\": ["+t.getX()+","+
					t.getY()+"]}}\r\n";
			fos.write(str);
			fos.write("]}\r\n");
			fos.close();
			return true;
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	/**
	 * 将验证码写入sryzm.txt文件
	 * @param name 文件名字，不需要添加后缀名，自动补充为.geojson
	 * @param list 数据集合
	 * @return
	 */
	public static boolean writeYzm(String yzm){
		//获取绝对路径
		//   /D:/apache-tomcat-7.0.73/webapps/tqqjst/WEB-INF/classes/
		String path = WriteCoor.class.getClassLoader().getResource("").getFile().toString();
		int index = path.indexOf("WEB-INF");
		//   /D:/apache-tomcat-7.0.73/webapps/tqqjst/
		path = path.substring(0,index);
		//   //D:\apache-tomcat-7.0.73\webapps\tqqjst
		path = new File(path).getAbsolutePath();
		//文件存储路径
		path = path + "\\sryzm.txt";
		//写死
		//File f = new File(path);
		File f = new File("E://Apache Software Foundation//Tomcat 8.0//webapps//tqqjst//sryzm.txt");
		if(f.exists()){
			//如果之前存在，则先删除
			f.delete();
		}
		//文件写出
		try {
			FileOutputStream fos = new FileOutputStream(f);
			fos.write(yzm.getBytes());
			fos.close();
			return true;
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
	}
	

}
