<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2023-10-25
  Time: 오후 12:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
    <script src="https://cdn.jsdelivr.net/npm/axios/dist/axios.min.js"></script>
</head>
<body>
    <div>
        <button onclick="ajax1()">button1</button>
        <script>
            function ajax1() {
                axios.get("/main39/sub1")
                    .then(() => console.log("성공"))
                    .catch(() => console.log("실패"));
            }
        </script>
    </div>
</body>
</html>
