package com.nt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {

	@GetMapping("/welcome")
	public String DisplayWelcomeMsg(Model model) {
		String MgsTxt = "Welcome to world of JAVA";
		model.addAttribute("msg", MgsTxt);
		return "welcomeView";
	}
}
