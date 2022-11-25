package com.nt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductController {

	// Path Param , from UI to Controller
	
	@GetMapping("/product/{productId}")
	public ModelAndView getProduct(@PathVariable Integer productId) {
		String msgTxt = "";
		ModelAndView mav = new ModelAndView();
		
		if(productId==101) {
			msgTxt = "Iphone price is : 50000";
		}else
			msgTxt = "Laptop price is : 45000";
		
		mav.addObject("msg", msgTxt);
		mav.setViewName("productView");
		
		return mav;
	}
}
