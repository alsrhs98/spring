<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
환영합니다. 스프링에 들어오셨습니다....!!!
<br>
<!-- 
a태그로 연결된 페이지는 클라이언트가 요청하게 하는것.=>click!을 통해 
클라이언트가 요청한 서버쪽에 있는 페이지는 브라우저에 꼭 표시가 된다.
클라이언트가 요청한 페이지는 반드시 spring의 webapp 밑에 있어야 한다.
-->
<a href="food.jsp">내가 좋아하는 음식페이지</a><br>
<a href="hooby.jsp">내가 좋아하는 취미페이지</a><br>
<hr color="red">

<form action="check.jsp">
	아이디 <input type="text" name="id"><br>
	패스워드 <input type="text" name="pw"><br>
	<input type="submit" value="서버로 전송">
	
</form>
</body>
</html>