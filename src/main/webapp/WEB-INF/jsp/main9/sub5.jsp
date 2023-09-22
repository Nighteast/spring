<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2023-09-22
  Time: 오전 10:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h1>${caps.korea} : seoul</h1>
<h1>${caps["korea"]} : seoul</h1>
<h1>${caps[korea]} : ny</h1>
<h1>${caps["us"]} : ny</h1>
<h1>${caps[us]} : </h1>
<hr>
<h1>${phones.phone1}🫠</h1>
<h1>${phones.phone2}😎</h1>
<%--<h1>${food.1st}</h1>--%>
<%--<h1>${food.2nd}</h1>--%>
<h1>${caps.korea}</h1>
<h1>${caps.us}</h1>
<h1>${food["1st"]}</h1>
<h1>${food["2nd"]}</h1>

</body>
</html>
