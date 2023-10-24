package com.example.spring.dao;

import com.example.spring.domain.MyDto40;
import org.apache.ibatis.annotations.*;

import java.time.LocalDate;
import java.util.Map;

@Mapper
public interface MyDao7 {

    @Select("""
            SELECT * FROM customers
            WHERE customerID = #{id}
            """)
    Map<String, Object> selectByCustomerId(Integer id);

    @Select("""
            SELECT * FROM employees
            WHERE EmployeeID = #{id}
            """)
    Map<String, Object> selectByEmployeeId(Integer id);

    @Insert("""
            INSERT INTO employees (lastName, firstName, birthDate)
            VALUES (#{lastName}, #{firstName}, #{birthDate})
            """)
    int insertEmployee(String lastName, String firstName, LocalDate birthDate);

    @Insert("""
            INSERT INTO products (ProductName, Price, CategoryID)
            VALUES (#{name}, #{price}, #{category})
            """)
    int insertProduct(String name, Double price, Integer category);

    @Delete("""
            DELETE FROM products
            WHERE ProductID = #{pid}
            """)
    int deleteByProductId(Integer pid);

    @Delete("""
            DELETE FROM customers
            WHERE CustomerID = #{cid}
            """)
    int deleteByCustomerId(Integer cid);

    @Update("""
        UPDATE products
        SET price = #{price},
            categoryId = #{category},
            productName = #{name}
        WHERE
            productId = #{id}
            
        """)
    int updateProduct(MyDto40 dto);
}
