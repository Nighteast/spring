<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2023-09-25
  Time: 오후 4:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>검색결과😎</h1>
<if test="${not empty message}">
    <p>${message}</p>
</if>
<a href="/main12/sub5">다시 검색하러가기</a>

</body>
</html>
