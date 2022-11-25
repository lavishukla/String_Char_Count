package com.nt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.nt.binding.User;

@Controller
public class FormController {

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
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", "User Saved Susseccfully..");
		mav.setViewName("userView");
		
		return mav;
	}
}
