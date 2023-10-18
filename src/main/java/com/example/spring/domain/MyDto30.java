package com.example.spring.domain;

import lombok.Data;

@Data
public class MyDto30 {
    private String keyword;

    public String getKeyword() {
        if (keyword == null) {
            return "%%";
        }
        return "%" + keyword + "%";
    }
}
