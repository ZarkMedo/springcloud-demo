package com.medo.controller;

import com.medo.eneities.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @ClassName: ConsumerController
 * @Auther: medo
 * @Date: 2020-03-19 12:16
 * @Description: TODO
 **/
@RestController
@RequestMapping("/consumer")
public class ConsumerController {
    private final String PER_URL = "http://localhost:8001/";

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/get/{id}")
    public Dept get(@PathVariable("id") long id){
        return restTemplate.getForObject(PER_URL+"/dept/get/"+id, Dept.class);
    }
    @GetMapping("/list")
    public List<Dept> getList(){
        return restTemplate.getForObject(PER_URL+"/dept/list/", List.class);
    }

    @PostMapping("/add")
    public boolean add(@RequestBody Dept dept){
        return restTemplate.postForObject(PER_URL+"/dept/add", dept, Boolean.class);

    }
}
