package com.zckj.demo.common.utils;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.write.style.column.LongestMatchColumnWidthStyleStrategy;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.List;

/**
 * @author 孙岩
 * @create 2020/11/14
 */
public class EasyExcelUtil {

    /**
     * 下载文件
     * @param response
     * @param exportFileName 文件名
     * @param head 实体类
     * @param dataList  数据
     * @throws IOException
     */
    public static void exportDefaultExcel(HttpServletResponse response, String exportFileName, Class head, List<?> dataList) throws IOException {
        // 这里注意 使用swagger 会导致各种问题，请直接用浏览器或者用postman
        response.setContentType("application/vnd.ms-excel");
        response.setCharacterEncoding("utf-8");
        // 这里URLEncoder.encode可以防止中文乱码 当然和easyexcel没有关系
        String fileName = URLEncoder.encode(exportFileName, "UTF-8").replaceAll("\\+", "%20");
        response.setHeader("Content-disposition", "attachment;filename*=utf-8''" + fileName + ".xlsx");
        EasyExcel.write(response.getOutputStream(), head)
                .registerWriteHandler(new LongestMatchColumnWidthStyleStrategy())
                .sheet("Sheet1").doWrite(dataList);
    }
    /**
     * 下载文件，自定义自适应列宽
     * @param response
     * @param exportFileName 文件名
     * @param head 实体类
     * @param dataList  数据
     * @throws IOException
     */
    public static void customMatchColumnWidth(HttpServletResponse response, String exportFileName, Class head, List<?> dataList) throws IOException {
        // 这里注意 使用swagger 会导致各种问题，请直接用浏览器或者用postman
        response.setContentType("application/vnd.ms-excel");
        response.setCharacterEncoding("utf-8");
        // 这里URLEncoder.encode可以防止中文乱码 当然和easyexcel没有关系
        String fileName = URLEncoder.encode(exportFileName, "UTF-8").replaceAll("\\+", "%20");
        response.setHeader("Content-disposition", "attachment;filename*=utf-8''" + fileName + ".xlsx");
        EasyExcel.write(response.getOutputStream(), head)
                .registerWriteHandler(new CustomCellWriteHandler()) // 自定义自适应列宽，稍宽
                .sheet("Sheet1").doWrite(dataList);
    }

    /**
     * 自定义动态表头
     * .head(header)这个方法接受一个List<List<>>对象作为动态表头, 该List的结构与excel表头的对应关系：
     *      内层List：每个List对应的是表头中的每一列单元格，长度最大的List的长度决定了表头的行数，并且会合并每个List下标和内容都相同的单元格
     *      外层List：最终的表头结构
     *
     * @param response
     * @param exportFileName 文件名
     * @param dataList  数据
     * @throws IOException
     */
    public static void exportCustomExcel(HttpServletResponse response, String exportFileName, List<?> dataList, List<List<String>> header ) throws IOException {
        response.setContentType("application/vnd.ms-excel");
        response.setCharacterEncoding("utf-8");
        // 这里URLEncoder.encode可以防止中文乱码
        String fileName = URLEncoder.encode(exportFileName, "UTF-8");
        response.setHeader("Content-disposition", "attachment;filename=" + fileName + ".xlsx");

        EasyExcel.write(response.getOutputStream())
                .registerWriteHandler(new LongestMatchColumnWidthStyleStrategy()) // easyexcel自带的自适应列宽，不精确
                // 这里放入动态头
                .head(header).sheet("Sheet1")
                .doWrite(dataList);
    }
}
