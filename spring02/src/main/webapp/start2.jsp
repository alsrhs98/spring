<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<form action="bbsinsert">
	���̵� <input type="text" name="id"><br>
	���� <input type="text" name="title"><br>
	���� <input type="text" name="content"><br>
	�ۼ��� <input type="text" name="writer"><br>
	<input type="submit" value="������ ����">
</form>
<hr color="red">

<form action="bbsselect">
	���̵� <input type="text" name="id"><br>
	<input type="submit" value="id�� �˻�">
</form>
<hr color="red">

<form action="bbsdelete">
	���̵� <input type="text" name="id"><br>
	<input type="submit" value="id�� ����">
</form>
<hr color="red">

</body>
</html>