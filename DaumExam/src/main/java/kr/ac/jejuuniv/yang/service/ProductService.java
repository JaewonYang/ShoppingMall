package kr.ac.jejuuniv.yang.service;

import java.util.List;

import kr.ac.jejuuniv.yang.model.Product;
import kr.ac.jejuuniv.yang.model.ProductInfo;

public interface ProductService {

	List<Product> list();

	void delete(Integer id);

	Product productModify(Integer id);

	void productModifyComplete(Product product);

	void productInsertComplete(Product product);
	
	

	
}
