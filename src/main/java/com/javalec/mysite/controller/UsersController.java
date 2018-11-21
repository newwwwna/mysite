package com.javalec.mysite.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.javalec.mysite.service.UsersService;
import com.javalec.mysite.vo.UsersVO;

@Controller
public class UsersController {

	@Autowired
	@Qualifier("usersService")
	private UsersService usersService;
	
	@RequestMapping("login.do")
	public String loginUsers(UsersVO vo, HttpSession session, HttpServletRequest req) {
				
		if(usersService.getuservo(vo)!=null) {
			UsersVO vo2 = usersService.getuservo(vo);
			if(vo2.getPassword().equals(vo.getPassword())){
				session.setAttribute("id", vo.getId());
				session.setAttribute("password", vo.getPassword());
				session.setAttribute("vo", vo2);
				return "redirect:list.do";
			} else {
				session.setAttribute("error", "아이디/비밀번호를 확인하세요!");
				return "login.jsp";
			} 
		} else {
			session.setAttribute("error", "아이디가 존재하지 않습니다.");
			return "redirect:list.do";
		}
}
	
	@RequestMapping("join.do")
	public String insertUsers(UsersVO vo) {
		usersService.insertuser(vo);
		return "login.jsp";
	}
	
	@RequestMapping("joinform.do")
	public String insertformUsers() {
		return "joinform.jsp";
	}
	@RequestMapping("search.do")
	public String search(HttpServletRequest req) {

		return "findpassword.jsp";
	}

	@RequestMapping("searchpw.do")
	public String searchpw(UsersVO vo, @RequestParam(value="id") String id, Model model) {
		
		if(usersService.getuservo(vo)!=null) {
		vo = usersService.getuservo(vo);
		model.addAttribute("password", vo.getPassword());
		return "findpassword.jsp";
		} else {
			model.addAttribute("error", "아이디가 존재하지 않습니다.");
			return "findpassword.jsp";
		}
		
	}
	@RequestMapping("logout.do")
	public String logout(HttpSession session) {
		session.invalidate();
		return "login.jsp";
	}
}
