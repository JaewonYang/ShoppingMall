package kr.ac.jejuuniv.yang.dao;


import java.util.List;

import org.springframework.stereotype.Repository;

import kr.ac.jejuuniv.yang.model.User;

@Repository
public interface UserDao {

	List<User> findAll();

}