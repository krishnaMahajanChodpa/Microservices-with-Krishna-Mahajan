package com.test.service;

import java.util.List;
import com.test.entity.AccountCreationEntity;

public interface AccountService
{
	public AccountCreationEntity createUser(AccountCreationEntity user);
	
	public List<AccountCreationEntity> getUser();
	
	public AccountCreationEntity getUserByAccountNumber(int id);
	
	public void deleteAccount(int id);
	
	public AccountCreationEntity updateAccount(AccountCreationEntity user);
}
