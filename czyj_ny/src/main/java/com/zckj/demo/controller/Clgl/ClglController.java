//package com.zckj.demo.controller.Clgl;
//
//import com.zckj.demo.bean.Clgl.Pcd;
//import com.zckj.demo.bean.Clgl.Personnel_info;
//import com.zckj.demo.bean.Clgl.Xscl;
//import com.zckj.demo.common.AbsolutePath;
//import com.zckj.demo.common.Excel;
//import com.zckj.demo.common.Result;
//import com.zckj.demo.service.Clgl.ClglService;
//import net.sf.json.JSONArray;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.*;
//import java.util.List;
//
//@Controller
//@RequestMapping("/clgl")
//public class ClglController {
//    @Autowired
//    private ClglService clglService;
//    @RequestMapping(value = "Select_cl_info",method = RequestMethod.GET)
//    @ResponseBody
//    public String Select_cl_info(HttpServletRequest request, HttpServletResponse response, Pcd pcd)throws IOException{
//        List<Pcd> list=clglService.Select_cl_info(pcd);
//        String filename = request.getParameter("filename");
//        if(filename!=null)
//        {
//            response.setContentType("multipart/form-data");
//            response.setHeader("Content-Disposition", "attachment;filename=" + java.net.URLEncoder.encode(filename+".xls", "UTF-8"));
//            String d1=request.getParameter("title");
//            String d2=request.getParameter("field");
//            OutputStream out = response.getOutputStream();
//            Excel e = new Excel();
//            String path = AbsolutePath.getAbsolutePath()+"/"+filename+".xls";
//            path = path.replace("%20", " ");
//            e.ExpExcel(list,path,d1,d2);
//            InputStream in = new FileInputStream(new File(path));
//            int b;
//            while((b=in.read())!=-1){
//                out.write(b);
//            }
//            in.close();
//            out.close();
//            return filename+".xls";
//        }
//        JSONArray json = JSONArray.fromObject(list);
//        return json.toString();
//    }
//
//    @RequestMapping(value = "Select_cl_info_vn",method =RequestMethod.GET)
//    @ResponseBody
//    public String Select_cl_info_vn(HttpServletRequest request, HttpServletResponse response, Pcd pcd)throws IOException{
//        List<Pcd> list=clglService.Select_cl_info_vn(pcd);
//        if(list!=null &&!list.isEmpty()){
//            JSONArray json = JSONArray.fromObject(list);
//            return json.toString();
//        }else {
//            return null;
//        }
//    }
//
//    @RequestMapping(value = "Select_cl_info_more",method =RequestMethod.GET)
//    @ResponseBody
//    public String Select_cl_info_more(HttpServletRequest request, HttpServletResponse response, Pcd pcd)throws IOException{
//        List<Pcd> list=clglService.Select_cl_info_more(pcd);
//        if(list!=null &&!list.isEmpty()){
//            JSONArray json = JSONArray.fromObject(list);
//            return json.toString();
//        }else {
//            return null;
//        }
//    }
//}
