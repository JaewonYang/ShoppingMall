package kr.ac.jejuuniv.yang.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.ac.jejuuniv.yang.model.Product;

@Repository
public interface ProductRepository {

	List<Product> findAll();

	void delete(Integer id);

	void insert(Integer id, String title, Integer price, String provider);

	Product ProductModify(Integer id);

	void productModifyComplete(Product product);

	void productInsertComplete(Product product);

}