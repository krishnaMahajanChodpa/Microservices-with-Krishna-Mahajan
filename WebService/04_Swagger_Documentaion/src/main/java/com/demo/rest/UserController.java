package com.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController
{
	@GetMapping("/user/{userId}")
	public String getUser(@PathVariable(value = "UserId") Integer userId)
	{
		if(userId==100)
		{
			return "Krishna";
		}
		else
		{
			return"User Not Found..!!";
		}
	}
}
