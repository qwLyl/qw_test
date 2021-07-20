package com.zckj.demo.bean.Clgl;

import java.io.Serializable;

public class Pcd implements Serializable {
    //序列化时保持版本的兼容性，即在版本升级bai时反序列化仍保持对象的唯一性。
    private static final long serialVersionUID = 1L;
    private String apply_id;
    private String vehicle_id;
    private int rn;
    private String frm_address;
    private String org_id;
    private String back_time;
    private String id;
    private String usekind;
    private String serviceassessstatus;
    private String recfrom;
    private int numbers;
    private String user_reason;
    private String name;
    private String driver_id;
    private String user_name;
    private String driver_name;
    private String mileage;
    private String control_time;
    private String send_time;
    private String user_dept;
    private String vehicle_number;
    private String driver_tel;
    private String user_tel;
    private String use_total_time;
    private String to_address;
    private String error_type;

    private String rq;
    private String orgno;
    private String orgname;
    private double speed;
    private String enddate;

    public String getError_type() {
        return error_type;
    }

    public void setError_type(String error_type) {
        this.error_type = error_type;
    }

    public String getEnddate() {
        return enddate;
    }

    public void setEnddate(String enddate) {
        this.enddate = enddate;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getApply_id() {
        return apply_id;
    }

    public void setApply_id(String apply_id) {
        this.apply_id = apply_id;
    }

    public String getVehicle_id() {
        return vehicle_id;
    }

    public void setVehicle_id(String vehicle_id) {
        this.vehicle_id = vehicle_id;
    }

    public int getRn() {
        return rn;
    }

    public void setRn(int rn) {
        this.rn = rn;
    }

    public String getFrm_address() {
        return frm_address;
    }

    public void setFrm_address(String frm_address) {
        this.frm_address = frm_address;
    }

    public String getOrg_id() {
        return org_id;
    }

    public void setOrg_id(String org_id) {
        this.org_id = org_id;
    }

    public String getBack_time() {
        return back_time;
    }

    public void setBack_time(String back_time) {
        this.back_time = back_time;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsekind() {
        return usekind;
    }

    public void setUsekind(String usekind) {
        this.usekind = usekind;
    }

    public String getServiceassessstatus() {
        return serviceassessstatus;
    }

    public void setServiceassessstatus(String serviceassessstatus) {
        this.serviceassessstatus = serviceassessstatus;
    }

    public String getRecfrom() {
        return recfrom;
    }

    public void setRecfrom(String recfrom) {
        this.recfrom = recfrom;
    }

    public int getNumbers() {
        return numbers;
    }

    public void setNumbers(int numbers) {
        this.numbers = numbers;
    }

    public String getUser_reason() {
        return user_reason;
    }

    public void setUser_reason(String user_reason) {
        this.user_reason = user_reason;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDriver_id() {
        return driver_id;
    }

    public void setDriver_id(String driver_id) {
        this.driver_id = driver_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getDriver_name() {
        return driver_name;
    }

    public void setDriver_name(String driver_name) {
        this.driver_name = driver_name;
    }

    public String getMileage() {
        return mileage;
    }

    public void setMileage(String mileage) {
        this.mileage = mileage;
    }

    public String getControl_time() {
        return control_time;
    }

    public void setControl_time(String control_time) {
        this.control_time = control_time;
    }

    public String getSend_time() {
        return send_time;
    }

    public void setSend_time(String send_time) {
        this.send_time = send_time;
    }

    public String getUser_dept() {
        return user_dept;
    }

    public void setUser_dept(String user_dept) {
        this.user_dept = user_dept;
    }

    public String getVehicle_number() {
        return vehicle_number;
    }

    public void setVehicle_number(String vehicle_number) {
        this.vehicle_number = vehicle_number;
    }

    public String getDriver_tel() {
        return driver_tel;
    }

    public void setDriver_tel(String driver_tel) {
        this.driver_tel = driver_tel;
    }

    public String getUser_tel() {
        return user_tel;
    }

    public void setUser_tel(String user_tel) {
        this.user_tel = user_tel;
    }

    public String getUse_total_time() {
        return use_total_time;
    }

    public void setUse_total_time(String use_total_time) {
        this.use_total_time = use_total_time;
    }

    public String getTo_address() {
        return to_address;
    }

    public void setTo_address(String to_address) {
        this.to_address = to_address;
    }


    public String getRq() {
        return rq;
    }

    public void setRq(String rq) {
        this.rq = rq;
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

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Pcd{" +
                "apply_id='" + apply_id + '\'' +
                ", vehicle_id='" + vehicle_id + '\'' +
                ", rn=" + rn +
                ", frm_address='" + frm_address + '\'' +
                ", org_id='" + org_id + '\'' +
                ", back_time='" + back_time + '\'' +
                ", id='" + id + '\'' +
                ", usekind='" + usekind + '\'' +
                ", serviceassessstatus='" + serviceassessstatus + '\'' +
                ", recfrom='" + recfrom + '\'' +
                ", numbers=" + numbers +
                ", user_reason='" + user_reason + '\'' +
                ", name='" + name + '\'' +
                ", driver_id='" + driver_id + '\'' +
                ", user_name='" + user_name + '\'' +
                ", driver_name='" + driver_name + '\'' +
                ", mileage='" + mileage + '\'' +
                ", control_time='" + control_time + '\'' +
                ", send_time='" + send_time + '\'' +
                ", user_dept='" + user_dept + '\'' +
                ", vehicle_number='" + vehicle_number + '\'' +
                ", driver_tel='" + driver_tel + '\'' +
                ", user_tel='" + user_tel + '\'' +
                ", use_total_time='" + use_total_time + '\'' +
                ", to_address='" + to_address + '\'' +
                ", rq='" + rq + '\'' +
                ", orgno='" + orgno + '\'' +
                ", orgname='" + orgname + '\'' +
                ", speed=" + speed +
                ", enddate='" + enddate + '\'' +
                '}';
    }
}
