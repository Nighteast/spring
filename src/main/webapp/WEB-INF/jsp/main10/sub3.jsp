<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2023-09-22
  Time: 오후 2:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>🫠🫠🫠🫠🫠</h1>
<h2>${person1.id}</h2>
<h2>${person1.name}</h2>
<h2>${person1.foods[0]}</h2>
<h2>${person1.foods[1]}</h2>
<h2>${person1.foods[2]}</h2>

<hr>

<h2>┌( ಠ_ಠ)┘${person1.cars[0]}</h2>
<h2>${person1.cars[1]}</h2>
<h2>${person1.cars[2]}</h2>

<hr>

<c:forEach items="${person1.cars}" var="car">
    <h2>${car}</h2>
</c:forEach>

<c:forEach items="${person1.foods}" var="food">
    <h2>${food}</h2>
</c:forEach>

</body>
</html>