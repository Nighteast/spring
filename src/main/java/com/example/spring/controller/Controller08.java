package com.example.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("main8")
public class Controller08 {

    @RequestMapping("sub1")
    public void method1(Model model) {
        model.addAttribute("attr1", "🫠value1"); // model 객체에 value1을 담았고 그 이름표는 attr1
        model.addAttribute("attr2", "value2");
        // forward to /WEB-INF/jsp/main8/sub1.jsp
    }

    @RequestMapping("sub2")
    public void method2(Model model) {
        model.addAttribute("propone", "🫠");
        model.addAttribute("propTWO", "🎶");
    }
}
