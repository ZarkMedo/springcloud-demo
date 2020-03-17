package com.medo.dao;

import com.medo.eneities.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @ClassName: DeptMapper
 * @Auther: medo
 * @Date: 2020-03-17 11:51
 * @Description: TODO
 **/
@Mapper
public interface DeptMapper {

    boolean addDept(Dept dept);

    Dept findById(Long id);

    List<Dept> findAll();


}
