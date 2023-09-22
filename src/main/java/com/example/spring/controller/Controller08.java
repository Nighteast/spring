package com.example.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

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

    @RequestMapping("sub3")
    public void method3(Model model) {
        // view name : /main8/sub3
        // /WEB-INF/jsp/main8/sub3.jsp
        model.addAttribute("myName", "한마유지로");
        model.addAttribute("yourAddress", List.of(4, 5));
        model.addAttribute("herEmail", Map.of("a","b"));

    }
}
