package com.zckj.demo.controller.Jfzd;

import com.alibaba.excel.EasyExcel;
import com.github.pagehelper.PageInfo;
import com.zckj.demo.bean.Jfzd.*;
import com.zckj.demo.bean.Result;
import com.zckj.demo.common.AbsolutePath;
//import com.zckj.demo.common.Excel;
import com.zckj.demo.common.utils.EasyExcelUtil;
import com.zckj.demo.common.utils.Pos_dr_uploadListener_2;
import com.zckj.demo.service.Jfzd.JfzdService;
import net.sf.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.List;


/**
 * 缴费终端
 */
@Controller
@RequestMapping("/jfzd")
public class JfzdController {

    @Autowired
    private JfzdService jfzdService;

    /**
     * 文件上传
     * <p>1. 创建excel对应的实体对象
     * <p>2. 由于默认一行行的读取excel，所以需要创建excel一行一行的回调监听器
     * <p>3. 直接读即可
     */
    @PostMapping("/upload")
    @ResponseBody
    public String upload(MultipartFile file) throws IOException {
        // Excel读入     添加Sheet（表单）
        EasyExcel.read(file.getInputStream(), Pos_dr_upload.class, new Pos_dr_uploadListener_2(jfzdService)).sheet().doRead();  //异步读取,在监听器中进行数据处理
        return "success";
    }
    /**
     * 文件下载（失败了会返回一个有部分数据的Excel）
     * <p>
     * 1. 创建excel对应的实体对象 参照{@link Pos_dr_upload}
     * <p>
     * 2. 设置返回的 参数
     * <p>
     * 3. 直接写，这里注意，finish的时候会自动关闭OutputStream,当然你外面再关闭流问题不大
     */
    @GetMapping("/download")
    public void download(HttpServletResponse response, String fileName, String month) throws IOException {
        //查询数据库内的数据
        List<Pos_dr_upload> list = jfzdService.selectupload(month);
        EasyExcelUtil.exportDefaultExcel(response, fileName, Pos_dr_upload.class, list);
    }

    // 按清算月时间查询 对应selectUpload.html
    @ResponseBody
    @RequestMapping("/selectUploadFy")
    public PageInfo selectuploadFy(HttpServletRequest request, HttpServletResponse response, String month, Integer pageNum, Integer pageSize)throws IOException{

        if(month != ""){
            return jfzdService.selectuploadFy(month,pageNum,pageSize);
        }else {
            return null;
        }
    }


        // 查询 org_gy 表中的县级单位
        @ResponseBody
        @RequestMapping("/selectorg")
        public String selectOrg(HttpServletRequest request, HttpServletResponse response, String grade)throws IOException {

            List<Org_gy> list =  jfzdService.selectOrg(grade);

            if(list!=null &&!list.isEmpty()){
                JSONArray json = JSONArray.fromObject(list);
                return json.toString();
            }else {
                return null;
            }
        }


    // 查询 org_gy 表中的县级下的所有供电所
    @ResponseBody
    @RequestMapping("/selectorgxj")
    public String selectOrgXj(HttpServletRequest request, HttpServletResponse response, String orgno)throws IOException {

        if(orgno != null){
            List<Org_gy> list =  jfzdService.selectOrgXj(orgno);
            if(list!=null &&!list.isEmpty()){
                JSONArray json = JSONArray.fromObject(list);
                return json.toString();
            }else {
                return null;
            }
        }
        return null;
    }


    // 按县级以下,possid号查询 pos_info 表
    @ResponseBody
    @RequestMapping("/selectpos")
    public String selectPos(HttpServletRequest request, HttpServletResponse response, String orgno1,String orgno2,String posid)throws IOException {

        // 展示市级所有供电所
        if("43411".equals(orgno1)  && "1".equals(orgno2)){

            List<Pos_info> list = jfzdService.selectXj(orgno1) ;
            if(list!=null &&!list.isEmpty()){
                JSONArray json = JSONArray.fromObject(list);
                return json.toString();
            }else {
                return null;
            }
            // 展示县级下的所有供电所
        }else if(orgno1 != "" && !"43411".equals(orgno1) && "1".equals(orgno2)){

            List<Pos_info> list = jfzdService.selectXj(orgno1);
            if(list!=null &&!list.isEmpty()){
                JSONArray json = JSONArray.fromObject(list);
                return json.toString();
            }else {
                return null;
            }
             // 展示没输入pos机号查询
        }else if(!"43411".equals(orgno1) && !"1".equals(orgno2) && posid == ""){

            List<Pos_info> list = jfzdService.selectSj(orgno2);
            if(list!=null &&!list.isEmpty()){
                JSONArray json = JSONArray.fromObject(list);
                return json.toString();
            }else {
                return null;
            }
            // 展示 按pos机号 县级 县下级查询
        }else if(!"43411".equals(orgno1) && orgno1 !="" && orgno2 != "" && !"1".equals(orgno2) && posid != ""){

            List<Pos_info> list = jfzdService.selectGprs(orgno2,posid);
            if(list!=null &&!list.isEmpty()){
                JSONArray json = JSONArray.fromObject(list);
                return json.toString();
            }else {
                return null;
            }
        }
        return null;
    }

