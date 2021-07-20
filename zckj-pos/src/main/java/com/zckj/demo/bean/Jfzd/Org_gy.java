package com.zckj.demo.bean.Jfzd;

public class Org_gy {
    private String orgno;
    private String orgname;
    private String orgtype; //
    private String parentno; //
    private String grade;
    private String point_x; //
    private String point_y; //
    private String note; //

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

    public String getOrgtype() {
        return orgtype;
    }

    public void setOrgtype(String orgtype) {
        this.orgtype = orgtype;
    }

    public String getParentno() {
        return parentno;
    }

    public void setParentno(String parentno) {
        this.parentno = parentno;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getPoint_x() {
        return point_x;
    }

    public void setPoint_x(String point_x) {
        this.point_x = point_x;
    }

    public String getPoint_y() {
        return point_y;
    }

    public void setPoint_y(String point_y) {
        this.point_y = point_y;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "Org_gy{" +
                "orgno='" + orgno + '\'' +
                ", orgname='" + orgname + '\'' +
                ", orgtype='" + orgtype + '\'' +
                ", parentno='" + parentno + '\'' +
                ", grade='" + grade + '\'' +
                ", point_x='" + point_x + '\'' +
                ", point_y='" + point_y + '\'' +
                ", note='" + note + '\'' +
                '}';
    }

}
