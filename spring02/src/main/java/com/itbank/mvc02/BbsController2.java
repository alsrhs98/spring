package com.itbank.mvc02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BbsController2 {
	
	@Autowired
	//�̱��� ����� ����Ѵ�. 8����Ʈ 1���� �־ 100���� ����� �ִ� new �ʿ� x
	BbsDAO2 dao;
	
	@RequestMapping("bbsinsert")
	public void insert(String id, String title, String content, String writer) throws Exception {
		System.out.println("insert��û ��.");
		System.out.println("�Է��� id�� " + id);
		System.out.println("�Է��� pw�� " + title);
		System.out.println("�Է��� name�� " + content);
		System.out.println("�Է��� tel�� " + writer);
		dao.insert(id, title, content, writer);
		
	}
	@RequestMapping("bbsselect")
	public void select(String id, Model model) throws Exception {
		System.out.println("select��û ��.");
		System.out.println("�˻��� id��" + id);
		BbsDTO dto3 = dao.select(id);
		model.addAttribute("dto3",dto3);
	
	}
	

	@RequestMapping("bbsdelete")
	public void delete(String id) throws Exception {
		System.out.println("delete��û ��.");
		System.out.println("������ id��" + id);
		dao.delete(id);
	}
}
