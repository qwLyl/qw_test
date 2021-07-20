package com.zckj.demo.controller.Clgl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class sunSatday {
    @SuppressWarnings("deprecation")
    public static void main(String args[]){
        SimpleDateFormat df=new SimpleDateFormat("yyyy-mm-dd");
        Date date=null;
        Calendar calendar= Calendar.getInstance();
        int year=calendar.get(Calendar.YEAR);
        String str_zl="insert into HOLIDAY_DATE (holiday_name,rq) values('周六','";
        String str_zr="insert into HOLIDAY_DATE (holiday_name,rq) values('周日','";
        try{
            date=df.parse(year+"-01-01");
            int day=date.getDay();//获取当前时间是周几（0周末，6为周六）
           // System.out.println("这年的第一天是:"+day);
            System.out.println("获取一年中的周六、周日时间");
            int startSatOffset=6-day;//判断一年的第一天隔最近的星期六有几天
            calendar.setTime(date);
            calendar.add(Calendar.YEAR,1);
            Date endTime=calendar.getTime();//结束时间
            int j=1;
            for(int i=0;i<365/7;i++){
                Date satday=df.parse(year+"-"+j+"-"+(1+startSatOffset+i*7));
                Date sunday=df.parse(year+"-"+j+"-"+(1+startSatOffset+(i*7+1)));
                //时间不能超过一年（最后一个星期六不能超过结束时间）
                if(satday.before(endTime)){
                    Date da=df.parse(year+"-"+j+"-1");
                    Calendar calendar2=Calendar.getInstance();
                    calendar2.setTime(da);
                    calendar2.add(Calendar.DAY_OF_YEAR, -1);
                   // System.out.println("这月的最后一天："+calendar2.getTime());
                    Date zui=calendar2.getTime();//当前月的最后一天
                    //当周六日超过了这月的最后一天
                    if(zui.before(satday) || zui.before(sunday)){
                        j=j+1;
                        satday=df.parse(year+"-"+j+"-"+(1+startSatOffset+i*7));//周六日期
                        sunday=df.parse(year+"-"+j+"-"+(1+startSatOffset+(i*7+1)));//周末日期

                    }
                }
               // satday.format(new Date());
                //satday.toString()    str_holiday_name
                SimpleDateFormat formatter1=new SimpleDateFormat("yyyy-MM-dd");
                String satday1=formatter1.format(satday);
                String sunday1=formatter1.format(sunday);
                System.out.println(str_zl+satday1+"');");
                System.out.println(str_zr+sunday1+"');");
            }
        }catch(ParseException e){
            e.printStackTrace();
        }
    }

}
