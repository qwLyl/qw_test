package com.zckj.demo.bean.Ny;

import java.io.Serializable;

// 业扩,新装,行业等实体类
public class User_info implements Serializable {
    //序列化时保持版本的兼容性，即在版本升级bai时反序列化仍保持对象的唯一性。
    private static final long serialVersionUID = 1L;
    private String org_nm;//供电电位、org_nm
    private String app_no;//申请编号、app_no
    private String free_app_no; // 存量的申请编号
    private String cons_no;//用户编号、cons_no
    private String cons_nm;//用户名称、cons_nm
    private String fst_tel;//联系电话、fst_tel
    private String elec_addr;//用电地址、elec_addr
    private String busi_app_typ;//业务类型编号、busi_app_typ
    private String busi_app_typ_nm;//业务类型、busi_app_typ_nm
    private String elec_typ;//用电类别编号、elec_typ
    private String elec_typ_dsc;//用电类别、elec_typ_dsc
    private String elec_typ_nm;//用电类别描述、elec_typ_dsc
    private String feed_ps_qt; // 业扩新装的电源数量
    private String sp_qt; // 业扩新装的受电点数量
    private String free_disc_dsc;//优免政策描述、free_disc_dsc
    private String owner_dt;//开户日期、owner_dt
    private String run_cap; // 运行容量
    private String cntrct_cap; // 合同容量
    private String userNews_num;// 短信条数
    private String userNews_meal_no; //套餐编号
    private String userNews_user_no;
    private String meal_type; //套餐类型;
    private String message_no;   	// 短信编号
    private String message_content;   //	短信内容
    private String message_time;      	//发送短信具体时间
    private String message_cons_nm;   //	发送短信人员名称
    private String message_org_nm ;   	//发送短信人员单位名称
    private String message_phone; // 发送人员电话
    private String cnt;
    private String typ;
    private String indust_typ_nm;
    private String indust_typ_5lvl;
    private String indust_typ_nm_more;
    private String indust_typ_dsc_1lvl;//第一行业类名
    private String msg_num;//短信发送数量
    private String xz_month;//
    private String stDate;//新装判断日期
    private String edDate;//当前日期
    private String user_typ;//用户类别
    private String urban_rural_typ_nm; // 城乡类别名称
    private String urban_rural_typ; // 城乡类别编号
    private String cons_typ_nm; // 用户分类名称
    private String cons_typ; //  用户分类编号

    @Override
    public String toString() {
        return "User_info{" +
                "org_nm='" + org_nm + '\'' +
                ", app_no='" + app_no + '\'' +
                ", free_app_no='" + free_app_no + '\'' +
                ", cons_no='" + cons_no + '\'' +
                ", cons_nm='" + cons_nm + '\'' +
                ", fst_tel='" + fst_tel + '\'' +
                ", elec_addr='" + elec_addr + '\'' +
                ", busi_app_typ='" + busi_app_typ + '\'' +
                ", busi_app_typ_nm='" + busi_app_typ_nm + '\'' +
                ", elec_typ='" + elec_typ + '\'' +
                ", elec_typ_dsc='" + elec_typ_dsc + '\'' +
                ", elec_typ_nm='" + elec_typ_nm + '\'' +
                ", feed_ps_qt='" + feed_ps_qt + '\'' +
                ", sp_qt='" + sp_qt + '\'' +
                ", free_disc_dsc='" + free_disc_dsc + '\'' +
                ", owner_dt='" + owner_dt + '\'' +
                ", run_cap='" + run_cap + '\'' +
                ", cntrct_cap='" + cntrct_cap + '\'' +
                ", userNews_num='" + userNews_num + '\'' +
                ", userNews_meal_no='" + userNews_meal_no + '\'' +
                ", userNews_user_no='" + userNews_user_no + '\'' +
                ", meal_type='" + meal_type + '\'' +
                ", message_no='" + message_no + '\'' +
                ", message_content='" + message_content + '\'' +
                ", message_time='" + message_time + '\'' +
                ", message_cons_nm='" + message_cons_nm + '\'' +
                ", message_org_nm='" + message_org_nm + '\'' +
                ", message_phone='" + message_phone + '\'' +
                ", cnt='" + cnt + '\'' +
                ", typ='" + typ + '\'' +
                ", indust_typ_nm='" + indust_typ_nm + '\'' +
                ", indust_typ_5lvl='" + indust_typ_5lvl + '\'' +
                ", indust_typ_nm_more='" + indust_typ_nm_more + '\'' +
                ", indust_typ_dsc_1lvl='" + indust_typ_dsc_1lvl + '\'' +
                ", msg_num='" + msg_num + '\'' +
                ", xz_month='" + xz_month + '\'' +
                ", stDate='" + stDate + '\'' +
                ", edDate='" + edDate + '\'' +
                ", user_typ='" + user_typ + '\'' +
                ", urban_rural_typ_nm='" + urban_rural_typ_nm + '\'' +
                ", urban_rural_typ='" + urban_rural_typ + '\'' +
                ", cons_typ_nm='" + cons_typ_nm + '\'' +
                ", cons_typ='" + cons_typ + '\'' +
                '}';
    }

