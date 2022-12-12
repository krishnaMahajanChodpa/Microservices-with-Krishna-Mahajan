package com.test.controller;

import com.test.feign.client.BankBalance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransactionController 
{
	@Autowired
	private BankBalance balance;
	
	
	@GetMapping("/transaction")
	public String transaction()
	{
		String withdrawal="Do you want to withdrawal money..? ";
		String deposite="Do you want to deposite money..?? ";
		
		String balanceApi = balance.callBalanceApi();
		
		
		return balanceApi + ":: ------ ::" +withdrawal + "::  ------  ::" + deposite;
	}
}
