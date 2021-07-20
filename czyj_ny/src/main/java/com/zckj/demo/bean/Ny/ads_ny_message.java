package com.zckj.demo.bean.Ny;

// 短信表实体类
public class ads_ny_message {
    private String message_no;   	// 短信编号
    private String message_content;   //	短信内容
    private String message_num;  	//短信发送的数量
    private String message_time;      	//发送短信具体时间
    private String message_cons_nm;   //	发送短信人员名称
    private String message_org_nm ;   	//发送短信人员单位名称
    private String message_org_no; 	//发送短信人员单位编号
    private String message_seccuse;  	//短信发送成功数量
    private String message_rq ; 	//发送短信年月日
    private String message_phone ; 	//发送短信人员的电话号码

    @Override
    public String toString() {
        return "ads_ny_message{" +
                "message_no='" + message_no + '\'' +
                ", message_content='" + message_content + '\'' +
                ", message_num='" + message_num + '\'' +
                ", message_time='" + message_time + '\'' +
                ", message_cons_nm='" + message_cons_nm + '\'' +
                ", message_org_nm='" + message_org_nm + '\'' +
                ", message_org_no='" + message_org_no + '\'' +
                ", message_seccuse='" + message_seccuse + '\'' +
                ", message_rq='" + message_rq + '\'' +
                ", message_phone='" + message_phone + '\'' +
                '}';
    }

    public String getMessage_no() {
        return message_no;
    }

    public void setMessage_no(String message_no) {
        this.message_no = message_no;
    }

    public String getMessage_content() {
        return message_content;
    }

    public void setMessage_content(String message_content) {
        this.message_content = message_content;
    }

    public String getMessage_num() {
        return message_num;
    }

    public void setMessage_num(String message_num) {
        this.message_num = message_num;
    }

    public String getMessage_time() {
        return message_time;
    }

    public void setMessage_time(String message_time) {
        this.message_time = message_time;
    }

    public String getMessage_cons_nm() {
        return message_cons_nm;
    }

    public void setMessage_cons_nm(String message_cons_nm) {
        this.message_cons_nm = message_cons_nm;
    }

    public String getMessage_org_nm() {
        return message_org_nm;
    }

    public void setMessage_org_nm(String message_org_nm) {
        this.message_org_nm = message_org_nm;
    }

    public String getMessage_org_no() {
        return message_org_no;
    }

    public void setMessage_org_no(String message_org_no) {
        this.message_org_no = message_org_no;
    }

    public String getMessage_seccuse() {
        return message_seccuse;
    }

    public void setMessage_seccuse(String message_seccuse) {
        this.message_seccuse = message_seccuse;
    }

    public String getMessage_rq() {
        return message_rq;
    }

    public void setMessage_rq(String message_rq) {
        this.message_rq = message_rq;
    }

    public String getMessage_phone() {
        return message_phone;
    }

    public void setMessage_phone(String message_phone) {
        this.message_phone = message_phone;
    }

}