    public String getMessage_phone() {
        return message_phone;
    }

    public void setMessage_phone(String message_phone) {
        this.message_phone = message_phone;
    }

    public String getUserNews_meal_no() {
        return userNews_meal_no;
    }

    public void setUserNews_meal_no(String userNews_meal_no) {
        this.userNews_meal_no = userNews_meal_no;
    }

    public String getUserNews_user_no() {
        return userNews_user_no;
    }

    public void setUserNews_user_no(String userNews_user_no) {
        this.userNews_user_no = userNews_user_no;
    }

    public String getMessage_time() {
        return message_time;
    }

    public void setMessage_time(String message_time) {
        this.message_time = message_time;
    }

    public String getMessage_cons_nm() {
        return message_cons_nm;
    }

    public void setMessage_cons_nm(String message_cons_nm) {
        this.message_cons_nm = message_cons_nm;
    }

    public String getMessage_org_nm() {
        return message_org_nm;
    }

    public void setMessage_org_nm(String message_org_nm) {
        this.message_org_nm = message_org_nm;
    }

    public String getMeal_type() {
        return meal_type;
    }

    public void setMeal_type(String meal_type) {
        this.meal_type = meal_type;
    }

    public String getMessage_no() {
        return message_no;
    }

    public void setMessage_no(String message_no) {
        this.message_no = message_no;
    }

    public String getMessage_content() {
        return message_content;
    }

    public void setMessage_content(String message_content) {
        this.message_content = message_content;
    }

    public String getUserNews_num() {
        return userNews_num;
    }

    public void setUserNews_num(String userNews_num) {
        this.userNews_num = userNews_num;
    }

    public String getRun_cap() {
        return run_cap;
    }

    public void setRun_cap(String run_cap) {
        this.run_cap = run_cap;
    }

    public String getCntrct_cap() {
        return cntrct_cap;
    }

    public void setCntrct_cap(String cntrct_cap) {
        this.cntrct_cap = cntrct_cap;
    }

    public String getFree_app_no() {
        return free_app_no;
    }

    public void setFree_app_no(String free_app_no) {
        this.free_app_no = free_app_no;
    }

    public String getFeed_ps_qt() {
        return feed_ps_qt;
    }

    public void setFeed_ps_qt(String feed_ps_qt) {
        this.feed_ps_qt = feed_ps_qt;
    }

    public String getSp_qt() {
        return sp_qt;
    }

    public void setSp_qt(String sp_qt) {
        this.sp_qt = sp_qt;
    }

    public String getApp_no() {
        return app_no;
    }

    public void setApp_no(String app_no) {
        this.app_no = app_no;
    }

    public String getFst_tel() {
        return fst_tel;
    }

    public void setFst_tel(String fst_tel) {
        this.fst_tel = fst_tel;
    }

    public String getIndust_typ_5lvl() {
        return indust_typ_5lvl;
    }

