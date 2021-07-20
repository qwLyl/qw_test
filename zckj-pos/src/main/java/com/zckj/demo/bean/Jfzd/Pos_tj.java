package com.zckj.demo.bean.Jfzd;

public class Pos_tj {
    private String orgno; // 供电编号
    private String orgname; // 供电单位
    private String posid; // 终端号
    private String count; // 缴费次数
    private String money; // 缴费总额
    private String countyname; // 县单位
    private String month; // 月份

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

    public String getPosid() {
        return posid;
    }

    public void setPosid(String posid) {
        this.posid = posid;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public String getCountyname() {
        return countyname;
    }

    public void setCountyname(String countyname) {
        this.countyname = countyname;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    @Override
    public String toString() {
        return "Pos_tj{" +
                "orgno='" + orgno + '\'' +
                ", orgname='" + orgname + '\'' +
                ", posid='" + posid + '\'' +
                ", count='" + count + '\'' +
                ", money='" + money + '\'' +
                ", countyname='" + countyname + '\'' +
                ", month='" + month + '\'' +
                '}';
    }

}
