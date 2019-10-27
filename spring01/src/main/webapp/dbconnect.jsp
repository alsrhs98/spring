<%@page import="java.sql.*"%>
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
		//Control(C)
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		String tel = request.getParameter("tel");
		
		//Model(M)
		//1.드라이버 설정
		Class.forName("com.mysql.jdbc.Driver");
		
		//View(V)
		out.print("1. 드라이버 설정 성공!");

		//2.DB연결
		String url = "jdbc:mysql://localhost:3306/spring"; //연결할 db
		String user = "root"; //id
		String password = "1234"; //pw
		Connection con = DriverManager.getConnection(url, user, password);
		out.print("2. DB연결 성공!!");

		//3.SQL결정
		String sql = "insert into member values (?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		ps.setString(2, pw);
		ps.setString(3, name);
		ps.setString(4, tel);
		out.print("3. SQL 결정 성공!!");
		//4.SQL전송
		ps.executeUpdate();
		out.print("4. 전송 성공!!");
	%>
</body>
</html>