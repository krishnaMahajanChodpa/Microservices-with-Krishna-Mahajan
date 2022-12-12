package com.demo.service;

import com.demo.pogo.CustomerApiDetails;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CallApiOfCustomerService 
{
	public String getCustomerDetailsUsingAPICall()
	{
		String apiURL="http://localhost:8080/customer";
		
		RestTemplate rt=new RestTemplate();
		ResponseEntity<CustomerApiDetails> responseEntity = rt.getForEntity(apiURL, CustomerApiDetails.class);
		int statusCodeValue = responseEntity.getStatusCodeValue();
		
		if(statusCodeValue==200)
		{
			CustomerApiDetails body = responseEntity.getBody();		
			//body.getAddress().getCity().toLowerCase();
			return  body.getAddress().getState().toUpperCase();
		}
		return null;
	}
}
