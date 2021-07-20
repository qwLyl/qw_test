package com.zckj.demo.bean.Jfzd;

public class Pos_info {
    private String orgno;  // 供电编号
    private String orgname; //供电单位
    private String code;  //商户号
    private String posid;  //终端号
    private String orderid;  //序列号
    private String gprs;  //GPRS卡号
    private String type;  //机型
    private String address;  // 设备安装地点
    private String installdate;  //安装时间
    private String village;  //所属行政村
    private String trans;  // 所属台区
    private String workerid; //设备责任人编号
    private String workername; // 设备责任人(台区经理)
    private String state; //运行状态
    private String note; //备注
    private String jf_count; //1到5月缴费笔数
    private String money; //场地租赁费
    private String operatordate;
    private String kh_count;
    private String kh_money;
    private String kh_all;
    private String telephone;  //联系电话

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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPosid() {
        return posid;
    }

    public void setPosid(String posid) {
        this.posid = posid;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    public String getGprs() {
        return gprs;
    }

    public void setGprs(String gprs) {
        this.gprs = gprs;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getInstalldate() {
        return installdate;
    }

    public void setInstalldate(String installdate) {
        this.installdate = installdate;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public String getTrans() {
        return trans;
    }

    public void setTrans(String trans) {
        this.trans = trans;
    }

    public String getWorkerid() {
        return workerid;
    }

    public void setWorkerid(String workerid) {
        this.workerid = workerid;
    }

    public String getWorkername() {
        return workername;
    }

    public void setWorkername(String workername) {
        this.workername = workername;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getJf_count() {
        return jf_count;
    }

    public void setJf_count(String jf_count) {
        this.jf_count = jf_count;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public String getOperatordate() {
        return operatordate;
    }

    public void setOperatordate(String operatordate) {
        this.operatordate = operatordate;
    }

    public String getKh_count() {
        return kh_count;
    }

    public void setKh_count(String kh_count) {
        this.kh_count = kh_count;
    }

    public String getKh_money() {
        return kh_money;
    }

    public void setKh_money(String kh_money) {
        this.kh_money = kh_money;
    }

    public String getKh_all() {
        return kh_all;
    }

    public void setKh_all(String kh_all) {
        this.kh_all = kh_all;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Override
    public String toString() {
        return "Pos_info{" +
                "orgno='" + orgno + '\'' +
                ", orgname='" + orgname + '\'' +
                ", code='" + code + '\'' +
                ", posid='" + posid + '\'' +
                ", orderid='" + orderid + '\'' +
                ", gprs='" + gprs + '\'' +
                ", type='" + type + '\'' +
                ", address='" + address + '\'' +
                ", installdate='" + installdate + '\'' +
                ", village='" + village + '\'' +
                ", trans='" + trans + '\'' +
                ", workerid='" + workerid + '\'' +
                ", workername='" + workername + '\'' +
                ", state='" + state + '\'' +
                ", note='" + note + '\'' +
                ", jf_count='" + jf_count + '\'' +
                ", money='" + money + '\'' +
                ", operatordate='" + operatordate + '\'' +
                ", kh_count='" + kh_count + '\'' +
                ", kh_money='" + kh_money + '\'' +
                ", kh_all='" + kh_all + '\'' +
                ", telephone='" + telephone + '\'' +
                '}';
    }
}
