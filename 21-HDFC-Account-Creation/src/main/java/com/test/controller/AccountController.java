package com.test.controller;

import java.util.List;

import com.test.entity.AccountCreationEntity;
import com.test.service.AccountService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class AccountController
{
	@Autowired
	private AccountService service;
	
	@PostMapping
	public AccountCreationEntity createBankUser(@RequestBody AccountCreationEntity user)
	{
		return service.createUser(user);
	}
	
	
	@GetMapping
	public List<AccountCreationEntity> getAllUser()
	{
		return service.getUser();
	}
	
	@PutMapping("/{id}")
	public AccountCreationEntity updateAccount(@RequestBody AccountCreationEntity user ,@PathVariable(value="id") int id)
	{
		return service.updateAccount(user);
	}
	
	
	@DeleteMapping("/{id}")
	public String deleteAccount(@PathVariable(value="id")int id)
	{
		 service.deleteAccount(id);
		 return  "Account Successfully deleted ...!!!";

	}
}
