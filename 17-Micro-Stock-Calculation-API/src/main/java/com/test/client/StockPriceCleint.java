package com.test.client;

import com.test.binding.StockPriceApi;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "STOCK-PRICE-API")
public interface StockPriceCleint
{
	@GetMapping("/price/{companyName}")
	public StockPriceApi callStockPriceAPI(@PathVariable String companyName);
}
