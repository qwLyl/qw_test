package com.zckj.demo.service.Jfzd;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zckj.demo.bean.Jfzd.Org_gy;
import com.zckj.demo.bean.Jfzd.Pos_dr;
import com.zckj.demo.bean.Jfzd.Pos_dr_upload;
import com.zckj.demo.bean.Jfzd.Pos_info;
import com.zckj.demo.bean.Jfzd.Pos_tj;
import com.zckj.demo.bean.Result;
import com.zckj.demo.common.utils.OracleConnections;
import com.zckj.demo.dao.Jfzd.JfzdDao;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

@Service
public class JfzdService {
    static Logger logger = LogManager.getLogger(JfzdService.class); // 日志记录

    @Autowired
    private JfzdDao jfzdDao;

    // 查询县级单位
    public List<Org_gy> selectOrg(String grade){
        return jfzdDao.selectOrg(grade);
    }

    //查询县级下属单位
    public List<Org_gy> selectOrgXj(String orgno){
        return jfzdDao.selectOrgXj(orgno);
    }

    // 按清算月时间查询
    public List<Pos_dr_upload> selectupload(String month){
        return jfzdDao.selectupload(month);
    }

    public PageInfo<Pos_dr_upload> selectuploadFy(String month,int pageNum, int pageSize){
        PageHelper.startPage(pageNum,pageSize);  //pageNum为页码，pageSize为页面大小
        List<Pos_dr_upload> List = jfzdDao.selectuploadFy(month);
        PageInfo<Pos_dr_upload> pageInfo = new PageInfo<Pos_dr_upload>(List);
        return pageInfo;
    }

    /**
     * 批量插入excel数据
     * @param pos_dr_upload
     */
    public void insertBatch(List<Pos_dr_upload> pos_dr_upload) {
        jfzdDao.insertBatch(pos_dr_upload);
    }

    /**
     * 删除当月重复数据
     * @param substring
     * @param createTime
     * @return
     */
    public boolean deleteByDate(String substring, String createTime) {
        return jfzdDao.deleteByDate(substring,createTime);
    }

    /**
     * 根据清算日期，查询数据库中当月最近一条上传时间
     * @param qsrq
     * @return
     */
    public Date selectCreateTime(String qsrq) {
        return jfzdDao.selectCreateTime(qsrq);
    }

    // 按日期查询无档案POS
    public List<Pos_dr> selectRq(String month){
        return jfzdDao.selectRq(month);
    }

    // 按日期查询县公司POS
    public List<Pos_dr> selectRqXgs(String month){
        return jfzdDao.selectRqXgs(month);
    }

    // 按日期查询供电所POS
    public List<Pos_dr> selectRqGds(String month){
        return jfzdDao.selectRqGds(month);
    }

    // 按县级以下,possid号查询
    public List<Pos_info> selectGprs( String orgno,  String posid){
        return jfzdDao.selectPos(orgno,posid);
    }

    // 查询市级所有供电所
    public List<Pos_info> selectSj(String orgno){
        return jfzdDao.selectSj(orgno);
    }

    // 查询 县级下的所有供电所
    public List<Pos_info> selectXj(String orgno){
        return jfzdDao.selectXj(orgno);
    }

    // 添加功能
    public Result insert_possgl (Pos_info pos_info){
        Result Result = new Result();
        Result.init();
        try {
            int t = jfzdDao.insert_possgl(pos_info);
        } catch (Exception e) {
            Result.setId("-1");
            Result.setInfo(e.getMessage());
        }
        return Result;
    }

    // 修改功能
    public Result updata(Pos_info pos_info){
        Result Result = new Result();
        Result.init();
        try {
            String t =Integer.toString(jfzdDao.updata(pos_info));
            Result.setId(t);
        } catch (Exception e) {
            Result.setId("-1");
            Result.setInfo(e.getMessage());
        }
        return Result;
    }

    // 按日期查询POS机交易统计
    public List<Pos_tj> selectTj(String month){
        return jfzdDao.selectTj(month);
    }

}
