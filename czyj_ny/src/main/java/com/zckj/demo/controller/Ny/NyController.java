package com.zckj.demo.controller.Ny;

import com.alibaba.excel.EasyExcel;
import com.github.pagehelper.PageInfo;
import com.zckj.demo.GetPage.SengMessage;
import com.zckj.demo.bean.Ny.*;
import com.zckj.demo.common.Result;
import com.zckj.demo.common.utils.Ads_uploadListener;
import com.zckj.demo.login.UserLogin;
import com.zckj.demo.service.Ny.NyService;
import net.sf.json.JSONArray;
import org.apache.commons.httpclient.HttpClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static com.zckj.demo.login.UserLogin.st;

@Controller
@RequestMapping("/ny")
public class NyController {
    @Autowired
    private NyService nyService;

    // 行业分类
    @RequestMapping(value = "Select_indust_info",method =RequestMethod.GET)
    @ResponseBody
    public String Select_indust_info(HttpServletRequest request, HttpServletResponse response, User_info user_info)throws IOException{
        List<User_info> list=nyService.Select_indust_info(user_info);
        JSONArray json = JSONArray.fromObject(list);
        return json.toString();
    }

    // 行业分类
    @RequestMapping(value = "Select_list_info",method =RequestMethod.GET)
    @ResponseBody
    public String Select_list_info(HttpServletRequest request, HttpServletResponse response, User_info user_info)throws IOException{
        List<User_info> list=nyService.Select_list_info(user_info);
        JSONArray json = JSONArray.fromObject(list);
        return json.toString();
    }

    // 业务类型下拉框查询
    @RequestMapping(value = "Select_yekuang_busi",method =RequestMethod.GET)
    @ResponseBody
    public String Select_yekuang_busi(HttpServletRequest request, HttpServletResponse response)throws IOException{
        List<User_info> list=nyService.Select_yekuang_busi();
        JSONArray json = JSONArray.fromObject(list);
        return json.toString();
    }

    //用户数，短信，推荐，历史短信饼图展示
    @RequestMapping(value = "Select_leftTop_Zj",method =RequestMethod.GET)
    @ResponseBody
    public String Select_leftTop_Zj(HttpServletRequest request, HttpServletResponse response, Ads_ny_sum_number ads_ny_sum_number)throws IOException{
        List<Ads_ny_sum_number> list=nyService.Select_leftTop_Zj(ads_ny_sum_number);
        JSONArray json = JSONArray.fromObject(list);
        return json.toString();
    }

    //日短信饼图展示
    @RequestMapping(value = "Select_leftTop_Zj_d",method =RequestMethod.GET)
    @ResponseBody
    public String Select_leftTop_Zj_d(HttpServletRequest request, HttpServletResponse response, Ads_ny_sum_number ads_ny_sum_number)throws IOException{
        List<Ads_ny_sum_number> list=nyService.Select_leftTop_Zj_d(ads_ny_sum_number);
        JSONArray json = JSONArray.fromObject(list);
        return json.toString();
    }

    // 日短信柱状图
    @RequestMapping(value = "Select_bodyTop",method =RequestMethod.GET)
    @ResponseBody
    public String Select_bodyTop(HttpServletRequest request, HttpServletResponse response, Ads_ny_sum_number ads_ny_sum_number)throws IOException{
        List<Ads_ny_sum_number> list=nyService.Select_bodyTop(ads_ny_sum_number);
        JSONArray json = JSONArray.fromObject(list);
        return json.toString();
    }

    //日短信推到前30天的单位简称总查询
    @RequestMapping(value = "Select_rightTop",method =RequestMethod.GET)
    @ResponseBody
    public String Select_rightTop(HttpServletRequest request, HttpServletResponse response, Ads_ny_sum_number ads_ny_sum_number)throws IOException{
        List<Ads_ny_sum_number> list=nyService.Select_rightTop(ads_ny_sum_number);
        JSONArray json = JSONArray.fromObject(list);
        return json.toString();
    }

    //日短信推到前30天的赋值查询
    @RequestMapping(value = "Select_rightTop_fz",method =RequestMethod.GET)
    @ResponseBody
    public String Select_rightTop_fz(HttpServletRequest request, HttpServletResponse response, Ads_ny_sum_number ads_ny_sum_number)throws IOException{
        List<Ads_ny_sum_number> list=nyService.Select_rightTop_fz(ads_ny_sum_number);
        JSONArray json = JSONArray.fromObject(list);
        return json.toString();
    }

    // 推荐套餐详情
    @RequestMapping(value = "Select_leftFoot",method =RequestMethod.GET)
    @ResponseBody
    public String Select_leftFoot(HttpServletRequest request, HttpServletResponse response)throws IOException{
        List<Ads_ny_meal> list=nyService.Select_leftFoot();
        JSONArray json = JSONArray.fromObject(list);
        return json.toString();
    }

