
package com.test.service.impl;

import com.test.binding.StockPriceResponse;
import com.test.repository.StockRepository;
import com.test.service.StockPriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class StockPriceServiceImpl implements StockPriceService
{
	@Autowired
	private StockRepository repository;
	
	@Autowired
	private Environment en;
	
	@Override
	public StockPriceResponse getStockPrice(String companyName)
	{
		Double stockPrice = repository.findStockPriceByCompanyName(companyName);
		String port = en.getProperty("server.port");
		
		StockPriceResponse response=new StockPriceResponse();
		response.setCompanyName(companyName);
		response.setComapnyStockPrice(stockPrice);
		response.setPortNumber(Integer.parseInt(port));
		
		return response;
	}
}
