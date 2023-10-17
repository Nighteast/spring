package com.example.spring;

import jakarta.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class MyApp13 {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(MyApp13.class, args);
    }
}

@Component
class MyClass26 {

    @PostConstruct  //di 완료 후 바로 실행
    public void method1() {
        System.out.println("MyClass26.method1");
    }
}
