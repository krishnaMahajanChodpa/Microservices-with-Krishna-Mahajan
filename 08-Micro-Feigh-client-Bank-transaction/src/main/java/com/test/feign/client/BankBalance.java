package com.test.feign.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "BANK-BALANCE")
public interface BankBalance 
{
	@GetMapping("/balance")
	public String callBalanceApi();
}
