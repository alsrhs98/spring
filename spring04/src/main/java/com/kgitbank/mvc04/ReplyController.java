package com.kgitbank.mvc04;

import javax.swing.JOptionPane;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReplyController {
	
	@Autowired
	ReplyDAO dao;
	
	@RequestMapping("server.do")
	public void reply(String reply,String writer, Model model) throws Exception { //request.getParameter를 자동으로 받아서 넣어줌
		//JOptionPane.showMessageDialog(null, "server.do가 호출됨");
		model.addAttribute("reply",reply); //view로 넘기기 위해 model속성으로 등록
		model.addAttribute("writer",writer);
		dao.insert(reply ,writer);
		
		
	}
	
}
