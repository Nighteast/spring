package com.example.spring.domain;

public class MyDto7 {

    public String getName() { // field랑 관련이 없다. 메서드에의해서 결정된다.
        return "원붕";
    }

    @Override
    public String toString() {
        return "내가 만든 클래스😎";
    }

}
