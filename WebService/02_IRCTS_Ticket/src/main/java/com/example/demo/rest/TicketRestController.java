package com.example.demo.rest;

import com.example.demo.request.PassengerRequestForTicketBooking;
import com.example.demo.response.TicketResponse;

import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TicketRestController 
{

	@PostMapping(
				value="/book",
				
				consumes = {
						"application/xml",
						"application/json"
				},
				produces =
			    {
						"application/xml",
						"application/json"
				}
			)
    public ResponseEntity<TicketResponse>  bookTicket(@RequestBody PassengerRequestForTicketBooking request)
	{
		TicketResponse response=new TicketResponse();
		response.setStatus("CONFORMED");
		response.setPrice("1500.00");

		BeanUtils.copyProperties(request, response); 
		return new ResponseEntity<>(response,HttpStatus.CREATED);
	}
	
}
