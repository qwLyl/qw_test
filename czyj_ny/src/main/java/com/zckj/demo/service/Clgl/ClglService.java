package com.zckj.demo.service.Clgl;

import com.zckj.demo.bean.Clgl.Pcd;
import com.zckj.demo.dao.Clgl.ClglDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
public class ClglService {
    @Autowired
    private ClglDao clglDao;

    public List<Pcd> Select_cl_info(Pcd pcd)  {
        return clglDao.Select_cl_info(pcd);
    }

    public List<Pcd> Select_cl_info_vn(Pcd pcd)  {
        return clglDao.Select_cl_info_vn(pcd);
    }

    public List<Pcd> Select_cl_info_more(Pcd pcd)  {
        return clglDao.Select_cl_info_more(pcd);
    }

}
