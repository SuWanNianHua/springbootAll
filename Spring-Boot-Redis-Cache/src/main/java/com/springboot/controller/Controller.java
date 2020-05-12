package com.springboot.controller;


import com.springboot.service.StudentService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author 张佳奇
 * @Description
 * @Date 2020-05-12 09:24
 */
@RestController
public class Controller {

    @Resource
    StudentService studentService;
    @RequestMapping("test")
    public String ngetname(String name){
        return studentService.getName(name);
    }
}
