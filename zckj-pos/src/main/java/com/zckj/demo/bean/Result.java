package com.zckj.demo.bean;

import java.util.Map;

public class Result {
    /**编号 */
    private String id;
    /**信息 */
    private String info;
    /**参数*/
    private Map<String,String> param;

    public void init() {
        this.id="0";
        this.info="";
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Map<String, String> getParam() {
        return param;
    }

    public void setParam(Map<String, String> param) {
        this.param = param;
    }
}
