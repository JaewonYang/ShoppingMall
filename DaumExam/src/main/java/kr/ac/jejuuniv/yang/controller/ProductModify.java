package kr.ac.jejuuniv.yang.controller;

import kr.ac.jejuuniv.yang.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/ProductModify?${product.id}")
public class ProductModify {

	@Autowired
	private ProductService productService;
	

}
