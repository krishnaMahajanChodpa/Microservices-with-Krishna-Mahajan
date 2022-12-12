package com.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController 
{
	@GetMapping("/phonePay")
	public String phonePay()
	{
		return "PhonePay payment option..!!";
	}
	
	@GetMapping("/googlePay")
	public String googlePay()
	{
		return "GooglePay payment option..!!";
	}
}