    // 新装用户月柱状图
    @RequestMapping(value = "Select_bodyFoot",method =RequestMethod.GET)
    @ResponseBody
    public String Select_bodyFoot(HttpServletRequest request, HttpServletResponse response, Ads_ny_sum_number ads_ny_sum_number)throws IOException{
        List<Ads_ny_sum_number> list=nyService.Select_bodyFoot(ads_ny_sum_number);
        JSONArray json = JSONArray.fromObject(list);
        return json.toString();
    }

    // 每日短信发送排名前3的供电所信息
    @RequestMapping(value = "Select_rightFoot",method =RequestMethod.GET)
    @ResponseBody
    public String Select_rightFoot(HttpServletRequest request, HttpServletResponse response, Ads_ny_sum_number ads_ny_sum_number)throws IOException{
        List<Ads_ny_sum_number> list=nyService.Select_rightFoot(ads_ny_sum_number);
        JSONArray json = JSONArray.fromObject(list);
        return json.toString();
    }

    // 套餐详情 城乡类别
    @RequestMapping(value = "Select_taoCan_gAL_urban",method =RequestMethod.GET)
    @ResponseBody
    public String Select_taoCan_gAL_urban(HttpServletRequest request, HttpServletResponse response)throws IOException{
        List<User_info> list=nyService.Select_taoCan_gAL_urban();
        JSONArray json = JSONArray.fromObject(list);
        return json.toString();
    }

    // 套餐详情 用户分类
    @RequestMapping(value = "Select_taoCan_gAL_cons",method =RequestMethod.GET)
    @ResponseBody
    public String Select_taoCan_gAL_cons(HttpServletRequest request, HttpServletResponse response)throws IOException{
        List<User_info> list=nyService.Select_taoCan_gAL_cons();
        JSONArray json = JSONArray.fromObject(list);
        return json.toString();
    }

    // 套餐详情 用电类别
    @RequestMapping(value = "Select_taoCan_gAL_elec",method =RequestMethod.GET)
    @ResponseBody
    public String Select_taoCan_gAL_elec(HttpServletRequest request, HttpServletResponse response)throws IOException{
        List<User_info> list=nyService.Select_taoCan_gAL_elec();
        JSONArray json = JSONArray.fromObject(list);
        return json.toString();
    }

    // 套餐详情页面  查询
    @RequestMapping(value = "Select_taoCan_All",method =RequestMethod.GET)
    @ResponseBody
    public String Select_taoCan_All(HttpServletRequest request, HttpServletResponse response, Ads_ny_meal ads_ny_meal)throws IOException{
        List<Ads_ny_meal> list=nyService.Select_taoCan_All(ads_ny_meal);
        JSONArray json = JSONArray.fromObject(list);
        return json.toString();
    }

    // 套餐详情页面  修改
    @RequestMapping(value = "Select_taoCan_Alter")
    @ResponseBody
    public Result Select_taoCan_Alter(@RequestBody Ads_ny_meal ads_ny_meal)throws IOException{
        Result result = nyService.Select_taoCan_Alter(ads_ny_meal);
        return result;
    }

    // 套餐详情页面 删除
    @RequestMapping(value = "Select_taoCan_Delete")
    @ResponseBody
    public Result Select_taoCan_Delete(@RequestBody Ads_ny_meal ads_ny_meal)throws IOException{
        Result result = nyService.Select_taoCan_Delete(ads_ny_meal);
        return result;
    }

    // 套餐详情页面  插入
    @RequestMapping(value = "InsertTaocan")
    @ResponseBody
    public Result InsertTaocan( @RequestBody Ads_ny_meal ads_ny_meal)throws IOException{
        Result result  = nyService.InsertTaocan(ads_ny_meal);
        return result;
    }

    // 套餐详情页面  导入
    @PostMapping("/upload")
    @ResponseBody
    public String upload(MultipartFile file) throws IOException {
        // Excel读入     添加Sheet（表单）
        EasyExcel.read(file.getInputStream(), Ads_ny_meal.class, new Ads_uploadListener(nyService)).sheet().doRead();  //异步读取,在监听器中进行数据处理
        return "success";
    }

    //  存量用户查询
    @ResponseBody
    @RequestMapping("/Select_shichang")
    public PageInfo Select_shichang(HttpServletRequest request, HttpServletResponse response,Integer pageNum, Integer pageSize,String indust_typ_nm_t,String org_no,String elec_typ_nm,String indust_typ_nm,String stDate)throws IOException {
        return nyService.Select_shichang(pageNum,pageSize,indust_typ_nm_t,org_no,elec_typ_nm,indust_typ_nm,stDate);
    }

