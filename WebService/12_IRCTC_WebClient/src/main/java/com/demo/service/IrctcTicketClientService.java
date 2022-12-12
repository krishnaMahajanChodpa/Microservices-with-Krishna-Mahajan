package com.demo.service;

import com.demo.request.TicketBookingRequest;
import com.demo.response.TicketBookingResponse;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Mono;

@Service
public class IrctcTicketClientService 
{
	public TicketBookingResponse bookTicket(TicketBookingRequest requestData)
	{
		String endpointURL="http://localhost:9090/book";
				WebClient webClient = WebClient.create();	
					TicketBookingResponse block = webClient.post()
															.uri(endpointURL)
															.contentType(MediaType.APPLICATION_JSON)
															.accept(MediaType.APPLICATION_JSON)
															.body(Mono.just(requestData), TicketBookingRequest.class)
															//.body(BodyInserters.fromValue(requestData))
															.retrieve()
															.bodyToMono(TicketBookingResponse.class)
															.block();															
		System.out.println(block);
		return block;
	}	
}
























