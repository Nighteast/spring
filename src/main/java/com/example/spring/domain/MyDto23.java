package com.example.spring.domain;

import lombok.Data;

import java.time.LocalDate;

@Data
public class MyDto23 {
    private Integer categoryId;
    private LocalDate orderDate;
    private String productName;
    private String categoryName;
    private Integer quantity;
    private Double price;
}
