package com.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatientDetails 
{
		@GetMapping("/patient")
		public String patientDetails()
		{
			String p1="1st Patient Name : Nikhil Shimpi ";
			String p2="2nd Patient Name : Pavan Mali";
			String p3="3rd Patient Name : Amol Patil";
			
			return p1+","+p2+","+p3;
			
		}
}
