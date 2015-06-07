package kr.ac.jejuuniv.yang.service;

import java.util.List;

import kr.ac.jejuuniv.yang.model.Product;
import kr.ac.jejuuniv.yang.repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public List<Product> list(){
		return productRepository.findAll();
	}
}
