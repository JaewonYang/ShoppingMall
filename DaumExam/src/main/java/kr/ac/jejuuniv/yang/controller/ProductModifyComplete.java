package kr.ac.jejuuniv.yang.controller;

import kr.ac.jejuuniv.yang.model.Product;
import kr.ac.jejuuniv.yang.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ProductModifyComplete")
public class ProductModifyComplete {

	@Autowired
	private ProductService productService;
	
	@RequestMapping
	public String productModifyComplete(Product product){
		productService.productModifyComplete(product);
		return "redirect:/index";
	}
}
