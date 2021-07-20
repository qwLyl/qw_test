package com.zckj.demo.common;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DataFormat {

	private DataFormat() {}
	
	/**
	 * 返回指定日期的差距指定天数的日期：例如getBeforeOneMonth("month","2017/12/12",-1),return "2017-11-12"
	 * @param type 时间域，可以为data,month,year
	 * @param time 输入日期(格式可以为yyyy/mm/dd或yyyy-mm-dd)
	 * @param value 时间跨度,之前数据用"-",之后数据用"+"
	 * @return String
	 */
	public static String getTime(String type, String time, int value){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		time = time.replace("/", "-");
		Calendar c = Calendar.getInstance();
		try {
			c.setTime(sdf.parse(time));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		switch (type) {
		case "data":
			c.add(Calendar.DATE, value);
			break;
		case "month":
			c.add(Calendar.MONTH, value);
			break;
		case "year":
			c.add(Calendar.YEAR, value);
			break;

		default:
			break;
		}
		
		return sdf.format(c.getTime());
	}
	
	/**
	 * 获取今日日期 yyyy/MM/dd
	 * @return String
	 */
	public static String getCurrentTime(){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());
		
		return sdf.format(cal.getTime());
	}
	
	/**
	 * 返回指定的前某日日期，例如返回今日日期getTime(0)，昨日日期getTime(-1)
	 * @param day
	 * @return
	 */
	public static String getTimeDay(int day){
		String time = getCurrentTime();
		time = getTime("data", time, day);
		return time;
	}
	
}
