package com.zckj.demo.bean.Ny;

import lombok.Data;

/**
 *
 * @date 20-5-11
 * @desc
 */
@Data
public class Key {
    public String Exponent = "";
    public String Modulus ="";
    public String czyId = "";
    public String pwd = "";
    public String execution;
    public String lt="";
    public String _eventId="";
    public String srand="";
    public  String jSessionId="";
    public String messageCode="";
    public String authModeSerial="";
    public String m="";
    public String e="";
    public  String SIGN="";

    public String getExponent() {
        return Exponent;
    }

    public void setExponent(String exponent) {
        Exponent = exponent;
    }

    public String getModulus() {
        return Modulus;
    }

    public void setModulus(String modulus) {
        Modulus = modulus;
    }

    public String getCzyId() {
        return czyId;
    }

    public void setCzyId(String czyId) {
        this.czyId = czyId;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getExecution() {
        return execution;
    }

    public void setExecution(String execution) {
        this.execution = execution;
    }

    public String getLt() {
        return lt;
    }

    public void setLt(String lt) {
        this.lt = lt;
    }

    public String get_eventId() {
        return _eventId;
    }

    public void set_eventId(String _eventId) {
        this._eventId = _eventId;
    }

    public String getSrand() {
        return srand;
    }

    public void setSrand(String srand) {
        this.srand = srand;
    }

    public String getjSessionId() {
        return jSessionId;
    }

    public void setjSessionId(String jSessionId) {
        this.jSessionId = jSessionId;
    }

    public String getMessageCode() {
        return messageCode;
    }

    public void setMessageCode(String messageCode) {
        this.messageCode = messageCode;
    }

    public String getAuthModeSerial() {
        return authModeSerial;
    }

    public void setAuthModeSerial(String authModeSerial) {
        this.authModeSerial = authModeSerial;
    }

    public String getM() {
        return m;
    }

    public void setM(String m) {
        this.m = m;
    }

    public String getE() {
        return e;
    }

    public void setE(String e) {
        this.e = e;
    }

    public String getSIGN() {
        return SIGN;
    }

    public void setSIGN(String SIGN) {
        this.SIGN = SIGN;
    }
}
