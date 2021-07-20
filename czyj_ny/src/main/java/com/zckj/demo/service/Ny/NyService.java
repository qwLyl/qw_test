package com.zckj.demo.service.Ny;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zckj.demo.bean.Ny.*;
import com.zckj.demo.common.Result;
import com.zckj.demo.dao.Ny.NyDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
public class NyService {
    @Autowired
    private NyDao nyDao;

    // 行业分类
    public List<User_info>Select_indust_info(User_info user_info){
        return nyDao.Select_indust_info(user_info);
    }
    public List<User_info>Select_list_info(User_info user_info){
        return nyDao.Select_list_info(user_info);
    }

    // 业务类型下拉框查询
    public List<User_info>Select_yekuang_busi(){
        return nyDao.Select_yekuang_busi();
    }

    // 用户数，短信，推荐，历史短信饼图展示
    public List<Ads_ny_sum_number>Select_leftTop_Zj(Ads_ny_sum_number ads_ny_sum_number){
        return nyDao.Select_leftTop_Zj(ads_ny_sum_number);
    }

    // 日短信饼图展示
    public List<Ads_ny_sum_number>Select_leftTop_Zj_d(Ads_ny_sum_number ads_ny_sum_number){
        return nyDao.Select_leftTop_Zj_d(ads_ny_sum_number);
    }

    // 日短信柱状图
    public List<Ads_ny_sum_number>Select_bodyTop(Ads_ny_sum_number ads_ny_sum_number){
        return nyDao.Select_bodyTop(ads_ny_sum_number);
    }

    // 日短信推到前30天的单位简称总查询
    public List<Ads_ny_sum_number>Select_rightTop(Ads_ny_sum_number ads_ny_sum_number){
        return nyDao.Select_rightTop(ads_ny_sum_number);
    }

    // 推荐套餐详情
    public List<Ads_ny_meal>Select_leftFoot(){
        return nyDao.Select_leftFoot();
    }

    //日短信推到前30天的赋值查询
    public List<Ads_ny_sum_number>Select_rightTop_fz(Ads_ny_sum_number ads_ny_sum_number){
        return nyDao.Select_rightTop_fz(ads_ny_sum_number);
    }

    // 新装用户月柱状图
    public List<Ads_ny_sum_number>Select_bodyFoot(Ads_ny_sum_number ads_ny_sum_number){
        return nyDao.Select_bodyFoot(ads_ny_sum_number);
    }

    // 每日短信发送排名前3的供电所信息
    public List<Ads_ny_sum_number>Select_rightFoot(Ads_ny_sum_number ads_ny_sum_number){
        return nyDao.Select_rightFoot(ads_ny_sum_number);
    }

    // 套餐详情 城乡类别
    public List<User_info>Select_taoCan_gAL_urban(){
        return nyDao.Select_taoCan_gAL_urban();
    }

    // 套餐详情 用户分类
    public List<User_info>Select_taoCan_gAL_cons(){
        return nyDao.Select_taoCan_gAL_cons();
    }

    // 套餐详情 用电类别
    public List<User_info>Select_taoCan_gAL_elec(){
        return nyDao.Select_taoCan_gAL_elec();
    }

    // 套餐详情页面  查询
    public List<Ads_ny_meal>Select_taoCan_All(Ads_ny_meal ads_ny_meal){
        return nyDao.Select_taoCan_All(ads_ny_meal);
    }

    // 套餐详情页面  修改
    public Result Select_taoCan_Alter(Ads_ny_meal ads_ny_meal){
        Result Result = new Result();
        Result.init();
        try {
            String t =nyDao.Select_taoCan_Alter(ads_ny_meal);
            Result.setId("1");
        } catch (Exception e) {
            Result.setId("-1");
            Result.setInfo(e.getMessage());
        }
        return Result;
    }

    // 套餐详情页面  删除
    public Result Select_taoCan_Delete(Ads_ny_meal ads_ny_meal){
        Result Result = new Result();
        Result.init();
        try {
            nyDao.Select_taoCan_Delete(ads_ny_meal);
            Result.setId("1");
        } catch (Exception e) {
            Result.setId("-1");
            Result.setInfo(e.getMessage());
        }
        return Result;
    }

    // 套餐详情页面  插入
    public Result InsertTaocan(Ads_ny_meal ads_ny_meal){
        Result Result = new Result();
        Result.init();
        try {
            nyDao.InsertTaocan(ads_ny_meal);
            Result.setId("1");
        } catch (Exception e) {
            Result.setId("-1");
            Result.setInfo(e.getMessage());
        }
        return Result;
    }

    /**
     * 批量插入excel数据  套餐详情页面导入
     * @param ads_ny_meals
     */
    public void ads_uploadInsert(List<Ads_ny_meal> ads_ny_meals) {
        nyDao.ads_uploadInsert(ads_ny_meals);
    }


    //  存量用户查询
    public PageInfo<User_info> Select_shichang(int pageNum, int pageSize,String indust_typ_nm_t,String org_no,String elec_typ_nm,String indust_typ_nm,String stDate){
        //开启分页
        PageHelper.startPage(pageNum,pageSize);  //pageNum为页码，pageSize为页面大小
        List<User_info> List = nyDao.Select_shichang(indust_typ_nm_t,org_no,elec_typ_nm,indust_typ_nm,stDate);
        PageInfo<User_info> pageInfo = new PageInfo<User_info>(List);
        return pageInfo;
    }

    // 新装查询
    public PageInfo<User_info> Select_yekuang (int pageNum, int pageSize,String indust_typ_nm_t,String org_no,String busi_app_typ_nm,String elec_typ_nm,String indust_typ_nm,String stDate,String edDate){
        //开启分页
        PageHelper.startPage(pageNum,pageSize);  //pageNum为页码，pageSize为页面大小
        List<User_info> List = nyDao.Select_yekuang(indust_typ_nm_t,org_no,busi_app_typ_nm,elec_typ_nm,indust_typ_nm,stDate,edDate);
        PageInfo<User_info> pageInfo = new PageInfo<User_info>(List);
        return pageInfo;
    }

    // 短信查找最大id
    public ads_ny_message selectMessage_id(){
        return nyDao.selectMessage_id();
    }

    // 短信插入
    public Result InsertMessage(ads_ny_message ads_ny_message) {
        Result Result = new Result();
        Result.init();
        try
        {
            nyDao.InsertMessage(ads_ny_message);
        } catch (Exception e)
        {
            Result.setId("-1");
            Result.setInfo(e.getMessage());
        }
        return Result;
    }

    // 短信用户插入
    public Result InsertUserNews(ads_ny_userNews ads_ny_userNews) {
        Result Result = new Result();
        Result.init();
        try
        {
            nyDao.InsertUserNews(ads_ny_userNews);
        } catch (Exception e)
        {
            Result.setId("-1");
            Result.setInfo(e.getMessage());
        }
        return Result;
    }

    // 短信用户详细  查询  新增
    public List<User_info>Select_duanxin_yk(String cons_no){
        return nyDao.Select_duanxin_yk(cons_no);
    }

    // 短信用户详细  查询  存量
    public List<User_info>Select_duanxin_sc(String cons_no){
        return nyDao.Select_duanxin_sc(cons_no);
    }


}
