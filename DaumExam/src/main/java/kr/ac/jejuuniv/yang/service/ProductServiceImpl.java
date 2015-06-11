package kr.ac.jejuuniv.yang.service;

import java.util.List;

import kr.ac.jejuuniv.yang.model.Product;
import kr.ac.jejuuniv.yang.repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;

	@Override
	public List<Product> list() {
		return productRepository.findAll();
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		productRepository.delete(id);
	}

	@Override
	public Product productModify(Integer id){
		return productRepository.ProductModify(id);
	}

	@Override
	public void productModifyComplete(Product product) {
		productRepository.productModifyComplete(product);
		
	}

	@Override
	public void productInsertComplete(Product product) {
		productRepository.productInsertComplete(product);
	}

}
