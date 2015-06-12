package kr.ac.jejuuniv.yang.service;

import kr.ac.jejuuniv.yang.model.User;

public interface LoginService {

	void loginnonPage();

	User loginComplete(User user);

}
