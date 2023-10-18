package com.example.spring.dao;

import com.example.spring.domain.MyDto25;
import com.example.spring.domain.MyDto26;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.time.LocalDate;
import java.util.List;

@Mapper
public interface MyDao4 {

    @Select("""
            SELECT CustomerName
            FROM customers
            WHERE CustomerID = #{asdasd}
            """)
    // 파라미터가 하나면 이름이 일치하지 않아도 됨
    String select1(int customerId);

    @Select("""
            SELECT ProductName
            FROM products
            WHERE Price BETWEEN #{from} AND #{to}
            """)
    List<String> select2(Double from, Double to);

    @Select("""
            SELECT DISTINCT ProductName
            FROM products p 
                JOIN orderdetails od on p.ProductID = od.ProductID
                JOIN orders o ON od.OrderID = o.OrderID
            WHERE o.OrderDate BETWEEN #{from} AND #{to}
            ORDER BY 1
            """)
    List<String> select3(LocalDate from, LocalDate to);
    @Select("""
            SELECT ProductName
            FROM products
            WHERE Price BETWEEN #{min} AND #{max}
            """)
    List<String> select4(MyDto25 dto);

    @Select("""
            SELECT CustomerName
            FROM customers
            WHERE Country IN (#{country1}, #{country2})
            """)
//    WHERE Country = #{country1} OR Country = #{country2}
    List<String> select5(MyDto26 dto);



}
