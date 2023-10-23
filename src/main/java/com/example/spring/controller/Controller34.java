package com.example.spring.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import software.amazon.awssdk.services.s3.S3Client;

@Controller
@RequiredArgsConstructor
@RequestMapping("main34")
public class Controller34 {

    private final S3Client s3Client;

    @GetMapping("sub1")
    public void method1() {

    }

    @PostMapping("sub2")
    public void method2(MultipartFile file) {
        s3Client.putObject();
    }
}
