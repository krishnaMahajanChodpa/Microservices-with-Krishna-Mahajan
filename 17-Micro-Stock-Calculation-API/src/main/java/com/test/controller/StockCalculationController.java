package com.test.controller;

import com.test.binding.StockCalculationResponse;
import com.test.service.StockCalculationServcie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StockCalculationController 
{
		@Autowired
		private StockCalculationServcie servcie;
		
	@GetMapping("/cal/{comapnyName}/{quantity}")	
	public StockCalculationResponse getPriceDetails(@PathVariable String comapnyName, @PathVariable Integer quantity)
	{
		return servcie.getStockCost(comapnyName, quantity);
	}
}
