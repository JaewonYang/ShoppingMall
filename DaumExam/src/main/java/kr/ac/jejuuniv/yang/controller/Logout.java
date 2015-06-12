package kr.ac.jejuuniv.yang.controller;

import javax.servlet.http.HttpSession;

import kr.ac.jejuuniv.yang.service.LoginService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class Logout {

	@Autowired
	LoginService loginService;
	
	@RequestMapping("/logout")
	public String logout(HttpSession session){
		session.setAttribute("userLoginInfo", null);
		return "redirect:index";
	}
}
