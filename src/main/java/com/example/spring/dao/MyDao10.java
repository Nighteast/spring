package com.example.spring.dao;

import com.example.spring.domain.MyDto33Employee;
import com.example.spring.domain.MyDto34Customers;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

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
             ContactName,
             address,
             city,
             PostalCode,
             Country
            FROM customers
            WHERE CustomerID = 6
            """)
    MyDto34Customers getCustomer();

    @Select("""
            SELECT 
             CustomerID id,
             CustomerName name,
             ContactName,
             address,
             city,
             PostalCode,
             Country
            FROM customers
            WHERE CustomerID = #{id}
            """)
    MyDto34Customers getCustomerById(Integer id);

    @Select("""
            SELECT 
                EmployeeID id, 
                LastName, 
                FirstName, 
                Photo, 
                Notes, 
                BirthDate
            FROM employees
            WHERE EmployeeID = #{id}
            """)
    MyDto33Employee getEmployeeById(Integer id);

    @Select("""
            SELECT CustomerID 
            FROM customers 
            ORDER BY CustomerID
            """)
    List<Integer> getCustomerIdList();

    @Select("""
            SELECT EmployeeID
            FROM employees
            ORDER BY EmployeeID
            """)
    List<Integer> getEmployeeIdList();
}
