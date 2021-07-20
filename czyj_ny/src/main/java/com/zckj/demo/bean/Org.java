package com.zckj.demo.bean;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Org implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /** 机构编号 */
    public String org_no;
    /** 机构名称 */
    private String org_nm;
    /** 机构名简称 */
    private String org_jc;
    /** 级别 */
    private int org_typ_cd;
    //新机构编号
    private String std_org_no;
    /** 上级机构编号 */
    private String super_org_no;
    /** 新上级机构编号 */
    private String super_std_org_no;


    public String getSuper_std_org_no() {
        return super_std_org_no;
    }

    public void setSuper_std_org_no(String super_std_org_no) {
        this.super_std_org_no = super_std_org_no;
    }
    public String getOrg_jc() {
        return org_jc;
    }

    public void setOrg_jc(String org_jc) {
        this.org_jc = org_jc;
    }
    private List<Org> children = new ArrayList<Org>() ;
    public String getorg_no() {
        return org_no;
    }

    public void setorg_no(String org_no) {
        this.org_no = org_no;
    }

    public String getorg_nm() {
        return org_nm;
    }

    public void setorg_nm(String org_nm) {
        this.org_nm = org_nm;
    }


    public String getSuper_org_no() {
        return super_org_no;
    }

    public void setsuper_org_no(String super_org_no) {
        this.super_org_no = super_org_no;
    }

    public int getorg_typ_cd() {
        return org_typ_cd;
    }

    public void setorg_typ_cd(int org_typ_cd) {
        this.org_typ_cd = org_typ_cd;
    }

    public String getstd_org_no() {
        return std_org_no;
    }

    public void setstd_org_no(String std_org_no) {
        this.std_org_no = std_org_no;
    }

    public List<Org> getChildren() {
        return children;
    }

    public void setChildren(List<Org> children) {
        this.children = children;
    }


    public static JSONArray OrgTree(List<Org> list, String Pid) {
        JSONArray jsona = new JSONArray();
        JSONObject json = new JSONObject();
        //TreeChildren(jsona, list,"434");
        for (int i = 0; i < list.size(); i++) {
            // 如果该节点没有父节点那么它就是根（root）节点
            if (Pid.equals(list.get(i).getSuper_org_no())) {
                json.put("org_typ_cd", list.get(i).getorg_typ_cd());
                json.put("id", list.get(i).getorg_no());
                json.put("label", list.get(i).getorg_nm());
                json.put("children", TreeChildren(list, list.get(i).getorg_no()));
                jsona.add(json);
            }
            //break;
        }

        return jsona;
    }

    public static List<Org>  TreeChildren(List<Org> list, String Pid) {
        JSONObject json = new JSONObject();
        JSONArray jsona = new JSONArray();

        for (int i = 0; i < list.size(); i++) {
            // 如果该节点没有父节点那么它就是根（root）节点
            if (Pid.equals(list.get(i).getSuper_org_no())) {
                json.put("org_typ_cd", list.get(i).getorg_typ_cd());
                json.put("id", list.get(i).getorg_no());
                json.put("label", list.get(i).getorg_nm());
                json.put("children", TreeChildren(list, list.get(i).getorg_no()));
                jsona.add(json);

            }
        }
        return jsona;
    }
}
