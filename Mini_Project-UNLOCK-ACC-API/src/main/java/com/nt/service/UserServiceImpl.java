package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.binding.UnlockAccReq;
import com.nt.constants.AppConstant;
import com.nt.entities.UserEntity;
import com.nt.repository.UserRepository;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private AppConstant appConstant;

	@Override
	public String UnlockAcc(UnlockAccReq request) {
		
		UserEntity user = userRepo.findByEmailAndTempPwd(request.getEmail(), request.getTempPwd());
		if(user!=null) {
			user.setPwd(request.getNewPwd());
			user.setAccStatues(appConstant.UNLOCKED);
			userRepo.save(user);
			return appConstant.accountUnlocked;
		}
		return appConstant.invalidTempPwd;
	}
}
