package com.example.spring.controller;

import com.example.spring.dao.MyDao10;
import com.example.spring.domain.MyDto33Employee;
import com.example.spring.domain.MyDto34Customers;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//@Controller
//@ResponseBody   // 모든 메서드에 적용됨
@RestController // @Controller + @ResponseBody
@RequiredArgsConstructor
@RequestMapping("api/main1")
public class RestController1 {

    private final MyDao10 dao;

    // http://localhost:8080/api/main1/sub1
    @GetMapping("sub1")
    public String method1() {

        return "customer name!!!";
    }

    // http://localhost:8080/api/main1/sub2
    // get 요청 시
    // 5번 고객의 customerName 응답
    @GetMapping("sub2")
    public String method2() {

        return dao.selectCustomerById(6);
    }

    @GetMapping("sub3")
    public MyDto34Customers method3() {
        return dao.getCustomer();
    }

    // /api/main1/sub4?id=10
    @GetMapping("sub4")
    public ResponseEntity<MyDto34Customers> method4(Integer id) {

        MyDto34Customers customer = dao.getCustomerById(id);

        if (customer == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(customer);
    }

    @GetMapping("sub5")
    public ResponseEntity<MyDto33Employee> method5(Integer id) {

        MyDto33Employee employee = dao.getEmployeeById(id);

        if (employee == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(employee);
    }

    @GetMapping("sub6")
    public List<Integer> method6() {
        return dao.getCustomerIdList();
    }

    @GetMapping("sub7")
    public List<Integer> method7() {
        return dao.getEmployeeIdList();
    }

}
