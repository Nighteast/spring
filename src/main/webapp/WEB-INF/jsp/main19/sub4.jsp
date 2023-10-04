<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2023-10-04
  Time: 오후 3:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>customers</h3>
<table style="border-collapse: collapse; border: 1px solid black; width: 70%; text-align: center">
  <tr>
    <th style="background-color: #eeeeee">CUSTOMER_ID</th>
    <th style="background-color: #eeeeee">CUSTOMER_NAME</th>
    <th style="background-color: #eeeeee">CITY</th>
    <th style="background-color: #eeeeee">COUNTRY</th>
  </tr>
  <c:forEach items="${customers}" var="customer">
    <tr>
      <td>${customer.id}</td>
      <td>${customer.name}</td>
      <td>${customer.city}</td>
      <td>${customer.country}</td>
    </tr>
  </c:forEach>
</table>
</body>
</html>
