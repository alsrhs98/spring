package com.itbank.mvc02;

public class MemberDTO {
	//�۷ι� ����(�ڵ��ʱ�ȭ, null�� �ʱ�ȭ)
	private String id;
	private String pw;
	private String name;
	private String tel;
	
	//���� �����ö� get
	public String getId() {
		return id;
	}
	//���� ���� �� set
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
}
