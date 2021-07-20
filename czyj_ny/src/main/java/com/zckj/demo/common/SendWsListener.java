package com.zckj.demo.common;


/*import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.forwardedUrl;*/

import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/*import com.zckj.Tq.bean.Tq_in_ddyyh_day;
import com.zckj.Tq.bean.Tq_in_ddyyh_month;
import com.zckj.Tq.bean.Tq_in_ydy_month;
import com.zckj.controller.TqController;
import com.zckj.service.TqService;*/


@WebListener
public class SendWsListener implements ServletContextListener {



	
    @Override
    public void contextDestroyed(ServletContextEvent arg0) {

    }

    @Override
    public void contextInitialized(ServletContextEvent e) {
    	
    	WebApplicationContextUtils.getRequiredWebApplicationContext(e.getServletContext())
		.getAutowireCapableBeanFactory().autowireBean(this);


         /* ----------------每月任务 ----------------
         * 启动服务器后，每月1号7时开始执行任务
         */
        Date sendDate = new Date();
        Timer mTimer = new Timer();

        mTimer.schedule(new TimerTask() {
            @Override
            public void run() {
                Calendar c = Calendar.getInstance();
                int day = c.get(Calendar.DAY_OF_MONTH);
                int hour = c.get(Calendar.HOUR_OF_DAY);
                int min = c.get(Calendar.MINUTE);
                
            if(hour==7)
                {        
                	
                	SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd"); 
                	SimpleDateFormat af = new SimpleDateFormat("yyyy-MM"); 
                	System.out.println(df.format(new Date()));
                	
						System.out.println("开始");
						/*ddyyh_day(tgService.selectTqyhdbMaxRqdate(),df.format(new Date()));
						getYdy_month(tgService.selectTqdyMaxRqdate_new(),af.format(new Date()));
						getYdl_month(tgService.selectTqdlMaxRqdate_new(),af.format(new Date()));
						getddy_month(tgService.selectTqyhdbMaxRqdate(),af.format(new Date()));
						getYgl_month(tgService.selectTqglMaxRqdate_new(),af.format(new Date()));*/
						
                	
                }

            }
        }, sendDate,59 * 60 * 1000);// 每小时执行一次检查

    }
    
	public List<String> getEndDay(String beginDate,String endDate) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date dBegin = sdf.parse(beginDate);
        Date dEnd = sdf.parse(endDate);
        List<String> datas = findDates(dBegin, dEnd);
        return datas;
    }
public List<String> findDates(Date dBegin, Date dEnd){
		  List<String> lDate = new ArrayList<String>();
		  SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
		  lDate.add(sd.format(dBegin));
		  Calendar calBegin = Calendar.getInstance();
		  // 使用给定的 Date 设置此 Calendar 的时间
		  calBegin.setTime(dBegin);
		  Calendar calEnd = Calendar.getInstance();
		  // 使用给定的 Date 设置此 Calendar 的时间
		  calEnd.setTime(dEnd);
		  // 测试此日期是否在指定日期之后
		  while (dEnd.after(calBegin.getTime()))
		  {
			   // 根据日历的规则，为给定的日历字段添加或减去指定的时间量
			   calBegin.add(Calendar.DAY_OF_MONTH, 1);
			   lDate.add(sd.format(calBegin.getTime()));
		  }
		  return lDate;
	 }

public List<String> getEndMon(String beginDate,String endDate) throws ParseException {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
    Date dBegin = sdf.parse(beginDate);
    Date dEnd = sdf.parse(endDate);
    List<String> datas = findMons(dBegin, dEnd);
    return datas;
}
public List<String> findMons(Date dBegin, Date dEnd){
	  List<String> lDate = new ArrayList<String>();
	  SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM");
	  lDate.add(sd.format(dBegin));
	  Calendar calBegin = Calendar.getInstance();
	  // 使用给定的 Date 设置此 Calendar 的时间
	  calBegin.setTime(dBegin);
	  Calendar calEnd = Calendar.getInstance();
	  // 使用给定的 Date 设置此 Calendar 的时间
	  calEnd.setTime(dEnd);
	  // 测试此日期是否在指定日期之后
	  while (dEnd.after(calBegin.getTime()))
	  {
		   // 根据日历的规则，为给定的日历字段添加或减去指定的时间量
		   calBegin.add(Calendar.MONTH, 1);
		   lDate.add(sd.format(calBegin.getTime()));
	  }
	  return lDate;
 }


