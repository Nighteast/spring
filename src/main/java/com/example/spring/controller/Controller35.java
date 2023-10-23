package com.example.spring.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("main35")
public class Controller35 {
    @GetMapping("sub1")
    public void method1() {
    }

    @GetMapping("sub2")
    public void method2() {
        System.out.println("Controller35.method2");
    }

    @GetMapping("sub3")
    public void method3(String address) {
        System.out.println("address = " + address);
    }
}
