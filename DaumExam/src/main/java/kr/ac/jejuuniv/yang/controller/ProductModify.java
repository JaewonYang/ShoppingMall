package kr.ac.jejuuniv.yang.controller;

import java.util.List;

import kr.ac.jejuuniv.yang.model.ProductInfo;
import kr.ac.jejuuniv.yang.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/ProductModify")
public class ProductModify {

	@Autowired
	private ProductService productService;
	
	@RequestMapping
	public void productModify(Integer id, String title, Integer price,
			String provider) {
		productService.productModify(id, title, price, provider);
	}

}
