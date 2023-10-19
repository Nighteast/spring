package com.example.spring.controller;

import com.example.spring.dao.MyDao5;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("main31")
public class Controller31 {

    private final MyDao5 dao;

    @GetMapping("sub1")
    public void method1() {
        String res1 = dao.select1("mexico");
        System.out.println("res1 = " + res1);

        String res2 = dao.select1(null);
        System.out.println("res2 = " + res2);

    }

    @GetMapping("sub2")
    public void method2(Integer num) {
        List<String> strings = dao.select2(num);

    }
}
