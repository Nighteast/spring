package com.example.spring.service;

import com.example.spring.dao.MyDao9;
import com.example.spring.domain.MyDto33Employee;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MyService2 {

    private final MyDao9 dao;

    public boolean validate(MyDto33Employee dto) {
        if (dto.getBirthDate() == null) {
            return false;
        }
        
        if (dto.getFirstName() == null || dto.getFirstName().isBlank()) {
            return false;
        }
        
        if (dto.getLastName() == null || dto.getLastName().isBlank()) {
            return false;
        }
        
        if (dto.getNotes() == null || dto.getNotes().isBlank()) {
            return false;
        }
        return true;

    }

    public int add(MyDto33Employee dto) {
        return dao.insertEmployee(dto);
    }
}
