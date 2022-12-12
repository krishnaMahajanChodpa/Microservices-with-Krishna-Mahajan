package com.demo.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class TestService 
{
		public String callApi()
		{
			String apiUrl="https://api.open-meteo.com/v1/forecast?latitude=52.52&longitude=13.41&hourly=temperature_2m";
			
			WebClient webClient = WebClient.create();
			webClient.get()
					.uri(apiUrl)
					.retrieve()
					.bodyToMono(String.class)
					.subscribe(TestService::handleResponse);
			
			System.out.println("Result.....");
			return"Sucess";
			
		}
		public static void handleResponse(String data)
		{
			System.out.println(data);
		}
}
