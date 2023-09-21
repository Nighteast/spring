package com.example.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controller02 {
    @RequestMapping("/main1/sub1")
    public void method1() {
        System.out.println("Controller02.method1");
    }

    // main1/sub2 메서드 작성
    @RequestMapping("main1/sub2")
    public void method2() {
        System.out.println("Controller02.method2");
    }
}
