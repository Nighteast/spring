package com.example.spring.dao;

import com.example.spring.domain.MyDto37;
import com.example.spring.domain.MyDto38;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;

@Mapper
public interface MyDao6 {

    @Insert("""
            INSERT INTO customers (customerName)
            VALUE (#{name})
            """)
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insert1(MyDto37 dto);

    @Insert("""
            INSERT INTO employees (LastName)
            VALUE (#{lastName})
            """)
    @Options(useGeneratedKeys = true, keyProperty = "eid")
    int insert2(MyDto38 dto);

    @Insert("""
            INSERT INTO employees (LastName, FirstName)
            VALUES (#{lastName}, #{firstName})
            """)
    @Options(useGeneratedKeys = true, keyProperty = "eid")
    int insert3(MyDto38 dto);
}
