package com.example.spring.dao;

import com.example.spring.domain.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Mapper
public interface MyDao3 {

    // 1행 1열
    @Select("""
            SELECT CustomerName FROM customers
            WHERE CustomerID = 1
            """)
    String select1();

    @Select("""
            SELECT Price FROM products
            WHERE ProductID = 1
            """)
    Double select2();

    @Select("""
            SELECT LastName FROM employees
            WHERE EmployeeID = 1
            """)
    String select3();

    @Select("""
            SELECT BirthDate FROM employees
            WHERE EmployeeID = 2
            """)
    LocalDate select4();

    @Select("""
            SELECT DISTINCT Country FROM customers
            ORDER BY 1
            """)
    List<String> select5();

    @Select("""
            SELECT BirthDate FROM employees
            ORDER BY 1
            """)
    List<LocalDate> select6();

    @Select("""
            SELECT Price FROM products
            ORDER BY 1
            """)
    List<Double> select7();

    @Select("""
            SELECT CustomerID, CustomerName, Address 
            FROM customers
            WHERE CustomerID = 1
            """)
    Map<String, Object> select8();  // 하나의 행 여러 열

    @Select("""
            SELECT ProductName pname, Price, CategoryName category
            FROM products p JOIN categories c
            ON p.CategoryID = c.CategoryID 
            WHERE p.ProductID = 1
            """)
    Map<String, Object> select9();  // <컬럼명, 행의 값>

    @Select("""
            SELECT EmployeeID, LastName, FirstName
            FROM employees
            WHERE EmployeeID = 1
            """)
    MyDto19 select10();

    @Select("""
            SELECT ProductName name, Price, CategoryName category
            FROM products p JOIN categories c ON p.CategoryID = c.CategoryID
            WHERE ProductID = 1
            """)
    MyDto20 select11();

    @Select("""
            SELECT CustomerID id, CustomerName name, Country
            FROM customers
            WHERE CustomerID = 2
            """)
    MyDto21 select12();

    @Select("""
            SELECT ProductID id, 
                   ProductName name, 
                   Price
            FROM products
            WHERE CategoryID = 2
            ORDER BY Price
            """)
    List<Map<String, Object>> select13();

    @Select("""
            SELECT ProductName name, Quantity 수량, Price
            FROM products p 
                JOIN orderdetails od
                    ON p.ProductID = od.ProductID
                JOIN orders o 
                    ON od.OrderID = o.OrderID
            WHERE o.OrderDate = '1996-07-04'
            ORDER BY name
            """)
    List<Map<String, Object>> select14();

    @Select("""
            SELECT ProductName name, Quantity, Price
            FROM products p 
                JOIN orderdetails od
                    ON p.ProductID = od.ProductID
                JOIN orders o 
                    ON od.OrderID = o.OrderID
            WHERE o.OrderDate = '1996-07-04'
            ORDER BY name
            """)
    List<MyDto22> select15();

    @Select("""
            SELECT c.CategoryID, OrderDate, ProductName, CategoryName, Quantity, Price
            FROM products p 
                JOIN categories c
                    ON p.CategoryID = c.CategoryID
                JOIN orderdetails od
                    ON p.ProductID = od.ProductID
                JOIN orders o
                    ON o.OrderID = od.OrderID 
            WHERE c.CategoryID = 1
            ORDER BY o.OrderDate, p.ProductName
            """)
    List<MyDto23> select16();

    @Select("""
            SELECT CustomerName
            FROM customers
            WHERE CustomerID = 100
            """)
    String select17();

    //  참조타입으로 설정해서 Null일 경우 RuntimeException 방지한다.
    @Select("""
            SELECT CustomerID
            FROM customers
            WHERE CustomerID = 100
            """)
    Integer select18();

    @Select("""
            SELECT CustomerID id,
                   CustomerName name,
                   Country
            FROM customers
            WHERE CustomerID = 1
            """)
    MyDto24 select19();

    @Select("""
            SELECT CustomerID id,
                   CustomerName name,
                   Country
            FROM customers
            WHERE CustomerID > 1
            """)
    MyDto24 select20();
}
