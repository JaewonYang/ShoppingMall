package kr.ac.jejuuniv.yang.controller;

import java.util.List;

import kr.ac.jejuuniv.yang.model.Product;
import kr.ac.jejuuniv.yang.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/modify")
public class ProductModify {

	@Autowired
	private ProductService productService;
	
	@RequestMapping
	public Product productModify(Integer id){
		
		return productService.productModify(id);
	}
	

}