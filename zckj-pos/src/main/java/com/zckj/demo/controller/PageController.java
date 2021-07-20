package com.zckj.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@CrossOrigin
@RequestMapping("")
public class PageController {

    // 缴费次数查询
    @RequestMapping("selectposstj")
    public String selectposstj(){
        return  "jfzd/posstj";
    }

    // 单位汇总
    @RequestMapping("selectposswda")
    public String selectposswda(){
        return  "jfzd/posswda";
    }

    // 终端档案查询
    @RequestMapping("selectposscx")
    public String selectposscx(){
        return  "jfzd/posscx";
    }

    // pos机首页
    @RequestMapping("index")
    public String jfzd(){
        return  "JfzdIndex";
    }

     // 终端档案管理
    @RequestMapping("selectpossgl")
    public String selectpossgl(){
        return  "jfzd/possgl";
    }

    // 交易明细导入
    @RequestMapping("upload2")
    public String upload2(){
        return  "jfzd/upload2";
    }

    // 交易明细月查询
    @RequestMapping("selectUpload")
    public String selectUpload(){
        return  "jfzd/selectUpload";
    }

}
