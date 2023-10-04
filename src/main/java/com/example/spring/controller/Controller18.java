package com.example.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("main18")
public class Controller18 {

    // GET /main18/sub1
    @GetMapping("sub1")
    public void method1() {


    }
}
