package com.kgitbank.mvc04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.springframework.stereotype.Repository;

@Repository
public class ReplyDAO {

	//�ڵ� import ctrl + shift + o(����)
	public void insert(String reply, String writer) throws Exception {
	//Model(M)
		//1.����̹� ����
		Class.forName("com.mysql.jdbc.Driver");
		
		//View(V)
		System.out.print("1. ����̹� ���� ����!");
		
		//2.DB����
		String url= "jdbc:mysql://localhost:3306/spring"; //������ db
		String user = "root"; //id
		String password = "1234"; //pw
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.print("2. DB���� ����!!");	
		
		//3.SQL����
		//String sql = "insert into reply values (?, null)";
		String sql = "insert into reply values ('"+ reply + "', '" + writer +"')";
		PreparedStatement ps = con.prepareStatement(sql);
		
		
		System.out.print("3. SQL���� ����!!");	
		
		//4.SQL����
		ps.executeUpdate(sql);
		System.out.print("4. SQL���� ����!!");
		
	}
}
