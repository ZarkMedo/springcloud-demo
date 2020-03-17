package com.medo.controller;

import com.medo.eneities.Dept;
import com.medo.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

/**
 * @ClassName: DeptController
 * @Auther: medo
 * @Date: 2020-03-17 12:25
 * @Description: TODO
 **/
@RestController("deptController")
@RequestMapping("/dept")
public class DeptController {
    @Autowired
    DeptService deptService;

    @PostMapping("/add")
    public boolean addDept(@RequestBody Dept dept){
        return deptService.add(dept);
    }

    @GetMapping("/get/{id}")
    public Dept findById(@PathVariable("id") long id){
        return deptService.findById(id);
    }

    @GetMapping("/list")
    public List<Dept> list(){
        return deptService.findAll();
    }
}
