package com.example.spring.dao;

import com.example.spring.domain.MyDto34Customers;
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

    @Select("""
            SELECT 
             CustomerID id,
             CustomerName name,
             ContactName
             address,
             city,
             PostalCode,
             Country
            FROM customers
            WHERE CustomerID = 6
            """)
    MyDto34Customers getCustomer();
}
