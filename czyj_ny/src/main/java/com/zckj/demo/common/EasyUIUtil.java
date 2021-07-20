package com.zckj.demo.common;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * 偷懒工具
 * <p>
 * Title:EasyUIUtil
 * </p>
 * <p>
 * Description
 * </p>
 * <p>
 * Company
 * </p>
 * 
 * @author HL
 * @time 2017年7月17日上午10:04:59
 */
public class EasyUIUtil {
	/**
	 * 将list转换为EasyUi可以接收的Json格式并输出
	 * 
	 * @param response
	 * @param list
	 * @return
	 */
	public static boolean printJson(HttpServletResponse response, @SuppressWarnings("rawtypes") List list) {
		System.out.println(list);
		JSONObject json = new JSONObject();
		json.put("total", list.size());
		JSONArray j = JSONArray.fromObject(list);
		json.put("rows", j);
		response.setCharacterEncoding("UTF-8");
		PrintWriter out;
		try {
			out = response.getWriter();
			out.print(json);
			System.out.println(json);
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public static boolean printResult(HttpServletResponse response, Result result) {
		JSONObject json = new JSONObject();
		json.put("Result", result);
		response.setCharacterEncoding("UTF-8");
		PrintWriter out;
		try {
			out = response.getWriter();
			out.print(json.toString());
			System.out.println(out);
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
}
