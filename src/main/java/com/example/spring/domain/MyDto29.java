package com.example.spring.domain;

import lombok.Data;

@Data
public class MyDto29 {
    private Integer page;
    private Integer rows;
//    private Integer from;
    private Integer getFrom() {
        return (page - 1) * rows;
    }

}
