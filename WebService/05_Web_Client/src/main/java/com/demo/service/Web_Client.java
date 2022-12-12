package com.demo.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class Web_Client
{
		@Value("${app.url.apiUrl}")
		private String apiUrl;
	
		public String callRestApi()
		{
			//String apiUrl= ""; 
			
			//String apiUrl="http://localhost:8080/msg";
			//String apiUrl= "http://api.weatherapi.com/v1/current.json?key=&q=London&aqi=no";
			
			RestTemplate rt=new RestTemplate();
			ResponseEntity<String> responseEntity = rt.getForEntity(apiUrl,String.class);
		
			int statusCode = responseEntity.getStatusCodeValue();	
			
			if(statusCode==200)
			{
				String body= responseEntity.getBody();
				return body;
			}
			
			return null;
		}
}
