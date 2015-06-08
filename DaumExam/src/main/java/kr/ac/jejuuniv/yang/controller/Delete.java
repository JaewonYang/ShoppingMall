package kr.ac.jejuuniv.yang.controller;

import java.lang.ProcessBuilder.Redirect;
import java.util.List;

import kr.ac.jejuuniv.yang.model.Product;
import kr.ac.jejuuniv.yang.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/delete")
public class Delete {
	
	@Autowired
	private ProductService productService;
	
	@RequestMapping
	public String delete(Integer id){
		productService.delete(id);
		return "redirect:/index";
	}

}