/*     private void ddyyh_day(String b,String e) {
    	 System.out.println("进来了");
    	 List<String> rqdate = null ;
     	*//*if(tgService.selectnewdymaxRqdate()==null){
     		try {
					 rqdate=getEndDay(tgService.selectddyyhminRqdate(), tgService.selectddyyhMaxRqdate());
					
				} catch (ParseException e) {
					
					e.printStackTrace();
				}
     	}else if(tgService.selectnewdymaxRqdate()!=null){
     		try {
					 rqdate=getEndDay(tgService.selectnewdymaxRqdate(), tgService.selectddyyhMaxRqdate());
				} catch (ParseException e) {
					
					e.printStackTrace();
				}
     	}*//*
    	 try {
			rqdate=getEndDay(b, e);
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
     	Tq_in_ddyyh_day tq_in_ddyyh_day=new Tq_in_ddyyh_day();
     	for (int i = 0; i <rqdate.size() ; i++) {
     		System.out.println("开始："+i);
     		tq_in_ddyyh_day=null;
     		tgService.deleteddyday(rqdate.get(i));
     		List<Tq_in_ddyyh_day>  ddyyh=tgService.selectddyyh(rqdate.get(i));
     		for (int j = 0; j < ddyyh.size(); j++) {
     			tq_in_ddyyh_day=ddyyh.get(j);
     			tgService.insertddyday(tq_in_ddyyh_day);
				}
     		
				System.out.println(rqdate.get(i)+"ddyyh插入成功");
				
				
			}
     	System.out.println("ddyyh插入成功");
     }
     
     
 //月电压插入数据
     
     public void getYdy_month(String dBegin,String dEnd) {
    		List<String> rqdate = null ;
    		try {
    			rqdate=getEndMon(dBegin, dEnd);
    		} catch (ParseException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}
    		Tq_in_ydy_month tq_in_ydy_month=new Tq_in_ydy_month();
    		for (int i = 0; i <rqdate.size() ; i++) {
    			tq_in_ydy_month=null;
    			tgService.deletedYdy_month(rqdate.get(i));
    			List<Tq_in_ydy_month>  ydy=tgService.selectydy_month(rqdate.get(i));
    			for (int j = 0; j < ydy.size(); j++) {
    				tq_in_ydy_month=ydy.get(j);
    				tgService.insertYdy_month(tq_in_ydy_month);
    			}
    			
    			System.out.println(rqdate.get(i)+"ydy_month插入成功");
    			
    			
    		}
    		System.out.println("ydy_month插入成功");	
    	}
     
 //月用户电表插入数据
     public void getddy_month(String dBegin,String dEnd) {
    		List<String> rqdate = null ;  
    		try {
    			rqdate=getEndMon(dBegin, dEnd);
    		} catch (ParseException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}
    		Tq_in_ddyyh_month tq_in_ddyyh_month=new Tq_in_ddyyh_month();
    		for (int i = 0; i <rqdate.size() ; i++) {
    			tq_in_ddyyh_month=null;
    			tgService.deleteddy_month(rqdate.get(i));
    			List<Tq_in_ddyyh_month>  ddyyh=tgService.selectddyyh_month(rqdate.get(i));
    			for (int j = 0; j < ddyyh.size(); j++) {
    				tq_in_ddyyh_month=ddyyh.get(j);
    				tgService.insertddy_month(tq_in_ddyyh_month);
    			}
    			
    			System.out.println(rqdate.get(i)+"ddyyh_month插入成功");
    			
    			
    		}
    		System.out.println("ddyyh_month插入成功");	
    	}  
     
  //月电流插入数据
     public void getYdl_month(String dBegin,String dEnd) {
    		List<String> rqdate = null ;
    		try {
    			rqdate=getEndMon(dBegin, dEnd);
    		} catch (ParseException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}
    		Tq_in_ydy_month tq_in_ydl_month=new Tq_in_ydy_month();
    		for (int i = 0; i <rqdate.size() ; i++) {
    			tq_in_ydl_month=null;
    			tgService.deletedYdl_month(rqdate.get(i));
    			List<Tq_in_ydy_month>  ydl=tgService.selectydl_month(rqdate.get(i));
    			for (int j = 0; j < ydl.size(); j++) {
    				tq_in_ydl_month=ydl.get(j);
    				tgService.insertYdl_month(tq_in_ydl_month);
    			}
    			
    			System.out.println(rqdate.get(i)+"ydl_month插入成功");
    			
    			
    		}
    		System.out.println("ydl_month插入成功");	
    	}    
     
 
   //月功率数据插入
     public void getYgl_month(String dBegin,String dEnd) {
     	List<String> rqdate = null ;
     	try {
     		rqdate=getEndMon(dBegin, dEnd);
     	} catch (ParseException e) {
     		// TODO Auto-generated catch block
     		e.printStackTrace();
     	}
     	Tq_in_ydy_month tq_in_ygl_month=new Tq_in_ydy_month();
     	for (int i = 0; i <rqdate.size() ; i++) {
     		tq_in_ygl_month=null;
     		tgService.deletedYgl_month(rqdate.get(i));
     		List<Tq_in_ydy_month>  ygl=tgService.selectygl_month(rqdate.get(i));
     		for (int j = 0; j < ygl.size(); j++) {
     			tq_in_ygl_month=ygl.get(j);
     			tgService.insertYgl_month(tq_in_ygl_month);
     		}
     		
     		System.out.println(rqdate.get(i)+"ygl_month插入成功");
     		
     		
     	}
     	System.out.println("ygl_month插入成功");	
     }     
@Autowired
private TqService tgService;*/

}