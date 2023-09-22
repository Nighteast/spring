package com.example.spring.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MyDto9 {
    private Long id;
    private String firstName;
    private String lastName;
    private String className;
    private String phoneNumber;
}
