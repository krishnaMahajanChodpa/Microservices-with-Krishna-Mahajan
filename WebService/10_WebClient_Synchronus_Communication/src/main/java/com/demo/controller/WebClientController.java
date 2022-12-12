package com.demo.controller;

import com.demo.service.WebClientService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebClientController 
{

	@Autowired
	private WebClientService clientService;
	
	
	@GetMapping("/webclient")
	public String classService()
	{
		String callApi = clientService.callApi();
		return callApi;
	}
	
	
}