    public void setIndust_typ_5lvl(String indust_typ_5lvl) {
        this.indust_typ_5lvl = indust_typ_5lvl;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getOrg_nm() {
        return org_nm;
    }

    public void setOrg_nm(String org_nm) {
        this.org_nm = org_nm;
    }

    public String getCons_no() {
        return cons_no;
    }

    public void setCons_no(String cons_no) {
        this.cons_no = cons_no;
    }

    public String getCons_nm() {
        return cons_nm;
    }

    public void setCons_nm(String cons_nm) {
        this.cons_nm = cons_nm;
    }

    public String getElec_addr() {
        return elec_addr;
    }

    public void setElec_addr(String elec_addr) {
        this.elec_addr = elec_addr;
    }

    public String getBusi_app_typ() {
        return busi_app_typ;
    }

    public void setBusi_app_typ(String busi_app_typ) {
        this.busi_app_typ = busi_app_typ;
    }

    public String getBusi_app_typ_nm() {
        return busi_app_typ_nm;
    }

    public void setBusi_app_typ_nm(String busi_app_typ_nm) {
        this.busi_app_typ_nm = busi_app_typ_nm;
    }

    public String getElec_typ() {
        return elec_typ;
    }

    public void setElec_typ(String elec_typ) {
        this.elec_typ = elec_typ;
    }

    public String getElec_typ_dsc() {
        return elec_typ_dsc;
    }

    public void setElec_typ_dsc(String elec_typ_dsc) {
        this.elec_typ_dsc = elec_typ_dsc;
    }

    public String getElec_typ_nm() {
        return elec_typ_nm;
    }

    public void setElec_typ_nm(String elec_typ_nm) {
        this.elec_typ_nm = elec_typ_nm;
    }

    public String getOwner_dt() {
        return owner_dt;
    }

    public void setOwner_dt(String owner_dt) {
        this.owner_dt = owner_dt;
    }

    public String getCnt() {
        return cnt;
    }

    public void setCnt(String cnt) {
        this.cnt = cnt;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public String getIndust_typ_nm() {
        return indust_typ_nm;
    }

    public void setIndust_typ_nm(String indust_typ_nm) {
        this.indust_typ_nm = indust_typ_nm;
    }

    public String getIndust_typ_nm_more() {
        return indust_typ_nm_more;
    }

    public void setIndust_typ_nm_more(String indust_typ_nm_more) {
        this.indust_typ_nm_more = indust_typ_nm_more;
    }

    public String getIndust_typ_dsc_1lvl() {
        return indust_typ_dsc_1lvl;
    }

    public void setIndust_typ_dsc_1lvl(String indust_typ_dsc_1lvl) {
        this.indust_typ_dsc_1lvl = indust_typ_dsc_1lvl;
    }

    public String getMsg_num() {
        return msg_num;
    }

    public void setMsg_num(String msg_num) {
        this.msg_num = msg_num;
    }

    public String getXz_month() {
        return xz_month;
    }

    public void setXz_month(String xz_month) {
        this.xz_month = xz_month;
    }

    public String getStDate() {
        return stDate;
    }

    public void setStDate(String stDate) {
        this.stDate = stDate;
    }

    public String getEdDate() {
        return edDate;
    }

    public void setEdDate(String edDate) {
        this.edDate = edDate;
    }

    public String getFree_disc_dsc() {
        return free_disc_dsc;
    }

    public void setFree_disc_dsc(String free_disc_dsc) {
        this.free_disc_dsc = free_disc_dsc;
    }

    public String getUser_typ() {
        return user_typ;
    }

    public void setUser_typ(String user_typ) {
        this.user_typ = user_typ;
    }

    public String getUrban_rural_typ_nm() {
        return urban_rural_typ_nm;
    }

    public void setUrban_rural_typ_nm(String urban_rural_typ_nm) {
        this.urban_rural_typ_nm = urban_rural_typ_nm;
    }

    public String getUrban_rural_typ() {
        return urban_rural_typ;
    }

    public void setUrban_rural_typ(String urban_rural_typ) {
        this.urban_rural_typ = urban_rural_typ;
    }

    public String getCons_typ_nm() {
        return cons_typ_nm;
    }

    public void setCons_typ_nm(String cons_typ_nm) {
        this.cons_typ_nm = cons_typ_nm;
    }

    public String getCons_typ() {
        return cons_typ;
    }

    public void setCons_typ(String cons_typ) {
        this.cons_typ = cons_typ;
    }
}
