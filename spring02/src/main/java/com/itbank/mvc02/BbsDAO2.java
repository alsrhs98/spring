package com.itbank.mvc02;

import java.sql.*;

import org.springframework.stereotype.Repository;

@Repository
public class BbsDAO2 {

	//자동 import ctrl +shift + o(영문)
	public void insert(String id, String title, String content, String writer) throws Exception {

		//Model(M)
		//1.드라이버 설정
		Class.forName("com.mysql.jdbc.Driver");

		//View(V)
		System.out.println("1. 드라이버 설정 성공!");

		//2.DB연결
		String url = "jdbc:mysql://localhost:3306/spring"; //연결할 db
		String user = "root"; //id
		String password = "1234"; //pw
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. DB연결 성공!!");

		//3.SQL결정
		String sql = "insert into bbs values (?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		ps.setString(2, title);
		ps.setString(3, content);
		ps.setString(4, writer);
		System.out.println("3. SQL 결정 성공!!");
		//4.SQL전송
		ps.executeUpdate();
		System.out.println("4. 전송 성공!!");
	}
	
	public void delete(String id) throws Exception {

		//Model(M)
		//1.드라이버 설정
		Class.forName("com.mysql.jdbc.Driver");

		//View(V)
		System.out.println("1. 드라이버 설정 성공!");

		//2.DB연결
		String url = "jdbc:mysql://localhost:3306/spring"; //연결할 db
		String user = "root"; //id
		String password = "1234"; //pw
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. DB연결 성공!!");

		//3.SQL결정
		String sql = "delete from bbs where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		System.out.println("3. SQL 결정 성공!!");
		
		//4.SQL전송
		ps.executeUpdate();
		System.out.println("4. 전송 성공!!");
	}
	
	public BbsDTO select(String id) throws Exception {

		//Model(M)
		//1.드라이버 설정
		Class.forName("com.mysql.jdbc.Driver");

		//View(V)
		System.out.println("1. 드라이버 설정 성공!");

		//2.DB연결
		String url = "jdbc:mysql://localhost:3306/spring"; //연결할 db
		String user = "root"; //id
		String password = "1234"; //pw
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. DB연결 성공!!");

		//3.SQL결정
		String sql = "select * from bbs where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		System.out.println("3. SQL 결정 성공!!");
		
		//4.SQL전송
		System.out.println("4. 전송 성공!!");
		ResultSet rs/*테이블을 받아올수 있는 객체*/ = ps.executeQuery(); //read(select!)
		BbsDTO dto3 = null;
		if(rs.next()) {
			String bid = rs.getString(1);//id , 1번은 컬럼의 번호
			String title = rs.getString(2);
			String content = rs.getString(3);
			String writer = rs.getString(4);
			System.out.println(bid);
			System.out.println(title);
			System.out.println(content);
			System.out.println(writer);
			
			dto3 = new BbsDTO();
			
			dto3.setId(bid);
			dto3.setTitle(title);
			dto3.setContent(content);
			dto3.setWriter(writer);
		}
		System.out.println("4. 전송 성공!!");
		return dto3;
	}


}
