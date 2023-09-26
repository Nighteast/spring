<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2023-09-26
  Time: 오후 3:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h1> 로그인 창 </h1>

<form action="/main14/sub6" method="post">
    <div>
        <label for="input1">아이디 입력</label>
        <br>
        <input type="text" id="input1" name="username">
    </div>
    <div>
        <label for="input2">패스워드 입력</label>
        <br>
        <input type="password" id="input2" name="password">
    </div>
    <input type="submit">
</form>

</body>
</html>
