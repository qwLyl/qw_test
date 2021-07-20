package com.zckj.demo.dao;

import com.zckj.demo.bean.Org;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface BaseDao {

    /**
     * 返回用户供电单位范围
     * @param orgno 用户单位编号
     * @return
     */
    public Org getOrg(String orgno);
    /**
     * 查询操作员年在及下属单位列表
     * @param orgno 用户所在单位编号
     * @return List<Org>
     */
    public List<Org> selectOrg(String orgno);
    public List<Org> SelectOrg();
}
