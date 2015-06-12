package kr.ac.jejuuniv.yang.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import kr.ac.jejuuniv.yang.model.User;
import kr.ac.jejuuniv.yang.service.LoginService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping
public class loginComplete {

	@Autowired
	LoginService loginService;

	
	@RequestMapping("loginComplete")
	public ModelAndView loginProcess(User user, HttpSession session,
			HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("redirect:index");

		User loginUser = loginService.loginComplete(user);

		if (loginUser != null) {
			session.setAttribute("userLoginInfo", loginUser);
		}
		return mav;
	}

}
