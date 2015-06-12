package kr.ac.jejuuniv.yang.repository;

import kr.ac.jejuuniv.yang.model.User;

import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository {

	User loginComplete(User user);

	User findByUser(String userid, String userpassword);

}
