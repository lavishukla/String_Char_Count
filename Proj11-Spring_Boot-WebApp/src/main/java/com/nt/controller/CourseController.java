package com.nt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CourseController {
	
	// Query Param , from UI to Controller

	@GetMapping("/course")
	public ModelAndView getCourseController(@RequestParam("name") String name) {
		String msgText = "";
		
		ModelAndView mvn = new ModelAndView();
		
		if(name.equals("Shashank")) {
			msgText = "Hi, I am from Gorakhpur";
		}else if(name.equals("Shubhankar")) {
			msgText = "Hello, I am from Jaipur";
		}else {
			msgText = "I am from India";
		}
		mvn.addObject("msg", msgText);
		mvn.setViewName("courseView");
		return mvn;
	}
}
