package com.zckj.demo.bean.Ny;

// 视图展示实体类
public class Ads_ny_sum_number {
    private String stDate; // 开始时间
    private String edDate; // 结束时间
    private String rq; // 时间
    private String date_type; // 时间类型
    private String org_no; // 单位编号
    private String org_jc; // 单位简称
    private String org_nm; // 单位名称
    private String count_no; // 新装单位编号
    private String count_num; // 新装用户数
    private String fa_num; // 方案套餐数
    private String message_year_num; // 年短信发送数
    private String message_num; // 短信发送数
    private String org_typ_cd; // 总数等级

    @Override
    public String toString() {
        return "Ads_ny_sum_number{" +
                "stDate='" + stDate + '\'' +
                ", edDate='" + edDate + '\'' +
                ", rq='" + rq + '\'' +
                ", date_type='" + date_type + '\'' +
                ", org_no='" + org_no + '\'' +
                ", org_jc='" + org_jc + '\'' +
                ", org_nm='" + org_nm + '\'' +
                ", count_no='" + count_no + '\'' +
                ", count_num='" + count_num + '\'' +
                ", fa_num='" + fa_num + '\'' +
                ", message_year_num='" + message_year_num + '\'' +
                ", message_num='" + message_num + '\'' +
                ", org_typ_cd='" + org_typ_cd + '\'' +
                '}';
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

    public String getRq() {
        return rq;
    }

    public void setRq(String rq) {
        this.rq = rq;
    }

    public String getDate_type() {
        return date_type;
    }

    public void setDate_type(String date_type) {
        this.date_type = date_type;
    }

    public String getOrg_no() {
        return org_no;
    }

    public void setOrg_no(String org_no) {
        this.org_no = org_no;
    }

    public String getOrg_jc() {
        return org_jc;
    }

    public void setOrg_jc(String org_jc) {
        this.org_jc = org_jc;
    }

    public String getOrg_nm() {
        return org_nm;
    }

    public void setOrg_nm(String org_nm) {
        this.org_nm = org_nm;
    }

    public String getCount_no() {
        return count_no;
    }

    public void setCount_no(String count_no) {
        this.count_no = count_no;
    }

    public String getCount_num() {
        return count_num;
    }

    public void setCount_num(String count_num) {
        this.count_num = count_num;
    }

    public String getFa_num() {
        return fa_num;
    }

    public void setFa_num(String fa_num) {
        this.fa_num = fa_num;
    }

    public String getMessage_year_num() {
        return message_year_num;
    }

    public void setMessage_year_num(String message_year_num) {
        this.message_year_num = message_year_num;
    }

    public String getMessage_num() {
        return message_num;
    }

    public void setMessage_num(String message_num) {
        this.message_num = message_num;
    }

    public String getOrg_typ_cd() {
        return org_typ_cd;
    }

    public void setOrg_typ_cd(String org_typ_cd) {
        this.org_typ_cd = org_typ_cd;
    }
}
