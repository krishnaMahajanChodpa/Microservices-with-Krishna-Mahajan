package com.test.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeApiController 
{
	@GetMapping("/welcome")
	public String welcomeMsg()
	{
		return "Welcome in Krish Compusoft servces...!!";
	}
}
