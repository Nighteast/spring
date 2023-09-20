package com.example.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // 주석을 달아서 Spring이 컨트롤러를 알게 한다.
public class Controller01 {
    @RequestMapping("/")
    public void method1() {
        System.out.println("Controller01.method1");
    }

    @RequestMapping("/path1")
    public void method2() {
        System.out.println("Controller01.method2");
    }

    // /path2 로 요청 왔을 때 일하는 메서드 작성
    @RequestMapping("/path2")
    public void method3() {
        System.out.println("Controller01.method3");
    }
}
