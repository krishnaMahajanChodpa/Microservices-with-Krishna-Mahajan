package com.demo.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class WebClientService 
{
	public String callApi()
	{
			String endPointUrl="https://api.open-meteo.com/v1/forecast?latitude=52.52&longitude=13.41&hourly=temperature_2m";
			
			WebClient webClient = WebClient.create();
			String block = webClient.get()
							.uri(endPointUrl)
							.retrieve()
							.bodyToMono(String.class)
							.block();
			
			return block;
	}
	
}
