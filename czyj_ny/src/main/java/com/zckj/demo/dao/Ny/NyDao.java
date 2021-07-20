package com.zckj.demo.dao.Ny;

import com.zckj.demo.bean.Ny.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface NyDao {

    // 行业分类
    List<User_info> Select_indust_info(User_info user_info);
    List<User_info> Select_list_info(User_info user_info);

    // 业务类型下拉框查询
    List<User_info> Select_yekuang_busi();


    // 可视化展示
    List<Ads_ny_sum_number> Select_leftTop_Zj(Ads_ny_sum_number ads_ny_sum_number);
    List<Ads_ny_sum_number> Select_leftTop_Zj_d(Ads_ny_sum_number ads_ny_sum_number);
    List<Ads_ny_sum_number> Select_bodyTop(Ads_ny_sum_number ads_ny_sum_number);
    List<Ads_ny_sum_number> Select_rightTop(Ads_ny_sum_number ads_ny_sum_number);
    List<Ads_ny_sum_number> Select_rightTop_fz(Ads_ny_sum_number ads_ny_sum_number);
    List<Ads_ny_meal> Select_leftFoot();
    List<Ads_ny_sum_number> Select_bodyFoot(Ads_ny_sum_number ads_ny_sum_number);
    List<Ads_ny_sum_number> Select_rightFoot(Ads_ny_sum_number ads_ny_sum_number);

    // 套餐详情
    List<User_info> Select_taoCan_gAL_urban();
    List<User_info> Select_taoCan_gAL_cons();
    List<User_info> Select_taoCan_gAL_elec();
    List<Ads_ny_meal> Select_taoCan_All(Ads_ny_meal ads_ny_meal);
    public String Select_taoCan_Alter(Ads_ny_meal ads_ny_meal); // 修改
    public int Select_taoCan_Delete(Ads_ny_meal ads_ny_meal); // 删除
    public int InsertTaocan(Ads_ny_meal  ads_ny_meal); // 套餐插入
    public int ads_uploadInsert(List<Ads_ny_meal> ads_ny_meals); // 套餐导入

    // 存量用户查询
    public List<User_info> Select_shichang(@Param("indust_typ_nm_t") String indust_typ_nm_t,@Param("org_no") String org_no,@Param("elec_typ_nm") String elec_typ_nm,@Param("indust_typ_nm") String indust_typ_nm,@Param("stDate") String stDate);

    //  新装查询
    public List<User_info> Select_yekuang(@Param("indust_typ_nm_t") String indust_typ_nm_t,@Param("org_no") String org_no,@Param("busi_app_typ_nm") String busi_app_typ_nm,@Param("elec_typ_nm") String elec_typ_nm,@Param("indust_typ_nm") String indust_typ_nm,@Param("stDate") String stDate,@Param("edDate") String edDate);

    // 短信查找最大id
    public ads_ny_message selectMessage_id();

    // 短信插入
    public void InsertMessage(ads_ny_message  ads_ny_message);

    // 短信用户插入 InsertUserNews
    public void InsertUserNews(ads_ny_userNews ads_ny_userNews);

    // 短信用户详细  查询  新增
    public List<User_info>Select_duanxin_yk(@Param("cons_no") String cons_no);

    // 短信用户详细  查询  存量
    public List<User_info>Select_duanxin_sc(@Param("cons_no") String cons_no);

}
