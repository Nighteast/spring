<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2023-09-26
  Time: 오전 9:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>input 요소들</h3>
<form action="/main13/sub2">
    <%--div*10>input[name=param$]--%>
        <div>
            <input type="text" name="param1">
        </div>
        <div>
            <input type="password" name="param2">
        </div>
        <div>
            <input type="date" name="param3">
        </div>
        <div>
            <input type="button" name="param4" value="어떤 버튼">
        </div>
        <div>
            <input type="number" name="param5">
        </div>
        <div>
            <input type="submit" name="param6" value="회원가입">
        </div>
        <div>
            <input type="radio" name="param7">  <%-- radio : 같은 네임 어트리뷰트 값 중 하나만 선택 가능--%>
        </div>
        <div>
            <input type="radio" name="param7">  <%-- radio : 주파수 중 하나만 선택 가능하기에 radio라는 이름이 붙음--%>
        </div>
        <div>
            <input type="checkbox" name="param9">   <%-- checkbox : 여러개 중복 선택 가능--%>
        </div>
        <div>
            <input type="checkbox" name="param9">
        </div>
        <div>
            <input type="hidden" name="param10" value="some value">    <%-- 숨겨진 요소 - 전송 버튼을 눌렀을때 form_action으로 옮기고 싶을때 기본갑 설정 등--%>
        </div>
        <button>전송</button>
</form>

<hr>

<form action="/main13/sub2">
    <div>
        <input type="text" name="param1" value="son">   <%--value : 기본 값--%>
    </div>
    <div>
        <input type="text" name="param2" placeholder="이름을 입력해주세요."> <%-- 설명 --%>
    </div>
    <div>
        <input type="text" maxlength="5">
    </div>
    <div>
        <input type="text" required>
    </div>
    <div>
        <input type="text" name="param3" readonly value="son">
    </div>
    <div>
        <input type="text" name="param4" value="son" disabled>
    </div>
    <div>
        <input type="text" name="param5" pattern="\d{3}">   <%--정규식 패턴 일치조건--%>
    </div>
    <%--div*2>input:c--%>
    <div>
        <input type="checkbox" name="param6" checked id="">
    </div>
    <div>
        <input type="checkbox" name="param6" checked id="">
    </div>
    <div>
        <input type="radio" name="param7" id="" >
    </div>
    <div>
        <input type="radio" name="param7" id="" checked="">
    </div>
    <div>
        <input type="file" multiple>
    </div>
    <button>전송</button>
</form>

<hr>

<form action="/main13/sub2">
    <label for="input1">    <%--input의 설명텍스트를 주로 label로 감싼다. 짝으로 쓰임. --%>
        주소
    </label>                <%--input_id와 laber_for 을 같게 하면 서로 연동되는 부분이 있음.--%>
    <input id="input1" type="text">
    <br>
    <%--div>div*3>label[for=check$]>lorem1^input:c#check$--%>
    <div>
        <div>
            <label for="check1">Lorem.</label>
            <input type="checkbox" name="" id="check1">
        </div>
        <div>
            <label for="check2">Eum!</label>
            <input type="checkbox" name="" id="check2">
        </div>
        <div>
            <label for="check3">Omnis.</label>
            <input type="checkbox" name="" id="check3">
        </div>
    </div>
    <input type="submit" value="전송">    <%--종료태그가 없음(안에 컨텐츠를 넣기 힘듦 --%>
    <button>전송</button>                 <%--종료태그가 있음(안에 컨텐츠를 넣을 수 있음) --%>
</form>


</body>
</html>
