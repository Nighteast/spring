<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2023-10-06
  Time: 오후 2:27
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
            width: 30%;
        }
        th, td {
            border: 1px solid black;
            text-align: center;
        }
        th {
            background-color: orange;
        }
        .active {
            background-color: darkblue;
            color: #eeeeee;
        }
    </style>
</head>
<body>
<h1>고객 목록</h1>
<table>
    <tr>
        <th>ID</th>
        <th>NAME</th>
    </tr>
    <c:forEach items="${customersList}" var="customer">
        <tr>
            <td>${customer.id}</td>
            <td>${customer.name}</td>
        </tr>
    </c:forEach>
</table>

<div>
    <c:forEach begin="1" end="${lastPageNumber}" var="pageNumber">
        <a
                <c:if test="${pageNumber == currentPage}">
                    class="active"
                </c:if>
                href="/main22/sub3?p=${pageNumber}">${pageNumber}</a>
        |
    </c:forEach>
</div>

</body>
</html>
