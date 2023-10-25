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
<div>
    <button onclick="ajax2()">button2</button>
    <script>
        function ajax2() {
            axios.get("/main39/sub2")
                .then(() => console.log("성공"))
                .catch(() => console.log("실패"));
        }
    </script>
</div>
<div>
    <button onclick="ajax3()">button3</button>
    <script>
        function ajax3() {
            axios.get("/main39/sub2")
                .catch(function (error) {
                    console.log(error);
                    console.log(error.response.status);
                    let status = error.response.status;
                    if (status >= 400 && status < 500) {
                        console.log("요청이 잘 못 되었습니다.");
                    } else if (status >= 500 && status < 599) {
                        console.log("서버에서 오류가 발생하였습니다.");
                    }
                });
        }
    </script>
</div>
<%--    (div>button[onclick="ajax$@4()"]{button$@4}>^script{function ajax$@4()})*10--%>
<div>
    <button onclick="ajax4()">button4</button>
    <p id="result1"></p>
    <script>
        function ajax4() {
            axios.get("/main39/sub3")
                //400번대 응답이면 #result1 요소에 "잘못된 요청" 출력
                //500번대 응답이면 #result1 요소에 "서버 에러" 출력
                .catch((error) => {
                    let code = error.response.status;
                    console.log(code);
                    let message = "";
                    if (400 <= code && code < 500) {
                        message = "잘못된 요청"
                    } else if (500 <= code && code < 600) {
                        message = "서버 에러"
                    }
                    document.getElementById('result1').textContent = message;
                });
        }
    </script>
</div>
<%--    <div>--%>
<%--        <button onclick="ajax5()">button5</button>--%>
<%--        <script>function ajax5()</script>--%>
<%--    </div>--%>
<%--    <div>--%>
<%--        <button onclick="ajax6()">button6</button>--%>
<%--        <script>function ajax6()</script>--%>
<%--    </div>--%>
<%--    <div>--%>
<%--        <button onclick="ajax7()">button7</button>--%>
<%--        <script>function ajax7()</script>--%>
<%--    </div>--%>
<%--    <div>--%>
<%--        <button onclick="ajax8()">button8</button>--%>
<%--        <script>function ajax8()</script>--%>
<%--    </div>--%>
<%--    <div>--%>
<%--        <button onclick="ajax9()">button9</button>--%>
<%--        <script>function ajax9()</script>--%>
<%--    </div>--%>
<%--    <div>--%>
<%--        <button onclick="ajax10()">button10</button>--%>
<%--        <script>function ajax10()</script>--%>
<%--    </div>--%>
<%--    <div>--%>
<%--        <button onclick="ajax11()">button11</button>--%>
<%--        <script>function ajax11()</script>--%>
<%--    </div>--%>
<%--    <div>--%>
<%--        <button onclick="ajax12()">button12</button>--%>
<%--        <script>function ajax12()</script>--%>
<%--    </div>--%>
<%--    <div>--%>
<%--        <button onclick="ajax13()">button13</button>--%>
<%--        <script>function ajax13()</script>--%>
<%--    </div>--%>
</body>
</html>
