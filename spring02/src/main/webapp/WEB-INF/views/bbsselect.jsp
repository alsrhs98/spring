<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
아이디로 검색한 결과입니다.
<br>
<hr color ="blue">
<%-- 
<%=  %> 표현식(Expression):변수출력 ---> ${} 표현언어(Expression Language: EL):속성출력
--%>


검색한 id: ${dto3.id }<br> <!-- dto.getId() -->
검색한 title: ${dto3.title }<br>
검색한 content: ${dto3.content }<br>
검색한 writer: ${dto3.writer }<br>


<br>
<img src="resources/img/car.jpg">
</body>
</html>