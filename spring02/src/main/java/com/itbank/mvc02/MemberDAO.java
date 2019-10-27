package com.itbank.mvc02;

import java.sql.*;

import org.springframework.stereotype.Repository;

@Repository
public class MemberDAO {

	//�ڵ� import ctrl +shift + o(����)
	public void insert(String id, String pw, String name, String tel) throws Exception {

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
		String sql = "insert into member values (?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		ps.setString(2, pw);
		ps.setString(3, name);
		ps.setString(4, tel);
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
		String sql = "delete from member where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		System.out.println("3. SQL ���� ����!!");
		
		//4.SQL����
		ps.executeUpdate();
		System.out.println("4. ���� ����!!");
	}
	
	public MemberDTO select(String id) throws Exception {

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
		String sql = "select * from member where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		System.out.println("3. SQL ���� ����!!");
		
		//4.SQL����
		ResultSet rs/*���̺��� �޾ƿü� �ִ� ��ü*/ = ps.executeQuery(); //read(select!)
		MemberDTO dto2 = null;
		if(rs.next()) {
			String gid = rs.getString(1);//id , 1���� �÷��� ��ȣ
			String pw = rs.getString(2);//pw
			String name = rs.getString(3);//name
			String tel = rs.getString(4);//tel
			System.out.println(gid);
			System.out.println(pw);
			System.out.println(name);
			System.out.println(tel);
			
			dto2 = new MemberDTO();
			
			dto2.setId(gid);
			dto2.setPw(pw);
			dto2.setName(name);
			dto2.setTel(tel);
		}
		System.out.println("4. ���� ����!!");
		return dto2;
	}
	


}
