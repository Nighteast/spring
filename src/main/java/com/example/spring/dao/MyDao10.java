package com.example.spring.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface MyDao10 {

    @Select("""
            SELECT CustomerName
            FROM customers
            WHERE CustomerID = #{id}
            """)
    String selectCustomerById(Integer id);
}
