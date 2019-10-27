package com.itbank.mvc02;

import java.sql.*;

import org.springframework.stereotype.Repository;

@Repository
public class BbsDAO2 {

	//�ڵ� import ctrl +shift + o(����)
	public void insert(String id, String title, String content, String writer) throws Exception {

		//Model(M)
		//1.����̹� ����
		Class.forName("com.mysql.jdbc.Driver");

		//View(V)
		System.out.println("1. ����̹� ���� ����!");

		//2.DB����
		String url = "jdbc:mysql://localhost:3306/spring"; //������ db
		String user = "root"; //id
		String password = "1234"; //pw
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. DB���� ����!!");

		//3.SQL����
		String sql = "insert into bbs values (?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		ps.setString(2, title);
		ps.setString(3, content);
		ps.setString(4, writer);
		System.out.println("3. SQL ���� ����!!");
		//4.SQL����
		ps.executeUpdate();
		System.out.println("4. ���� ����!!");
	}
	
	public void delete(String id) throws Exception {

		//Model(M)
		//1.����̹� ����
		Class.forName("com.mysql.jdbc.Driver");

		//View(V)
		System.out.println("1. ����̹� ���� ����!");

		//2.DB����
		String url = "jdbc:mysql://localhost:3306/spring"; //������ db
		String user = "root"; //id
		String password = "1234"; //pw
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. DB���� ����!!");

		//3.SQL����
		String sql = "delete from bbs where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		System.out.println("3. SQL ���� ����!!");
		
		//4.SQL����
		ps.executeUpdate();
		System.out.println("4. ���� ����!!");
	}
	
	public BbsDTO select(String id) throws Exception {

		//Model(M)
		//1.����̹� ����
		Class.forName("com.mysql.jdbc.Driver");

		//View(V)
		System.out.println("1. ����̹� ���� ����!");

		//2.DB����
		String url = "jdbc:mysql://localhost:3306/spring"; //������ db
		String user = "root"; //id
		String password = "1234"; //pw
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. DB���� ����!!");

		//3.SQL����
		String sql = "select * from bbs where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		System.out.println("3. SQL ���� ����!!");
		
		//4.SQL����
		System.out.println("4. ���� ����!!");
		ResultSet rs/*���̺��� �޾ƿü� �ִ� ��ü*/ = ps.executeQuery(); //read(select!)
		BbsDTO dto3 = null;
		if(rs.next()) {
			String bid = rs.getString(1);//id , 1���� �÷��� ��ȣ
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
		System.out.println("4. ���� ����!!");
		return dto3;
	}


}
