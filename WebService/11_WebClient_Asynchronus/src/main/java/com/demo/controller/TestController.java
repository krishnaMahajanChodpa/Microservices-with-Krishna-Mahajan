package com.demo.controller;

import com.demo.service.TestService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController 
{
	@Autowired
	private TestService service;
	
	@GetMapping("/api")
	public String apiController()
	{
		String callApi = service.callApi();
		return callApi;
	}
}
