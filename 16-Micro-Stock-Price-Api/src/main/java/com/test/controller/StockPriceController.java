package com.test.controller;

import com.test.binding.StockPriceResponse;
import com.test.service.StockPriceService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StockPriceController
{
	@Autowired
	private StockPriceService service;
	
	@GetMapping("/price/{comapnyName}")
	public ResponseEntity<StockPriceResponse> getStockPrice(@PathVariable String comapnyName)
	{
		StockPriceResponse response = service.getStockPrice(comapnyName);
		
		return new ResponseEntity<>(response,HttpStatus.OK);
	}
}


