    // 多级下拉框及posid查询及导出功能  对应possgl.html 和posscx.html
    @ResponseBody
    @RequestMapping("/selectXldj")
    public String selectXldj(HttpServletRequest request, HttpServletResponse response, String orgno,String posid)throws IOException {

        String filename = request.getParameter("filename");

        if(orgno != "" && posid == ""){
            List<Pos_info> list = jfzdService.selectXj(orgno);

            if(list!=null &&!list.isEmpty()){
                JSONArray json = JSONArray.fromObject(list);
                return json.toString();
            }else {
                return null;
            }
        }else if(orgno != "" && posid != ""){
            List<Pos_info> list = jfzdService.selectGprs(orgno,posid);

            if(list!=null &&!list.isEmpty()){
                JSONArray json = JSONArray.fromObject(list);
                return json.toString();
            }else {
                return null;
            }
        }
            return null;
    }


    // 添加功能 对应possgl.html
    @ResponseBody
    @RequestMapping("/insert_possgl")
    public Result insert(@RequestBody Pos_info pos_info){
        Result result = jfzdService.insert_possgl(pos_info);

        if (Integer.parseInt(result.getId())==0){
            result.setInfo("添加成功!!");
            return result;
        }else{
            result.setInfo("添加失败!!");
            return result;
        }
    }

    // 修改功能 对应possgl.html
    @RequestMapping("/updata")
    @ResponseBody
    public Result updata(@RequestBody Pos_info pos_info){

        Result result = jfzdService.updata(pos_info);

        if (Integer.parseInt(result.getId())==1){
            result.setInfo("修改成功!!");
            return result;
        }else{
            result.setInfo("修改失败!!");
            return result;
        }
    }

    //  按日期查询无档案POS查询 posswda.html
    @RequestMapping("/selectRq")
    @ResponseBody
    public String selectRq(HttpServletRequest request, HttpServletResponse response, String month)throws IOException {

        if(month != null){
            List<Pos_dr> list =  jfzdService.selectRq(month);
            if(list!=null &&!list.isEmpty()){
                JSONArray json = JSONArray.fromObject(list);
                return json.toString();
            }else {
                return null;
            }
        }
        return null;
    }
    //  按日期查询县公司POS posswda.html
    @RequestMapping("/selectRqXgs")
    @ResponseBody
    public String selectRqXgs(HttpServletRequest request, HttpServletResponse response, String month)throws IOException {

        if(month != null){
            List<Pos_dr> list =  jfzdService.selectRqXgs(month);
            if(list!=null &&!list.isEmpty()){
                JSONArray json = JSONArray.fromObject(list);
                return json.toString();
            }else {
                return null;
            }
        }
        return null;
    }
    //  按日期查询供电所POS posswda.html
    @RequestMapping("/selectRqGds")
    @ResponseBody
    public String selectRqgds(HttpServletRequest request, HttpServletResponse response, String month)throws IOException {

        if(month != null){
            List<Pos_dr> list =  jfzdService.selectRqGds(month);
            if(list!=null &&!list.isEmpty()){
                JSONArray json = JSONArray.fromObject(list);
                return json.toString();
            }else {
                return null;
            }
        }
        return null;
    }


    // 按日期查询POS机交易统计 posstj.html
    @RequestMapping("/selectTj")
    @ResponseBody
    public String selectTj(HttpServletRequest request, HttpServletResponse response, String month)throws IOException {

        if(month != null){
            List<Pos_tj> list =  jfzdService.selectTj(month);
            if(list!=null &&!list.isEmpty()){
                JSONArray json = JSONArray.fromObject(list);
                return json.toString();
            }else {
                return null;
            }
        }
        return null;
    }


}
