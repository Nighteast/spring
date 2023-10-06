package com.example.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("main22")
public class Controller22 {
    @Autowired
    private DataSource dataSource;

    @GetMapping("sub1")
    public void method1(Integer page, Model model) throws SQLException {
        String sql = """
                SELECT customerId id, 
                       customerName name
                FROM customers
                ORDER BY id
                LIMIT ?, ?
                """;

        Connection connection = dataSource.getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);

//        statement.setInt(1, 0);     //1페이지
//        statement.setInt(1, 10);     //2페이지
//        statement.setInt(1, 20);     //3페이지
        statement.setInt(1, (page - 1) * 10);
        statement.setInt(2, 10);

        ResultSet resultSet = statement.executeQuery();

        try (connection; statement; resultSet) {
            System.out.println("#### " + page + "페이지 고객 목록 ####");
            while (resultSet.next()) {
                String id = resultSet.getString("id");
                String name = resultSet.getString("name");

                System.out.println(id + " : " + name);
            }
        }
    }

    // 페이지당 7개 씩 공급자 목록 조회
    // /main22/sub2?p=2
    @GetMapping("sub2")
    public void method2(Integer page, Model model) throws SQLException {
        String sql = """
                SELECT SupplierID id, SupplierName name
                FROM suppliers
                ORDER BY id
                LIMIT ?, ?
                """;

        Connection connection = dataSource.getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);

        statement.setInt(1, (page - 1) * 7);
        statement.setInt(2,7);

        ResultSet resultSet = statement.executeQuery();

        List<Map<String, Object>> list = new ArrayList<>();

        try (connection; statement; resultSet) {
            System.out.println("공급자 목록  " + page + "페이지");
            while (resultSet.next()) {
                String id = resultSet.getString("id");
                String name = resultSet.getString("name");

                list.add(Map.of("id", id, "name", name));
//                list.add(id);
//                list.add(name);
            }

            model.addAttribute("supplierList", list);
        }
    }
}
