package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.binding.User;
import com.nt.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepo;
	
	public String saveUser(User user) {
		User save = userRepo.save(user);
	 	int id = save.getId();		
	 	if(id>0) {
	 		 return "User Saved";
	 	}else {
	 		return "Failed to save";
	 	}
	}
}
