<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2023-09-27
  Time: 오전 9:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <h1>여전히 ${favoriteFood}입니다.🫠</h1>
  <ul>
      <c:forEach items="${favoriteFood}" var="item">
          <li>${item}</li>
      </c:forEach>
  </ul>
  <a href="/main15/sub7">돌아가기</a>
</body>
</html>
