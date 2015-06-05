package kr.ac.jejuuniv.yang.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.ac.jejuuniv.yang.model.Product;

@Repository
public interface ProductRepository {

   List<Product> findAll();

}