<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
 <%
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
 %>
 당신이 입력한 id는 <%= id %><br>
 당신이 입력한 pw는 <%= pw %><br>
 
</body>
</html>