<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2023-09-25
  Time: 오후 12:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:if test="${not empty param.age}">
    <%-- 요청 파라미터 age --%>
    <%-- age가 20보다 크거나 같으면 --%>
    <c:if test="${param.age >= 20}" var="okAge">
        <p>투표 <span style="color: blue"><b>가능</b></span>합니다.</p>
        <p>현재 나이 = ${param.age}</p>
        <p>투표 가능 나이 : 20세 이상</p>
    </c:if>

    <%-- 그렇지 않으면 --%>
    <c:if test="${not okAge}">
        <p>투표 <span style="color: red; font-weight: bold">불가능</span>합니다.</p>
        <p>현재 나이 = ${param.age}</p>
        <p>투표 가능 나이 : 20세 이상</p>
    </c:if>
</c:if>
<c:if test="${empty param.age}">
    <p>age 값을 입력 해주세요.</p>
</c:if>


</body>
</html>
