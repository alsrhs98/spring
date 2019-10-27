package com.itbank.mvc02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BbsController2 {
	
	@Autowired
	//싱글톤 방법을 사용한다. 8바이트 1개만 있어도 100개를 만들수 있다 new 필요 x
	BbsDAO2 dao;
	
	@RequestMapping("bbsinsert")
	public void insert(String id, String title, String content, String writer) throws Exception {
		System.out.println("insert요청 됨.");
		System.out.println("입력한 id는 " + id);
		System.out.println("입력한 pw는 " + title);
		System.out.println("입력한 name는 " + content);
		System.out.println("입력한 tel는 " + writer);
		dao.insert(id, title, content, writer);
		
	}
	@RequestMapping("bbsselect")
	public void select(String id, Model model) throws Exception {
		System.out.println("select요청 됨.");
		System.out.println("검색할 id는" + id);
		BbsDTO dto3 = dao.select(id);
		model.addAttribute("dto3",dto3);
	
	}
	

	@RequestMapping("bbsdelete")
	public void delete(String id) throws Exception {
		System.out.println("delete요청 됨.");
		System.out.println("삭제할 id는" + id);
		dao.delete(id);
	}
}
