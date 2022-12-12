package com.test.controller;

import com.test.entity.BankCreationEntity;
import com.test.service.BankCreationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankCreationController 
{
	@Autowired
	private BankCreationService service;

	@PostMapping("/bankCreation")
	public BankCreationEntity createBank(@RequestBody BankCreationEntity bank)
	{
		return service.createBank(bank);
	}
}
