package kr.ac.jejuuniv.yang.controller;

import javax.servlet.http.HttpSession;

import kr.ac.jejuuniv.yang.model.Product;
import kr.ac.jejuuniv.yang.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/insertComplete")
public class ProductInsertComplete {

	@Autowired
	ProductService productService;

	@RequestMapping(method = RequestMethod.POST)
	public String productInsertComplete(@ModelAttribute Product product) {
		productService.productInsertComplete(product);
		
		return "redirect:/index";
	}
}