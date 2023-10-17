package com.example.spring;


import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

public class MyApp10 {
    public static void main(String[] args) {

    }
}

interface MyInterface1 {

}

@Component
class MyClass18 implements MyInterface1 {

}

@Component
class MyClass19 implements MyInterface1 {

}

@Component
//@RequiredArgsConstructor
class MyClass17 {

    private final MyInterface1 field1;

    public MyClass17(@Qualifier("myClass18") MyInterface1 field1) {
        this.field1 = field1;
    }
}
