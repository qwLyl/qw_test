package com.zckj.demo.common;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TimeUtils {
	/**
	 * 两日期天数差,跨年算就不对了
	 * @param 小日期
	 * @param 大日期
	 * @param 时间格式
	 * @return 相差天数
	 */
	@Deprecated
	public static int difOfDay(String ksrq, String jsrq,String timetype) {
		SimpleDateFormat sdf = new SimpleDateFormat(timetype);
		try {
			Date ks = sdf.parse(ksrq);
			Date js = sdf.parse(jsrq);
			Calendar aCalendar = Calendar.getInstance();
		    aCalendar.setTime(ks);
		    int day1 = aCalendar.get(Calendar.DAY_OF_YEAR);
		    aCalendar.setTime(js);
		    int day2 = aCalendar.get(Calendar.DAY_OF_YEAR);
		    return day2 - day1;
		} catch (ParseException e) {
			e.printStackTrace();
			return -1;
		}
	}
	 /**  
     * 计算两个日期之间相差的天数  
     * @param smdate 较小的时间 
     * @param bdate  较大的时间 
     * @return 相差天数 
     * @throws ParseException  
     */    
	public static int daysBetween(String smdate,String bdate,String timetype) {  
        SimpleDateFormat sdf=new SimpleDateFormat(timetype);  
        Calendar cal = Calendar.getInstance(); 
        try {
        	cal.setTime(sdf.parse(smdate));    
        	long time1 = cal.getTimeInMillis();                 
        	cal.setTime(sdf.parse(bdate));    
        	long time2 = cal.getTimeInMillis();         
        	long between_days=(time2-time1)/(1000*3600*24);  
        	
        	return Integer.parseInt(String.valueOf(between_days));     
		} catch (Exception e) {
			System.out.println("计算两天之差出现错误");
			return 0;
		}
    }  
	/**
	 * 将时间推移一定的单位
	 * @param 时间字符串
	 * @param 单位数量
	 * @param 时间格式
	 * @param type 推移的时间单位
	 * @return
	 */
	public static String rqfomat(String rq,int i,String rqtype,String type){
		SimpleDateFormat ff = new SimpleDateFormat(rqtype);
		try {
			Date date = ff.parse(rq);
			Calendar cal = Calendar.getInstance();
			cal.setTime(date);
			if(type.equals("year")){
				cal.add(Calendar.YEAR, i);
			}
			if(type.equals("month")){
				cal.add(Calendar.MONTH, i);
			}
			if(type.equals("day")){
				cal.add(Calendar.DATE, i);
			}
			if(type.equals("hour")){
				cal.add(Calendar.HOUR, i);
			}
			if(type.equals("minute")){
				cal.add(Calendar.MINUTE, i);
			}
			rq = ff.format(cal.getTime());
		} catch (ParseException e) {
			e.printStackTrace();
			rq=null;
		}
		return rq;
	}
	/**
	 * 将时间格式转换
	 * @param 时间字符串
	 * @param 当前时间格式
	 * @param 目标时间格式
	 * @return 转换后的时间
	 */
	public static String format(String rq,String type,String type2){
		SimpleDateFormat ff = new SimpleDateFormat(type);
		SimpleDateFormat ff2 = new SimpleDateFormat(type2);
		try {
			rq = ff2.format(ff.parse(rq));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return rq;
	}
	/**
	 * 当字符串为null 'null' 或为空时，返回‘0’，否则返回字符串
	 * @param str
	 * @return
	 */
	public static String isnull(String str){
		if(str==null){
			return "0";
		}
		if(str.equals("")){
			return "0";
		}else if(str.equals("null")){
			return "0";
		}else{
			return str;
		}
	}
	public static String isEmpty(String str){
		if (str==null||"".equals(str)||"null".equals(str)) {
			return "0.00";
		}
		return str;
	}
	/**
	 * 获取当前年月；格式：yyyy-MM
	 * @return
	 */
	public static String getCurrentMonth(){
		Date date=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM");
		return sdf.format(date);
	}
	/**
	 * 获取上月；格式：yyyy-MM
	 * @return
	 */
	public static String getLastMonth(Date date){
		SimpleDateFormat sdf=new SimpleDateFormat("MM");
		SimpleDateFormat sdf2=new SimpleDateFormat("yyyy");
		String month=sdf.format(date);
		int currentMonth=Integer.valueOf(month);
		int year=Integer.valueOf(sdf2.format(date));
		if (currentMonth==1) {
			currentMonth=12;
			year--;
		}else{
			currentMonth--;
		}
		//如果是2到10月
		if (currentMonth>=2&&currentMonth<=10) {
			month="0"+currentMonth;
		}else {
			month=currentMonth+"";
		}
		return year+"-"+month;
	}
	public static Date dateGen(String date,String pattern){
		SimpleDateFormat sdf=new SimpleDateFormat(pattern);
		Date dateObj=null;
		try {
			dateObj=sdf.parse(date);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return dateObj;
	}
}
