<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2023-09-26
  Time: 오후 12:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h1>form</h1>
<form action="/main13/sub8">
    <div>
        <label for="id">아이디</label>
        <input type="number" name="id" id="id">
    </div>
    <div>
        <label for="name">이름</label>
        <input type="text" name="name" id="name">
    </div>
    <div>
        <label for="address">주소</label>
        <input type="text" name="address" id="address">
    </div>
    <div>
        <label for="schedule">스케쥴</label>
        <input type="datetime-local" name="schedule" id="schedule">
    </div>
    <div>
        <label for="eat">밥먹기</label>
        <input type="checkbox" name="todos" id="eat" value="lunch">
    </div>
    <div>
        <label for="sleep">잠자기</label>
        <input type="checkbox" name="todos" id="sleep" value="sleep">
    </div>
    <div>
        <label for="book">책읽기</label>
        <input type="checkbox" name="todos" id="book" value="book">
    </div>
    <button>전송</button>
</form>

</body>
</html>
