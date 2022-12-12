package com.demo.controller;

import com.demo.service.Web_Client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Client_Controller
{
	@Autowired
	private Web_Client client;
	
	@GetMapping("/CallService")
	public String getDetails()
	{
		String api = client.callRestApi();
		
		return api;
	}
}
