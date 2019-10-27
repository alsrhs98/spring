package com.kgitbank.mvc04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.springframework.stereotype.Repository;

@Repository
public class ReplyDAO {

	//자동 import ctrl + shift + o(영문)
	public void insert(String reply, String writer) throws Exception {
	//Model(M)
		//1.드라이버 설정
		Class.forName("com.mysql.jdbc.Driver");
		
		//View(V)
		System.out.print("1. 드라이버 설정 성공!");
		
		//2.DB연결
		String url= "jdbc:mysql://localhost:3306/spring"; //연결할 db
		String user = "root"; //id
		String password = "1234"; //pw
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.print("2. DB연결 성공!!");	
		
		//3.SQL결정
		//String sql = "insert into reply values (?, null)";
		String sql = "insert into reply values ('"+ reply + "', '" + writer +"')";
		PreparedStatement ps = con.prepareStatement(sql);
		
		
		System.out.print("3. SQL결정 성공!!");	
		
		//4.SQL전송
		ps.executeUpdate(sql);
		System.out.print("4. SQL전송 성공!!");
		
	}
}
