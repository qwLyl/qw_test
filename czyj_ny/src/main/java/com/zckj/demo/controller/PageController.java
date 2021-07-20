package com.zckj.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@CrossOrigin
@RequestMapping("")
public class PageController {
    @RequestMapping("login")
    public String login(){
        return  "login";
    }

    @RequestMapping("index")
    public String index(){
        return  "index";
    }
    @RequestMapping("/Map")
    public String Map(){
        return  "Map";
    }
    @RequestMapping("Day_info")
    public String Day_info(){
        return  "Day_info";
    }
    @RequestMapping("Month_info")
    public String Month_info(){
        return  "Month_info";
    }

    @RequestMapping("table")
    public String table(){
        return  "pages/table";
    }


    @RequestMapping("/website/qz")
    public String website(int id)
    {
        System.out.println("--------load-----------" + id);
        //return Integer.toString(id);
        if (id==16) {
            return "data/other";
        }
        return "data/qzdata";
    }
}
