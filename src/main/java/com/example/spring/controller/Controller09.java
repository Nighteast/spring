package com.example.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;


@Controller
@RequestMapping("main9")
public class Controller09 {
    @RequestMapping("sub1")
    public void method1(Model model) {
        model.addAttribute("attr1", "son");
        model.addAttribute("attr2", 300);
        model.addAttribute("attr3", true);
        model.addAttribute("attr4", 3.1459);

        // 모델 속성이 배열일 경우
        model.addAttribute("attr5", new String[]{"lee", "kim"});
        String[] myArr1 = {"korea", "seoul", "jeju"};
        model.addAttribute("yourArr6", myArr1);
    }

    @RequestMapping("sub2")
    public void method2(Model model) {
        String[] arr1 = {"Hanma", "dotpo", "baki"};
        Integer[] arr2 = {1, 2, 3};
        Boolean[] arr3 = {true, false, true};

        model.addAttribute("myName", arr1);
        model.addAttribute("yourEmail", arr2);
        model.addAttribute("herAddress", arr3);
    }

    @RequestMapping("sub3")
    public void method3(Model model) {
        model.addAttribute("names", List.of("영남", "원석", "동규"));
        model.addAttribute("list1", List.of("무빙", "엘리멘탈"));
        model.addAttribute("mapList1", List.of("1", "a", "2", "b", "3", "c"));
        model.addAttribute("cities", new String[]{"천국", "지옥", "연옥", "단테"});
    }
}
