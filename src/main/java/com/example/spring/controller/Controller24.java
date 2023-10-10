package com.example.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("main24")
public class Controller24 {
    @Autowired
    private DataSource dataSource;

    @GetMapping("sub1")
    public void method1() throws SQLException {
        String sql = """
                INSERT INTO products (ProductName, SupplierID, CategoryID, Unit, Price)
                VALUE(?, ?, ?, ?, ?)           
                """;

        Connection connection = dataSource.getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);

        statement.setString(1, "돈까스");
        statement.setInt(2, 3);
        statement.setInt(3, 4);
        statement.setString(4, "한 장");
        statement.setDouble(5, 500.00d);

//        statement.excuteQuery();    // select 쿼리
//        statement.excuteUpdate();   // DML(insert, delete, update) 쿼리
        int count = statement.executeUpdate();

        if (count == 1) {
            System.out.println("잘됨!!!");
        } else {
            System.out.println("뭔가 잘 못됨@@@@@");
        }
    }

    // /main24/sub2 로 요청시
    // suppliers 테이블에 하나의 레코드 추가하는 메서드 요청
    @GetMapping("sub2")
    public void method2(@RequestParam(value = "1",defaultValue = "") String supplierName,
                        @RequestParam(value = "2",defaultValue = "")String contactName,
                        @RequestParam(value = "3",defaultValue = "")String address,
                        @RequestParam(value = "4",defaultValue = "")String city,
                        @RequestParam(value = "5",defaultValue = "")String postalCode,
                        @RequestParam(value = "6",defaultValue = "")String country,
                        @RequestParam(value = "7",defaultValue = "")String phone) throws SQLException {
        String sql = """
                INSERT INTO suppliers (SupplierName, ContactName, Address, City, PostalCode, Country, Phone) 
                VALUE (?,?,?,?,?,?,?)
                """;

        Connection connection = dataSource.getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);

        // /main24/sub2?1=루미네&2=여행자&3=티바트&4=폰타인&5=444&6=몬드&7=01044444
        statement.setString(1, supplierName);
        statement.setString(2, contactName);
        statement.setString(3, address);
        statement.setString(4, city);
        statement.setString(5, postalCode);
        statement.setString(6, country);
        statement.setString(7, phone);

//        statement.setString(1, "손흥민");
//        statement.setString(2, "ㅇㅇ");
//        statement.setString(3, "토트넘");
//        statement.setString(4, "런던");
//        statement.setString(5, "123");
//        statement.setString(6, "영국");
//        statement.setString(7, "12314444");


        List<Map<String, Object>> list = new ArrayList<>();

        try (connection; statement) {
            int count = statement.executeUpdate();
            if (count == 1) {
                System.out.println("잘 입력됨");
            } else {
                System.out.println("먼가 잘 못댐");
            }

        }

    }
}
