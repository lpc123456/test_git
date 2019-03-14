package com.baidu.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController
public class DeptController {


    @RequestMapping("findList")
    public String hh(){


        return "哈哈哈";
    }


}
