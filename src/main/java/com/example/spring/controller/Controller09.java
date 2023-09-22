package com.example.spring.controller;

import com.example.spring.domain.MyDto7;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;
import java.util.Scanner;


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
        var list2 = List.of("1", "a", "2", "b", "3", "c");
        model.addAttribute("mapList1", list2);
        model.addAttribute("cities", new String[]{"천국", "지옥", "연옥", "단테"});
    }

    @RequestMapping("sub4")
    public void method4(Model model) {
        var map1 = Map.of("son", 7, "lee", 19, "kim", 30);
        model.addAttribute("myMap", map1);
        model.addAttribute("myMap", map1);
        var cityMap = Map.of("seoul", "서울", "busan", "부산");
        var color = Map.of("red", "빨강", "blue", "파랑", "black", "검정");
        model.addAttribute("cityMap", cityMap);
        model.addAttribute("color", color);

        var map3 = Map.of(
                "name", "두식",
                "my name", "봉식",
                "your-name", "창석"
        );
        model.addAttribute("attr3", map3);
    }

    @RequestMapping("sub5")
    public void method5(Model model) {
        var map1 = Map.of("phone1", "iphone", "phone2", "galaxy");
        var map2 = Map.of("korea", "seoul", "us", "ny");
        var map3 = Map.of("1st", "hamburger", "2nd", "pizza");

        model.addAttribute("korea", "us");
        model.addAttribute("phones", map1);
        model.addAttribute("caps", map2);
        model.addAttribute("food", map3);

    }

    @RequestMapping("sub6")
    public void method6(Model model) {
        model.addAttribute("attr1", new Object());
        model.addAttribute("attr2", new Scanner(System.in));
        model.addAttribute("attr3", new MyDto7());

    }
}