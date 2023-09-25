<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2023-09-25
  Time: 오전 11:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--
localhost:8080/main11/sub2?dan=2
구구단 2단 출력

localhost:8080/main11/sub2?dan=3
구구단 3단 출력
--%>
<c:if test="${(param.dan >= 2) and (param.dan <= 9)}" var="okDan">
    <h1>🫠구구단 ${param.dan}단 출력🫠</h1>
    <c:forEach begin="1" end="18" var="n">
    <p>😎 ${param.dan} X ${n} = ${param.dan * n}</p>
    </c:forEach>
</c:if>
<c:if test="${not okDan}">
    <h3>구구단의 수를 2~9 사이의 값으로 입력해주세요.</h3>
</c:if>

</body>
</html>
