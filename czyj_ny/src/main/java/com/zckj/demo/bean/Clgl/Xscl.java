package com.zckj.demo.bean.Clgl;

import java.io.Serializable;

public class Xscl implements Serializable {
    //序列化时保持版本的兼容性，即在版本升级bai时反序列化仍保持对象的唯一性。
    private static final long serialVersionUID = 1L;
    private String time;
    private String name;
    private String phone;
    private String vehiclenumber;
    private String lx;
    private String content;
    private String send_time;
    private String enddate;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getVehiclenumber() {
        return vehiclenumber;
    }

    public void setVehiclenumber(String vehiclenumber) {
        this.vehiclenumber = vehiclenumber;
    }

    public String getLx() {
        return lx;
    }

    public void setLx(String lx) {
        this.lx = lx;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSend_time() {
        return send_time;
    }

    public void setSend_time(String send_time) {
        this.send_time = send_time;
    }

    public String getEnddate() {
        return enddate;
    }

    public void setEnddate(String enddate) {
        this.enddate = enddate;
    }
    @Override
    public String toString() {
        return "Xscl{" +
                "date='" + time + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", vehiclenumber='" + vehiclenumber + '\'' +
                ", lx=" + lx +
                ", content=" + content +
                '}';
    }
}
