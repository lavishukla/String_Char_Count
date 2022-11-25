package com.nt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreetController {

	@GetMapping("/greet")
	public String DisplayWelcomeMsg(Model model) {
		String MgsTxt = "Good Morning!";
		model.addAttribute("msg", MgsTxt);
		return "greetView";
	}
}
