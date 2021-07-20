package com.zckj.demo.dao.Clgl;

import com.zckj.demo.bean.Clgl.Pcd;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ClglDao {
    List<Pcd> Select_cl_info(Pcd pcd);
    List<Pcd> Select_cl_info_vn(Pcd pcd);
    List<Pcd> Select_cl_info_more(Pcd pcd);

}
