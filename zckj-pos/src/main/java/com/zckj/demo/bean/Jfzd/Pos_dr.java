package com.zckj.demo.bean.Jfzd;

import com.alibaba.excel.annotation.ExcelProperty;

import java.util.Date;

/**
 * 缴费终端
 */
public class Pos_dr {

    private Integer count; //缴费总额
    @ExcelProperty(value = "清算日期", index = 0)
    private String qsrq;    // 清算日期
    @ExcelProperty(value = "清算商户号", index = 1)
    private String qsshh;    // 清算商户号
    @ExcelProperty(value = "清算终端号", index = 2)
    private String qszdh;    // 清算终端号
    @ExcelProperty(value = "商户名", index = 3)
    private String shm;    // 商户名
    @ExcelProperty(value = "设备商户号", index = 4)
    private String sbshh;    // 设备商户号
    @ExcelProperty(value = "设备终端号", index = 5)
    private String posid;    // 设备终端号
    @ExcelProperty(value = "流水号", index = 6)
    private String lsh;    // 流水号
    @ExcelProperty(value = "交易时间", index = 7)
    private String jysj;    // 交易时间
    @ExcelProperty(value = "卡号", index = 8)
    private String kh;    // 卡号
    @ExcelProperty(value = "金额", index = 9)
    private Integer money;    // 金额
    @ExcelProperty(value = "用户号", index = 10)
    private String yhh;    // 用户号
    private String orgno;    //
    private String orgname;    //
    private String month;    //
    private Date createtime; // 上传时间

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getQsrq() {
        return qsrq;
    }

    public void setQsrq(String qsrq) {
        this.qsrq = qsrq;
    }

    public String getQsshh() {
        return qsshh;
    }

    public void setQsshh(String qsshh) {
        this.qsshh = qsshh;
    }

    public String getQszdh() {
        return qszdh;
    }

    public void setQszdh(String qszdh) {
        this.qszdh = qszdh;
    }

    public String getShm() {
        return shm;
    }

    public void setShm(String shm) {
        this.shm = shm;
    }

    public String getSbshh() {
        return sbshh;
    }

    public void setSbshh(String sbshh) {
        this.sbshh = sbshh;
    }

    public String getPosid() {
        return posid;
    }

    public void setPosid(String posid) {
        this.posid = posid;
    }

    public String getLsh() {
        return lsh;
    }

    public void setLsh(String lsh) {
        this.lsh = lsh;
    }

    public String getJysj() {
        return jysj;
    }

    public void setJysj(String jysj) {
        this.jysj = jysj;
    }

    public String getKh() {
        return kh;
    }

    public void setKh(String kh) {
        this.kh = kh;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public String getYhh() {
        return yhh;
    }

    public void setYhh(String yhh) {
        this.yhh = yhh;
    }

    public String getOrgno() {
        return orgno;
    }

    public void setOrgno(String orgno) {
        this.orgno = orgno;
    }

    public String getOrgname() {
        return orgname;
    }

    public void setOrgname(String orgname) {
        this.orgname = orgname;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    @Override
    public String toString() {
        return "Pos_dr{" +
                "count='" + count + '\'' +
                ", qsrq='" + qsrq + '\'' +
                ", qsshh='" + qsshh + '\'' +
                ", qszdh='" + qszdh + '\'' +
                ", shm='" + shm + '\'' +
                ", sbshh='" + sbshh + '\'' +
                ", posid='" + posid + '\'' +
                ", lsh='" + lsh + '\'' +
                ", jysj='" + jysj + '\'' +
                ", kh='" + kh + '\'' +
                ", money=" + money +
                ", yhh='" + yhh + '\'' +
                ", orgno='" + orgno + '\'' +
                ", orgname='" + orgname + '\'' +
                ", month='" + month + '\'' +
                ", createtime=" + createtime +
                '}';
    }
}
