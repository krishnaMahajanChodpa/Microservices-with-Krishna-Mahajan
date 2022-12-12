package com.test.servcie.impl;

import com.test.entity.BankCreationEntity;
import com.test.repository.BankCreationRepository;
import com.test.service.BankCreationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankServiceImpl implements BankCreationService
{
	@Autowired
	private BankCreationRepository repository;
	
	@Override
	public BankCreationEntity createBank(BankCreationEntity data)
	{
		 repository.save(data);
		 return data;
	}

}
