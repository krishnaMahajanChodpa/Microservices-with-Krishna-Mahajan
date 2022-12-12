package com.demo.service;

import com.demo.request.TicketBookingRequest;
import com.demo.response.TicketBookingResponse;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class IrctcTicketClientService 
{
	public TicketBookingResponse bookTicket(TicketBookingRequest requestData)
	{
		String endpointURL="http://localhost:9090/book";
		
		RestTemplate rt=new RestTemplate();
		
		ResponseEntity<TicketBookingResponse> responseEntity = 
							rt.postForEntity(endpointURL, requestData, TicketBookingResponse.class);
		
		TicketBookingResponse body = responseEntity.getBody();
		return body;
	}	
}






