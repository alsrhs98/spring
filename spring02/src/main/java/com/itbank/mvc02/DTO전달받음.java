package com.itbank.mvc02;

public class DTO전달받음 {
	public void 받음(MemberDTO dto) {
		System.out.println("전달받은 DTO값 들 리스트 출력");
		System.out.println(dto.getId());
		System.out.println(dto.getPw());
		System.out.println(dto.getName());
		System.out.println(dto.getTel());
	}
}
