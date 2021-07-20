package com.zckj.demo.service;

import com.zckj.demo.bean.Org;
import com.zckj.demo.dao.BaseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
public class BaseService {
    @Autowired
    private BaseDao baseDao;

    public Org getOrg(String orgno) {
        Org org = baseDao.getOrg(orgno);
        return org;
    }

    public List<Org> selectOrg(String orgno) {
        List<Org> org = baseDao.selectOrg(orgno);
        return org;
    }

    public List<Org> SelectOrg() {
        List<Org> org = baseDao.SelectOrg();
        return  org;
    }
}
