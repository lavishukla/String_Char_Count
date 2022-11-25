package com.nt.restcontroller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {

	@GetMapping("/welcome")
	public String getMsg() {
			return "Welcome to REST APIs Development";
		}
		
	@GetMapping("/wish")
	public ResponseEntity<String> getStatus(){
		String msg = "Good Morning!!";
		return new ResponseEntity<>(msg,HttpStatus.OK);
	}
		
}
