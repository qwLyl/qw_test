package com.zckj.demo.bean.Ny;

import com.alibaba.excel.annotation.ExcelProperty;

// 套餐实体类
public class Ads_ny_meal {
    @ExcelProperty(value = "套餐编号", index = 0)
    private String meal_no; //套餐编号

    @ExcelProperty(value = "套餐类型", index = 1)
    private String meal_type; //套餐类型

    @ExcelProperty(value = "电压等级", index = 2)
    private String dydj; // 电压等级

    @ExcelProperty(value = "用户类型", index = 3)
    private String count_type; // 用户类型

    @ExcelProperty(value = "城乡类别", index = 4)
    private String urban_rural_typ_nm; //  城乡类别

    @ExcelProperty(value = "用户分类", index = 5)
    private String cons_typ_nm; // 用户分类

    @ExcelProperty(value = "用电类别", index = 6)
    private String elec_typ_nm; // 用电类别

    @ExcelProperty(value = "行业分类", index = 7)
    private String indust_typ_nm; // 行业分类

    @ExcelProperty(value = "运行容量", index = 8)
    private String run_cap; // 运行容量

    @ExcelProperty(value = "状态", index = 9)
    private String state; // 状态

    @ExcelProperty(value = "内容", index = 10)
    private String content; // 内容

    @Override
    public String toString() {
        return "Ads_ny_meal{" +
                "meal_no='" + meal_no + '\'' +
                ", meal_type='" + meal_type + '\'' +
                ", dydj='" + dydj + '\'' +
                ", count_type='" + count_type + '\'' +
                ", urban_rural_typ_nm='" + urban_rural_typ_nm + '\'' +
                ", cons_typ_nm='" + cons_typ_nm + '\'' +
                ", elec_typ_nm='" + elec_typ_nm + '\'' +
                ", indust_typ_nm='" + indust_typ_nm + '\'' +
                ", run_cap='" + run_cap + '\'' +
                ", state='" + state + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    public String getMeal_no() {
        return meal_no;
    }

    public void setMeal_no(String meal_no) {
        this.meal_no = meal_no;
    }

    public String getMeal_type() {
        return meal_type;
    }

    public void setMeal_type(String meal_type) {
        this.meal_type = meal_type;
    }

    public String getDydj() {
        return dydj;
    }

    public void setDydj(String dydj) {
        this.dydj = dydj;
    }

    public String getCount_type() {
        return count_type;
    }

    public void setCount_type(String count_type) {
        this.count_type = count_type;
    }

    public String getUrban_rural_typ_nm() {
        return urban_rural_typ_nm;
    }

    public void setUrban_rural_typ_nm(String urban_rural_typ_nm) {
        this.urban_rural_typ_nm = urban_rural_typ_nm;
    }

    public String getCons_typ_nm() {
        return cons_typ_nm;
    }

    public void setCons_typ_nm(String cons_typ_nm) {
        this.cons_typ_nm = cons_typ_nm;
    }

    public String getElec_typ_nm() {
        return elec_typ_nm;
    }

    public void setElec_typ_nm(String elec_typ_nm) {
        this.elec_typ_nm = elec_typ_nm;
    }

    public String getIndust_typ_nm() {
        return indust_typ_nm;
    }

    public void setIndust_typ_nm(String indust_typ_nm) {
        this.indust_typ_nm = indust_typ_nm;
    }

    public String getRun_cap() {
        return run_cap;
    }

    public void setRun_cap(String run_cap) {
        this.run_cap = run_cap;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
