package com.example.spring.controller;

import com.example.spring.dao.MyDao6;
import com.example.spring.domain.MyDto37;
import com.example.spring.domain.MyDto38;
import com.example.spring.service.MyService1;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequiredArgsConstructor
@RequestMapping("main32")
public class Controller32 {

    private final MyDao6 dao;
    private final MyService1 service;

    @GetMapping("sub1")
    public void method1(MyDto37 dto) {
        dao.insert1(dto);

        System.out.println("dto = " + dto);
    }

    // /main32/sub2?lastName=흥민
    @GetMapping("sub2")
    public void method2(MyDto38 dto) {
        dao.insert2(dto);   // 직원 테이블에 lastName 입력

        System.out.println("dto = " + dto); // 새 직원이 번호(키)와 lastName출력
    }

    @GetMapping("sub3")
    public void method3() {

    }

    @PostMapping("sub4")
    public String method4(MyDto38 dto, RedirectAttributes rttr) {
        dao.insert3(dto);

        rttr.addFlashAttribute("message",
                dto.getEid() + "번 직원 등록되었습니다.");

        return "redirect:/main32/sub3";
    }

    @GetMapping("sub5")
    public void method5() {
        try {
            service.tx1();
        } finally {
            System.out.println("dao.select3() = " + dao.select3());
        }
    }


}
