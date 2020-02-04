package com.learn.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 20992
 * @Date 2020/2/4
 */
@RestController
public class HelloController {

    @RequestMapping("info")
    public String info() {
        return "Hello SpringBoot Info";
    }

    //开发人员写了一段话
}
