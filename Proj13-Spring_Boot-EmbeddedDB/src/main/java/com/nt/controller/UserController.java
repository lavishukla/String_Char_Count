package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.nt.binding.User;
import com.nt.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;

	@GetMapping("/user")
	public ModelAndView loadForm() {

		ModelAndView mav = new ModelAndView();
		mav.addObject("user", new User());
		mav.setViewName("userView");
		
		return mav;
	}
	
	@PostMapping("/user")
	public ModelAndView submitForm(User user) {
		System.out.println(user);
		String msgTxt = userService.saveUser(user);
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", msgTxt);
		mav.setViewName("userView");
		
		return mav;
	}
}
