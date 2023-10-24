package com.example.spring.dao;

import com.example.spring.domain.MyDto33Employee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.Map;

@Mapper
public interface MyDao8 {

    @Select("""
            SELECT *
            FROM products
            WHERE ProductID = #{id}
            """)
    Map<String, Object> selectProductById(Integer id);

    @Select("""
            SELECT EmployeeID id,
                    firstName,
                    lastName,
                    birthDate,
                    photo,
                    notes 
            FROM employees
            WHERE EmployeeID = #{id}
            """)
    MyDto33Employee selectByEmployeeId(Integer id);
}
