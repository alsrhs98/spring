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


검색한 id: ${dto2.id }<br> <!-- dto.getId() -->
검색한 pw: ${dto2.pw }<br>
검색한 name: ${dto2.name }<br>
검색한 tel: ${dto2.tel }<br>


<br>
<img src="resources/img/car.jpg">
</body>
</html>