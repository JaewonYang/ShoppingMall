package kr.ac.jejuuniv.yang.service;

import kr.ac.jejuuniv.yang.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void loginnonPage() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void loginCompletePage() {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
