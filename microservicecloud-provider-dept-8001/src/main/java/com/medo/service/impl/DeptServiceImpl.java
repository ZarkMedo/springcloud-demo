package com.medo.service.impl;

import com.medo.dao.DeptMapper;
import com.medo.eneities.Dept;
import com.medo.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName: DeptServiceImpl
 * @Auther: medo
 * @Date: 2020-03-17 12:22
 * @Description: TODO
 **/

@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    DeptMapper deptMapper;

    @Override
    public Dept findById(Long id) {
        return deptMapper.findById(id);
    }

    @Override
    public List<Dept> findAll() {
        return deptMapper.findAll();
    }

    @Override
    public boolean add(Dept dept) {
        return deptMapper.addDept(dept);
    }
}
