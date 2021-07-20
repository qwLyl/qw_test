package com.zckj.demo.common.utils;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.zckj.demo.bean.Ny.Ads_ny_meal;
import com.zckj.demo.service.Ny.NyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Ads_uploadListener extends AnalysisEventListener<Ads_ny_meal> {

    // 目的：使用指定的类XXX初始化日志对象,方便在日志输出的时候,可以打印出日志信息所属的类.
    private static final Logger LOGGER = LoggerFactory.getLogger(Ads_uploadListener.class);
    /**
     * 每隔5条存储数据库，实际使用中可以3000条，然后清理list ，方便内存回收
     */
    private static final int BATCH_COUNT = 1000;

    List<Ads_ny_meal> list = new ArrayList<Ads_ny_meal>();
    /**
     * 假设这个是一个DAO，当然有业务逻辑这个也可以是一个service。当然如果不用存储这个对象没用。
     */
    private NyService nyService;

    public Ads_uploadListener() {
    }

    /**
     * 如果使用了spring,请使用这个构造方法。每次创建Listener的时候需要把spring管理的类传进来
     *
     * @param nyService
     */
    public Ads_uploadListener(NyService nyService) {
        this.nyService = nyService;
    }

    /**
     * 这个每一条数据解析都会来调用
     *
     * @param data    one row value. Is is same as {@link AnalysisContext#readRowHolder()}
     * @param context
     */
    @Override
    public void invoke(Ads_ny_meal data, AnalysisContext context) {  // 自行写业务逻辑  必须实现的方法
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
        LOGGER.info("所有数据解析完成！");
    }

    /**
     * 加上存储数据库
     */
    private void saveData() {
        int listSize = list.size();
        int toIndex = BATCH_COUNT;
        for (int i = 0; i < list.size(); i += BATCH_COUNT) {
            if (i + BATCH_COUNT > listSize) { // 作用为toIndex最后没有1000条数据则剩余几条newList中就装几条
                toIndex = listSize - i;
            }
            List<Ads_ny_meal> ads_ny_meals = list.subList(i, i + toIndex);
            //批量插入
            nyService.ads_uploadInsert(ads_ny_meals);  // 方法一
        }
    }

}

