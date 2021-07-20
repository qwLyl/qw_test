package com.zckj.demo.common.utils;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.zckj.demo.bean.Jfzd.Pos_dr_upload;
import com.zckj.demo.service.Jfzd.JfzdService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 模板的读取类
 *
 * @author sunyan
 */

// 有个很重要的点 DemoDataListener 不能被spring管理，要每次读取excel都要new,然后里面用到spring可以构造方法传进去

public class Pos_dr_uploadListener_2 extends AnalysisEventListener<Pos_dr_upload> {

    // 目的：使用指定的类XXX初始化日志对象,方便在日志输出的时候,可以打印出日志信息所属的类.
    private static final Logger LOGGER = LoggerFactory.getLogger(Pos_dr_uploadListener_2.class);
    /**
     * 每隔5条存储数据库，实际使用中可以3000条，然后清理list ，方便内存回收
     */
    private static final int BATCH_COUNT = 1000;

    List<Pos_dr_upload> list = new ArrayList<Pos_dr_upload>();
    /**
     * 假设这个是一个DAO，当然有业务逻辑这个也可以是一个service。当然如果不用存储这个对象没用。
     */
    private JfzdService jfzdService;

    /**
     * 存储切割后的时间字符串
     * 如：20200102，保留年月202001
     */
    private String substrQsrq = null;

    /**
     * 格式化后的上传文件日期字符串
     */
    private String formatCreateTime = null;

    public Pos_dr_uploadListener_2() {
    }

    /**
     * 如果使用了spring,请使用这个构造方法。每次创建Listener的时候需要把spring管理的类传进来
     *
     * @param jfzdService
     */
    public Pos_dr_uploadListener_2(JfzdService jfzdService) {
        this.jfzdService = jfzdService;
    }

    /**
     * 这个每一条数据解析都会来调用
     *
     * @param data    one row value. Is is same as {@link AnalysisContext#readRowHolder()}
     * @param context
     */
    @Override
    public void invoke(Pos_dr_upload data, AnalysisContext context) {  // 自行写业务逻辑  必须实现的方法
//        LOGGER.info("解析到一条数据:{}", JSON.toJSONString(data));
        // 记录excel中第一行的清算日期
        if (substrQsrq == null) {
            String qsrq = data.getQsrq();
            substrQsrq = qsrq.substring(0, 6);
            // 根据此时导入的excel中第一行的清算日期年月，查询数据库中最近一条导入时间
            Date createTime = jfzdService.selectCreateTime(substrQsrq);
            if (createTime != null) {
                // 格式化时间
                SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
                formatCreateTime = formatter.format(createTime);
            }
        }
        list.add(data);
        // 达到BATCH_COUNT了，需要去存储一次数据库，防止数据几万条数据在内存，容易OOM
        if (list.size() >= BATCH_COUNT) {
            saveData();
            // 存储完成清理 list
            list.clear();
        }
    }

    /**
     * 所有数据解析完成了 都会来调用
     *
     * @param context
     */
    @Override
    public void doAfterAllAnalysed(AnalysisContext context) {  // 解析结束销毁不用的资源  必须实现的方法
        // 这里也要保存数据，确保最后遗留的数据也存储到数据库
        saveData();
        // 删除当月重复数据
        if (formatCreateTime != null) {
            deleteData();
        }
        LOGGER.info("所有数据解析完成！");
    }

    /**
     * 加上存储数据库
     */
    private void saveData() {
//        LOGGER.info("{}条数据，开始存储数据库！", list.size());
        int listSize = list.size();
        int toIndex = BATCH_COUNT;
        for (int i = 0; i < list.size(); i += BATCH_COUNT) {
            if (i + BATCH_COUNT > listSize) { // 作用为toIndex最后没有1000条数据则剩余几条newList中就装几条
                toIndex = listSize - i;
            }
            List<Pos_dr_upload> pos_dr_upload = list.subList(i, i + toIndex);
            //批量插入
            jfzdService.insertBatch(pos_dr_upload);  // 方法一
//            pos_dr_uploadService.executeInsert(pos_dr_upload);   // 方法二
        }
//        LOGGER.info("存储数据库成功！");
    }

    /**
     * 删除当月重复数据
     */
    private void deleteData() {
        jfzdService.deleteByDate(substrQsrq,formatCreateTime);
        LOGGER.info("substrQsrq：{}", substrQsrq);
        LOGGER.info("createTime：{}", formatCreateTime);
        LOGGER.info("删除重复数据成功！");
    }
}
