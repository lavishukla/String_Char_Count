package com.nt.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.nt.binding.StockPrice;
import com.nt.repository.IStockRepository;

@RestController
public class StockRestController {

	@Autowired
	private IStockRepository repo;
	
	@Autowired
	private Environment env;
	
	@GetMapping("/price/{companyName}")
	public ResponseEntity<StockPrice> getStockPrice(@PathVariable String companyName){
		
		StockPrice obj = repo.findByCompanyName(companyName);
		
		String port = env.getProperty("server.port");
		obj.setPort(port);
		
		return new ResponseEntity<StockPrice>(obj,HttpStatus.OK);
	}
}
