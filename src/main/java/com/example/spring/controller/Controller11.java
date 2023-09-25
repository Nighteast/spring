package com.example.spring.controller;

import com.example.spring.domain.MyDto9;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("main11")
public class Controller11 {
    @RequestMapping("sub1")
    public void method1() {

    }

    @RequestMapping("sub2")
    public void method2() {

    }

    @RequestMapping("sub3")
    public void method3() {

    }

    @RequestMapping({"sub4", "sub5", "sub6"})   //중괄호{}안에 쉼표로 여러개 사용 가능
    public void method4() {
    }

    @RequestMapping("sub7")
    public void method5(
            @RequestParam(value ="show", defaultValue = "flase") Boolean show,
                        Model model) {
        if (show) {
            List<MyDto9> list = new ArrayList<>();
            list.add(new MyDto9(31L, "son", "hm", "football", "010"));
            list.add(new MyDto9(32L, "lee", "aa", "paris", "011"));
            list.add(new MyDto9(33L, "kim", "nn", "tokyo", "082"));
            list.add(new MyDto9(34L, "jung", "ss", "seoul", "032"));
            list.add(new MyDto9(35L, "yong", "hh", "busan", "014"));

            model.addAttribute("moving", list);
        }
    }
}
