<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2023-10-06
  Time: 오전 11:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
    <style>
        table {
            border-collapse: collapse;
        }
        th, td {
            border: 1px solid black;
            text-align: center;
        }
        th {
            background-color: aqua;
        }
    </style>
</head>
<body>
<h1>공급자 목록 조회</h1>
<table>
    <tr>
        <th>ID</th>
        <th>NAME</th>
    </tr>
    <c:forEach items="${supplierList}" var="supplier">
        <tr>
            <td>${supplier.id}</td>
            <td>${supplier.name}</td>
        </tr>
    </c:forEach>
</table>

<div>
    <c:forEach begin="1" end="${lastPageNumber}" var="pageNumber">
        <a href="/main22/sub2?page=${pageNumber}">${pageNumber}</a> |
    </c:forEach>
</div>

</body>
</html>
