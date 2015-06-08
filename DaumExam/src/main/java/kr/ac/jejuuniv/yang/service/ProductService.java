package kr.ac.jejuuniv.yang.service;

import java.util.List;

import kr.ac.jejuuniv.yang.model.Product;

public interface ProductService {

	List<Product> list();

	void delete(Integer id);

	void productModify(Integer id, String title, Integer price, String provider);
}