    // 新装查询
    @ResponseBody
    @RequestMapping("/Select_yekuang")
    public PageInfo Select_yekuang(HttpServletRequest request, HttpServletResponse response,Integer pageNum, Integer pageSize,String indust_typ_nm_t,String org_no,String busi_app_typ_nm,String elec_typ_nm,String indust_typ_nm,String stDate,String edDate)throws IOException {
        return nyService.Select_yekuang(pageNum,pageSize,indust_typ_nm_t,org_no,busi_app_typ_nm,elec_typ_nm,indust_typ_nm,stDate,edDate);
    }

    // 短信用户查询
    @ResponseBody
    @RequestMapping("/Select_duanxi")
    public PageInfo Select_duanxi(HttpServletRequest request, HttpServletResponse response,Integer pageNum, Integer pageSize,String indust_typ_nm_t,String org_no,String busi_app_typ_nm,String elec_typ_nm,String indust_typ_nm,String user_typ,String stDate,String edDate)throws IOException {

        if("新增用户".equals(user_typ)){
            return nyService.Select_yekuang(pageNum,pageSize,indust_typ_nm_t,org_no,busi_app_typ_nm,elec_typ_nm,indust_typ_nm,stDate,edDate);
        }else {
            return nyService.Select_shichang(pageNum,pageSize,indust_typ_nm_t,org_no,elec_typ_nm,indust_typ_nm,stDate);
        }

    }

    // 短信用户详情
    @ResponseBody
    @RequestMapping("/Select_duanxin_yh")
    public String Select_duanxin_yh(HttpServletRequest request, HttpServletResponse response,String cons_no,String user_typ)throws IOException {
        List<User_info> list = new ArrayList<User_info>();

        if("新增用户".equals(user_typ)){
            list = nyService.Select_duanxin_yk(cons_no);
        }else {
            list = nyService.Select_duanxin_sc(cons_no);
        }
        JSONArray json = JSONArray.fromObject(list);
        return json.toString();
    }

    // 需要发送短信的用户
    List<User_info> user_infos = new ArrayList<User_info>();

    @RequestMapping(value = "Select_duanxi_fs")
    @ResponseBody
    public void Select_duanxi_fs(@RequestBody List<User_info> user_info)throws IOException {
        user_infos = user_info;
    }

        // 短信发送
    @RequestMapping(value = "Select_duanxi_fs1")
    @ResponseBody
    public void Select_duanxi_fs(@RequestBody List<Ads_ny_meal> ads_ny_meal, String textarea1, String message_org_no, String message_cons_nm, String message_phone, String message_time,String message_org_nm)throws IOException{
        ads_ny_message ads_ny_message = nyService.selectMessage_id(); // 获取短信最大id  短信信息
        ads_ny_userNews ads_ny_userNews = new ads_ny_userNews() ;

        if(ads_ny_message == null){
            ads_ny_message.setMessage_no("1");
        }

        int i =0;

        // 发送短信
        for(User_info user : user_infos){
            String  text = textarea1;
            String phone = user.getFst_tel();

            HttpClient client=new HttpClient();
            UserLogin userLogin=new UserLogin();
            client=userLogin.login(client);
            String s= SengMessage.send(client,st,text,phone);
            i++;
        }

        for(User_info user : user_infos){
            // 给短信插入赋值
            ads_ny_message.setMessage_no(String.valueOf(Integer.parseInt(ads_ny_message.getMessage_no())+1));
            ads_ny_message.setMessage_content(textarea1);
            ads_ny_message.setMessage_num(String.valueOf(user_infos.size()));
            ads_ny_message.setMessage_time(message_time);
            ads_ny_message.setMessage_cons_nm(message_cons_nm);
            ads_ny_message.setMessage_org_nm(message_org_nm);
            ads_ny_message.setMessage_org_no(message_org_no);
            ads_ny_message.setMessage_seccuse(String.valueOf(i));
            ads_ny_message.setMessage_rq((message_time.substring(0,10)).replaceAll(" ",""));// 获取年月日
            ads_ny_message.setMessage_phone(message_phone);

            // 短信用户插入赋值
            for(Ads_ny_meal ny_meal : ads_ny_meal){
                ads_ny_userNews.setUserNews_meal_no(ny_meal.getMeal_no());
                ads_ny_userNews.setUserNews_message_no(ads_ny_message.getMessage_no());
                ads_ny_userNews.setUserNews_user_no(user.getCons_no());

                nyService.InsertUserNews(ads_ny_userNews);
            }
            nyService.InsertMessage(ads_ny_message);
        }




    }

}
