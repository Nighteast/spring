package com.example.spring.controller;

import com.example.spring.dao.MyDao3;
import com.example.spring.domain.MyDto19;
import com.example.spring.domain.MyDto20;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Controller
@RequiredArgsConstructor
@RequestMapping("main29")
public class Controller29 {

    private final MyDao3 dao3;

    @GetMapping("sub1")
    public void method1() {
        String name = dao3.select1();
        System.out.println("name = " + name);
    }

    @GetMapping("sub2")
    public void method2() {
        Double price = dao3.select2();
        System.out.println("price = " + price);
    }

    @GetMapping("sub3")
    public void method3() {
        // 1번 직원의 LastName 조회 후 출력
        String lastName = dao3.select3();
        System.out.println("lastName = " + lastName);
    }

    @GetMapping("sub4")
    public void method4() {
        // 2번 직원의 생일 조회 후 출력
        LocalDate birth = dao3.select4();
        System.out.println("birth = " + birth);
    }

    @GetMapping("sub5")
    public void method5() {
        List<String> countrys = dao3.select5();
        countrys.forEach(System.out::println);
    }

    @GetMapping("sub6")
    public void method6() {
        // 직원들의 생일 조회
        List<LocalDate> births = dao3.select6();
        births.forEach(System.out::println);
        System.out.println("births.size() = " + births.size());
    }

    @GetMapping("sub7")
    public void method7() {
        // 상품의 가격들 조회
        List<Double> priceList = dao3.select7();
        priceList.forEach(System.out::println);
        System.out.println("priceList.size() = " + priceList.size());
    }

    @GetMapping("sub8")
    public void method8() {
        Map<String, Object> row = dao3.select8();
        System.out.println("row = " + row);
    }

    @GetMapping("sub9")
    public void method9() {
        // 1번 상품의 상품명, 가격, 카테고리명
        Map<String, Object> row = dao3.select9();
        System.out.println("row = " + row);
        row.entrySet().forEach(System.out::println);
    }

    @GetMapping("sub10")
    public void method10() {
        MyDto19 dto = dao3.select10();
        System.out.println("dto = " + dto);
    }

    @GetMapping("sub11")
    public void method11() {
        MyDto20 dto = dao3.select11();
        System.out.println("dto = " + dto);
    }
}
