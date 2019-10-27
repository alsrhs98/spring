package com.itbank.mvc02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {
	
	@Autowired
	//싱글톤 방법을 사용한다. 8바이트 1개만 있어도 100개를 만들수 있다 new 필요 x
	MemberDAO dao;
	
	@RequestMapping("insert")
	public void insert(String id, String pw, String name, String tel) throws Exception {
		System.out.println("insert요청 됨.");
		System.out.println("입력한 id는 " + id);
		System.out.println("입력한 pw는 " + pw);
		System.out.println("입력한 name는 " + name);
		System.out.println("입력한 tel는 " + tel);
		dao.insert(id, pw, name, tel);
		
	}
	
	@RequestMapping("select")
	public void select(String id, Model model) throws Exception {
		System.out.println("select요청 됨.");
		System.out.println("검색한 id는" + id);
		MemberDTO dto2 = dao.select(id);
		//Model객체는 views까지만 값을 넘기고 싶을때 사용.(session과 유사하지만, 더 좁다)
		model.addAttribute("dto2", dto2 );
		
	}
	@RequestMapping("delete")
	public void delete(String id) throws Exception {
		System.out.println("delete요청 됨.");
		System.out.println("삭제할 id는" + id);
		dao.delete(id);
	}
	
	
}
