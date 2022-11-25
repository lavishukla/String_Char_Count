package com.nt.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nt.binding.UnlockAccReq;
import com.nt.service.UserServiceImpl;

@RestController
public class UserRest {

	@Autowired
	private UserServiceImpl service;
	
	@PostMapping("/unlockaccount")
	public String unlockAcc(@RequestBody UnlockAccReq request) {
		return service.UnlockAcc(request);
	}
}
