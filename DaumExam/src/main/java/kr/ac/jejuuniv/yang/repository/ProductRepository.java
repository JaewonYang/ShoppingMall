package kr.ac.jejuuniv.yang.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.ac.jejuuniv.yang.model.Product;

@Repository
public interface ProductRepository {

	List<Product> findAll();

	void delete(Integer id);

	void insert(Integer id, String title, Integer price, String provider);

	void ProductModify(Integer id, String title, Integer price, String provider, String productinfo);

}