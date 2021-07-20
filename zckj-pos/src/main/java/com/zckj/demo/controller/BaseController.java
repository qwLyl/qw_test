package com.zckj.demo.controller;

import com.zckj.demo.bean.Org;
import com.zckj.demo.service.BaseService;
import net.sf.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Controller
@RequestMapping("")
public class BaseController {
    @Autowired
    private BaseService baseService;

    //单位组织机构
    @RequestMapping(value = "SelectOrg",method = RequestMethod.GET)
    @ResponseBody
    public JSONArray SelectOrg(){
        List<Org> list = baseService.SelectOrg();
        JSONArray jsona = new JSONArray();
        jsona =Org.OrgTree(list,"43101");
        return jsona;
    }

    @ResponseBody
    @RequestMapping(value = "/TreeOrg")
    public String TreeOrg(){
        List<Org> list = baseService.selectOrg("43411");
        if (list != null && !list.isEmpty()) {
           // JSONArray json = JSONArray.fromObject(list);
            JSONArray json = Org.OrgTree(list, "434");

            return json.toString();
        } else {
            return null;
        }
    }
    @ResponseBody
    @RequestMapping(value = "/ListOrg")
    public String ListOrg(){
        List<Org> list = baseService.selectOrg("4341002");
        if (list != null && !list.isEmpty()) {
            JSONArray json = JSONArray.fromObject(list);
            return json.toString();
        } else {
            return null;
        }
    }
    @ResponseBody
    @RequestMapping(value = "/SysDate")
    public String SysDate(){
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }
}
