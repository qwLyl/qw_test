package com.zckj.demo.dao.Jfzd;

import com.zckj.demo.bean.Jfzd.Org_gy;
import com.zckj.demo.bean.Jfzd.Pos_dr;
import com.zckj.demo.bean.Jfzd.Pos_dr_upload;
import com.zckj.demo.bean.Jfzd.Pos_info;
import com.zckj.demo.bean.Jfzd.Pos_tj;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Mapper
@Repository
public interface JfzdDao {
    // 查询县级单位
    public List<Org_gy> selectOrg(String grade);

    //查询县级下属单位
    public List<Org_gy> selectOrgXj(@Param("orgno")String orgno);

    int insert(Pos_dr_upload pos_dr);

    /**
     * 上传excel
     *
     * @param pos_dr_uploadList
     * @return
     */
    int insertBatch(List<Pos_dr_upload> pos_dr_uploadList);

    /**
     * 删除重复数据
     * @param qsrq
     * @param createtime
     * @return
     */
    boolean deleteByDate(@Param("qsrq") String qsrq, @Param("createtime") String createtime);

    /**
     * 根据清算日期查询数据库中当月最近一条上传时间
     * @param qsrq
     * @return
     */
    Date selectCreateTime(@Param("qsrq")String qsrq);

    // 按清算月时间查询
    public List<Pos_dr_upload> selectuploadFy(@Param("month") String month);
    public List<Pos_dr_upload> selectupload(@Param("month") String month);

    // 按日期查询无档案POS
    public List<Pos_dr> selectRq(String month);

    // 按日期查询县公司POS
    public List<Pos_dr> selectRqXgs(String month);

    // 按日期查询供电所POS
    public List<Pos_dr> selectRqGds(String month);

    // 按县级以下,possid号查询
    public List<Pos_info> selectPos(@Param("orgno") String orgno, @Param("posid") String posid);

    // 查询 没有pos机号的
    public List<Pos_info> selectSj(@Param("orgno") String orgno);

    // 查询市级所有供电所 及 县级下的所有供电所
    public List<Pos_info> selectXj(@Param("orgno") String orgno);

    // 添加功能
    public int insert_possgl(Pos_info pos_info);

    // 修改功能
    public int updata(Pos_info pos_info);

    // 按日期查询POS机交易统计
    public List<Pos_tj> selectTj(String month);
}
