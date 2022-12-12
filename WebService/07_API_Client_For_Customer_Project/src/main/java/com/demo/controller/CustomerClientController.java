package com.demo.controller;

import com.demo.service.CallApiOfCustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerClientController
{
	
	@Autowired
	private CallApiOfCustomerService apiOfCustomerService; 
	
	@GetMapping("/customerClient")
	public String getCustomerDetails()
	{
			String call = apiOfCustomerService.getCustomerDetailsUsingAPICall();
		return call;
	}
}
