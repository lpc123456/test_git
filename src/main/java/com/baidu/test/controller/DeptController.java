package com.baidu.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController
public class DeptController {


    //查询全部
    @RequestMapping("findList")
    public String hh(){


        return "哈哈哈";
    }

    //查询全部2
    @RequestMapping("findAll")
    public  String findAll(){

        //查询全部
        return "又查询了全部";

    }

}
