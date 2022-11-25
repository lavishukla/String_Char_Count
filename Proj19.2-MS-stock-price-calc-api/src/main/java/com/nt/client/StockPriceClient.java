package com.nt.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.nt.binding.StockBinding;

@FeignClient(name="STOCK-PRICE-API")
public interface StockPriceClient {

	@GetMapping("/price/{companyName}")
	public StockBinding invokeStockPrice(@PathVariable String companyName);
}
