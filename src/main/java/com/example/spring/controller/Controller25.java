package com.example.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@Controller
@RequestMapping("main25")
public class Controller25 {

    @Autowired
    private DataSource dataSource;

    @GetMapping("sub1")
    public void method1(@RequestParam(value = "id", required = false) Integer customerId) throws SQLException {
        if (customerId == null) {
            System.out.println("삭제할 id를 넣어주세요");
            return;
        }
        String sql = """
                DELETE FROM customers
                WHERE customerId = ?
                """;

        Connection connection = dataSource.getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);

        try (connection; statement) {
            statement.setInt(1, customerId);
            int rows = statement.executeUpdate();  // insert, delete, update

            if (rows == 1) {
                System.out.println(rows + "개 레코드 잘 지워짐");
            } else {
                System.out.println("지워지지 않음");
            }
        }
    }

    @GetMapping("sub2")
    public void method2() {

    }

    @PostMapping("sub2")
    public void method3(@RequestParam(value = "pid",required = false) Integer productId) throws SQLException {
        if (productId == null) {
            System.out.println("지울 상품의 id를 입력해주세요.");
            return;
        }
        String sql = """
                DELETE FROM products
                WHERE ProductID = ?
                """;

        Connection connection = dataSource.getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);
        try (connection; statement) {
            statement.setInt(1, productId);
            int row = statement.executeUpdate();
            if (row == 1) {
                System.out.println(row + "개 레코드가 지워졌습니다.");
            } else {
                System.out.println("지워지지 않음");
            }
        }
    }
}
