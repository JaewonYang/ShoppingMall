package kr.ac.jejuuniv.yang.controller;

import kr.ac.jejuuniv.yang.service.LoginService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class loginCompletePage {

	@Autowired
	LoginService loginService;
	
	public void loginCompletePage(){
		loginService.loginCompletePage();
	}
}
