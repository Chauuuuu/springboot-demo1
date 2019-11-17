package com.atguigu.springbootdemo.controller;

import com.alibaba.druid.pool.DruidDataSource;
import com.atguigu.springbootdemo.mapper.TAdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class testController {

    @Autowired
    TAdminMapper tAdminMapper;

    @Autowired(required = false)
    DruidDataSource dataSource;

    @ResponseBody
    @GetMapping("/hehe")
    public String springBootDemo01(){
       return dataSource+"";
    }
}
