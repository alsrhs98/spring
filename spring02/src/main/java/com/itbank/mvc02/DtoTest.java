package com.itbank.mvc02;

public class DtoTest {

	public static void main(String[] args) {
		MemberDTO dto = new MemberDTO();
		dto.setId("orange");
		dto.setPw("orange");
		dto.setName("orange");
		dto.setTel("orange");
		
		DTO전달받음 send = new DTO전달받음();
		send.받음(dto);
	}
}
