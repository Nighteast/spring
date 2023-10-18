package com.example.spring.dao;

import com.example.spring.domain.*;
import org.apache.ibatis.annotations.Insert;
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

    @Select("""
            SELECT COUNT(OrderID)
            FROM orders
            WHERE OrderDate BETWEEN #{dto1.from} AND #{dto2.to}
            """)
    Integer select6(MyDto27 dto1, MyDto28 dto2);

    @Select("""
            SELECT CustomerName
            FROM customers
            WHERE CustomerName LIKE #{dto2.keyword}
            LIMIT #{dto1.from}, #{dto1.rows}
            """)
    List<String> select7(MyDto29 dto1, MyDto30 dto2);


    @Insert("""
            INSERT INTO customers (CustomerName, Country)
            VALUE (#{name}, #{country})
            """)
    int insert1(MyDto31 dto);

    @Insert("""
            INSERT INTO employees (LastName, FirstName)
            VALUE (#{lastName}, #{firstName})
            """)
    int insert2(MyDto32 emp);
}
