package com.demo.controller;

import com.demo.entity.AddressData;
import com.demo.entity.CustomerEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController
{
	@GetMapping("/customer")
	public CustomerEntity customerData()
	{
		CustomerEntity ce=new CustomerEntity();
		
		ce.setName("Krishna");
		ce.setEmail("krishna@gmail.com");
		
		AddressData ad=new AddressData();
		ad.setState("Maharashtra");
		ad.setCity("Chopda");
		ad.setPinCode("425107");
		
		ce.setAddress(ad);
		
		return ce;
	}
}
