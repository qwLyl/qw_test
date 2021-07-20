package com.zckj.demo.bean.Clgl;

import java.io.Serializable;

public class Personnel_info implements Serializable {
    //序列化时保持版本的兼容性，即在版本升级bai时反序列化仍保持对象的唯一性。
    private static final long serialVersionUID = 1L;
    private String personnel_id;
    private String personnel_name;
    private String telephone;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getPersonnel_id() {
        return personnel_id;
    }

    public void setPersonnel_id(String personnel_id) {
        this.personnel_id = personnel_id;
    }

    public String getPersonnel_name() {
        return personnel_name;
    }

    public void setPersonnel_name(String personnel_name) {
        this.personnel_name = personnel_name;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Override
    public String toString() {
        return "Personnel_info{" +
                "personnel_id='" + personnel_id + '\'' +
                ", personnel_name='" + personnel_name + '\'' +
                ", telephone='" + telephone + '\'' +
                '}';
    }
}
