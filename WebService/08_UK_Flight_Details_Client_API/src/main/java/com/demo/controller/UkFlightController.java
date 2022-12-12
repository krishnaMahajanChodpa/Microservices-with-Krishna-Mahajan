package com.demo.controller;

import com.demo.service.FlightService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.metrics.jfr.FlightRecorderApplicationStartup;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UkFlightController 
{
		@Autowired
		private FlightService flightService;

		
		@GetMapping("/flightDetails")
		public String flightDetails()
		{	
			return flightService.getFlightDetails();
		}
}
