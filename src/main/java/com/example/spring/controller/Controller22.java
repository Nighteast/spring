package com.example.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
    public void method2(@RequestParam(value = "page", defaultValue = "1") Integer page, Model model) throws SQLException {
        String sql = """
                SELECT SupplierID id, SupplierName name
                FROM suppliers
                ORDER BY id
                LIMIT ?, ?
                """;

        Connection connection = dataSource.getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);

        statement.setInt(1, (page - 1) * 7);
        statement.setInt(2, 7);

        ResultSet resultSet = statement.executeQuery();

        List<Map<String, Object>> list = new ArrayList<>();

        try (connection; statement; resultSet) {
//            System.out.println("공급자 목록  " + page + "페이지");
            while (resultSet.next()) {
                String id = resultSet.getString("id");
                String name = resultSet.getString("name");

                list.add(Map.of("id", id, "name", name));
//                list.add(id);
//                list.add(name);
            }

            String sql1 = """
                    SELECT COUNT(*)
                    FROM suppliers
                    """;
            Connection connection1 = dataSource.getConnection();
            Statement statement1 = connection.createStatement();
            ResultSet resultSet1 = statement1.executeQuery(sql1);

            try (connection1; statement1; resultSet1) {
                if (resultSet1.next()) {
                    int countAll = resultSet1.getInt(1);
                    // 마지막 페이지 번호
                    int lastPageNumber = ((countAll - 1) / 7) + 1;
                    model.addAttribute("lastPageNumber", lastPageNumber);
                }
            }

            model.addAttribute("supplierList", list);
        }
    }

    // /main22/sub3?p=2
    // 2페이지 고객목록을 jsp에 테이블 형식(id, name)으로 출력
    // page 번호로 링크만들기
    // 1페이지 5개씩 출력
    @GetMapping("sub3")
    public void method3(@RequestParam(value = "p", defaultValue = "1") Integer page, Model model) throws SQLException {
        String sql = """
                SELECT CustomerID id, CustomerName name
                FROM customers
                ORDER BY id
                LIMIT ?, ?
                """;

        Connection connection = dataSource.getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, (page - 1) * 5);
        statement.setInt(2, 5);
        ResultSet resultSet = statement.executeQuery();

        List<Map<String, Object>> list = new ArrayList<>();

        try (connection; statement; resultSet) {
            while (resultSet.next()) {
                String id = resultSet.getString("id");
                String name = resultSet.getString("name");

                list.add(Map.of("id", id, "name", name));
            }
        }
        model.addAttribute("customersList", list);

        String sql1 = """
                SELECT COUNT(*)
                FROM customers            
                """;
        Connection connection1 = dataSource.getConnection();
        Statement statement1 = connection1.createStatement();
        ResultSet resultSet1 = statement1.executeQuery(sql1);
        int lastPageNumber=0;

        try (connection1; statement1; resultSet1) {
            if (resultSet1.next()) {
                int countAll = resultSet1.getInt(1);
                lastPageNumber = ((countAll - 1) / 5) + 1;
                model.addAttribute("lastPageNumber", lastPageNumber);
            }
        }
        model.addAttribute("currentPage", page);

        int leftPageNumber = (page - 1) / 5 * 5 + 1;
        int rightPageNumber = leftPageNumber + 4;
        int prevPageNumber = leftPageNumber - 5;
        int nextPageNumber = rightPageNumber +1;

        rightPageNumber = Math.min(rightPageNumber, lastPageNumber);

        model.addAttribute("leftPageNumber", leftPageNumber);
        model.addAttribute("rightPageNumber", rightPageNumber);
        model.addAttribute("prevPageNumber", prevPageNumber);
        model.addAttribute("nextPageNumber", nextPageNumber);

    }
}
