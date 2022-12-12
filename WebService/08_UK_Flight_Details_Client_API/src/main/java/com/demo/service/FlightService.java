package com.demo.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class FlightService 
{
	public String getFlightDetails()
	{
		String endPointUrl="http://mu.mulesoft-training.com/essentials/united/flights/";
		RestTemplate rt=new RestTemplate();
		
		ResponseEntity<String> responeseEntity= rt.getForEntity(endPointUrl,String.class);
		String body = responeseEntity.getBody();
		
		return body;
	}
}
