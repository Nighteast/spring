package com.example.spring.domain;

import lombok.Getter;

public class MyDto35 {
    private String id;
    // 프로퍼티명 : id
    // get을 탈락시키고 첫번째 문자를 소문자로 바꿈

//    @Getter // lombok은 앞글자를 무조건 대문자로 만들어 버린다. 주의
    private String uRL;

    public String getuRL() {
        return uRL;
    }

    public String getId() {
        return id;
    }

    // java bean 에서 프로퍼티명을 유추하는 방법
    // 앞글자가 연속해서 대문자라면 대문자로 유추
}
