package com.example.spring.dao;

import com.example.spring.domain.MyDto33Employee;
import com.example.spring.domain.MyDto45;
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

    @Select("""
            SELECT p.ProductID id,
                    p.Price,
                    c.CategoryName category,
                    p.Unit
            FROM products p 
                JOIN categories c ON p.CategoryID = c.CategoryID
            WHERE ProductID = #{id}
            """)
    MyDto45 selectProductById2(Integer id);
}
