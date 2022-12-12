package com.demo.rest;

import com.demo.request.TicketBookingRequest;
import com.demo.response.TicketBookingResponse;
import com.demo.service.IrctcTicketClientService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IrctcClientController 
{
	@Autowired
	private IrctcTicketClientService service;
	
	@PostMapping(value="/ticketBooking" ,	
			
			consumes = {
					      "application/json",
						  "appliocation/xml"
					      
						},
			produces = {
					
					      "application/json",
			   			  "application/xml"
					      
					    }
			    )
	public TicketBookingResponse bookTickedOfPassanger(@RequestBody TicketBookingRequest requestData )
	{
		TicketBookingResponse bookTicket = service.bookTicket(requestData);
		
		return bookTicket;
	}

}
