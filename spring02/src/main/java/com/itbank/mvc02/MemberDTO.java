package com.itbank.mvc02;

public class MemberDTO {
	//글로벌 변수(자동초기화, null로 초기화)
	private String id;
	private String pw;
	private String name;
	private String tel;
	
	//값을 가져올땐 get
	public String getId() {
		return id;
	}
	//값을 넣을 땐 set
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
