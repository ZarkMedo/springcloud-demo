package com.medo.service;

import com.medo.dao.DeptMapper;
import com.medo.eneities.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public interface DeptService {

    Dept findById(Long id);

    List<Dept> findAll();

    boolean add(Dept dept);
}
