package com.nt.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.nt.binding.StockBinding;
import com.nt.client.StockPriceClient;

@RestController
public class StockCalcRestController {
	
	@Autowired
	private StockPriceClient priceClient; 

	@GetMapping("/calc/{companyName}/{qty}")
	public ResponseEntity<String> calculate(@PathVariable String companyName,@PathVariable Integer qty){
		
		StockBinding stockBinding =  priceClient.invokeStockPrice(companyName);
		Double price = stockBinding.getCompanyPrice();
		String portNumber = stockBinding.getPort();
		
		Double totPrice = price * qty;
		String msg = "Total Price is:"+totPrice+"(Price api SERVER PORT ::"+portNumber+")";
		
		return new ResponseEntity<String>(msg,HttpStatus.OK);
	}
}
