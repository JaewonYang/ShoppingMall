package kr.ac.jejuuniv.yang.controller;

import java.util.List;

import kr.ac.jejuuniv.yang.model.makeMember;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class Member {
	
	private Member member;
	
	
	public List<makeMember> list() {
		return member.list();
		
	}
}