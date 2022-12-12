package com.test.service;

import com.test.binding.StockCalculationResponse;
import com.test.binding.StockPriceApi;
import com.test.client.StockPriceCleint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StockCalculationServcie 
{
	@Autowired
	private StockPriceCleint client;
	
	
	public StockCalculationResponse getStockCost(String comapnyName, Integer quantity)
	{
		StockCalculationResponse response=new StockCalculationResponse();
		
		StockPriceApi priceAPI = client.callStockPriceAPI(comapnyName);
		Double stockPrice = priceAPI.getComapnyStockPrice();
		Double totalCost= stockPrice * quantity;
		
		response.setComapnyName(comapnyName);
		response.setQuantity(quantity);
		response.setTotalCost(totalCost);
		response.setPortNumber(priceAPI.getPortNumber());
		
		return response;
	}
}
