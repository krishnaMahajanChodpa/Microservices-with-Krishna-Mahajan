package com.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController 
{
	@Autowired
	private Environment en;
	
	@GetMapping("/port")
	public String welcome()
	{
		String port = en.getProperty("server.port");
		return "Port Number is :: "+ port;
	}
}
