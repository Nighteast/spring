package com.example.spring.domain;

import lombok.Data;
import org.springframework.web.bind.annotation.RequestParam;

@Data
public class MyDto19Employee {
    private String lastName;
    private String firstName;
    private String birthDate;
    private String photo;
    private String notes;
    private Integer id;

//    @RequestParam("lastName") String lastName,
//    @RequestParam("firstName") String firstName,
//    @RequestParam("birthDate") String birthDate,
//    @RequestParam("photo") String photo,
//    @RequestParam("notes") String notes,
//    @RequestParam("id") Integer employeeId
}
