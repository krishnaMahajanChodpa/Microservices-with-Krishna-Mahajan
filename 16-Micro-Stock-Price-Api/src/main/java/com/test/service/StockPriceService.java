package com.test.service;

import com.test.binding.StockPriceResponse;

public interface StockPriceService
{
	public StockPriceResponse getStockPrice(String companyName);
}
