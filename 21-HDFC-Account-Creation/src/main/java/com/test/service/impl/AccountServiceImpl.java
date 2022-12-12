package com.test.service.impl;

import java.util.List;

import com.test.entity.AccountCreationEntity;
import com.test.repository.AccountRepository;
import com.test.service.AccountService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService
{

	@Autowired
	private AccountRepository repository;
	
	@Override
	public AccountCreationEntity createUser(AccountCreationEntity user)
	{
		return repository.save(user);
	}

	@Override
	public List<AccountCreationEntity> getUser()
	{
		return repository.findAll();
	}

	@Override
	public AccountCreationEntity getUserByAccountNumber(int accountNumber)
	{
		
		return repository.getOne(accountNumber);
	}

	@Override
	public void deleteAccount(int id) {
		
		AccountCreationEntity ac=repository.getOne(id);
		repository.delete(ac);
	}

	@Override
	public AccountCreationEntity updateAccount(AccountCreationEntity user) 
	{
		return repository.save(user);
	}

}
