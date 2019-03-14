package com.baidu.test.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController
public class DeptController {


    @RequestMapping("findList")
    public String hh(){


        return "哈哈哈";
    }

    @RequestMapping("findById/{id}")
    public String findById(@PathVariable("id") Integer id){
        return "你的Id为"+id;
    }


}
