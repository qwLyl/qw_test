package com.zckj.demo.bean.Jfzd;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * 缴费终端 excel对应的实体对象
 */
public class Pos_dr_upload {
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

    @ExcelIgnore
    private Date createtime;

    @Override
    public String toString() {
        return "Pos_dr_upload{" +
                "qsrq='" + qsrq + '\'' +
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
                ", createtime=" + createtime +
                '}';
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
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

}
