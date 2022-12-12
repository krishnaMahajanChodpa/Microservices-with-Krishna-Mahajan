package com.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BalanceController 
{
	@GetMapping("balance")
	public String balance()
	{
		return "Your Account Balance is : 10,000 ";
	}
}
