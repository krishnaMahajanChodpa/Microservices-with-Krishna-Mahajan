package com.test.controller;

import com.test.client.patient.PatientDetails;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoctorDetails 
{
		@Autowired
		private PatientDetails patientDetails;
	
		@GetMapping("/doctor")
		public String doctorDetails()
		{
			String d1="1st Doctor Name : Krishna Mahajan ";
			String d2="2nd Doctor Name : Vishal Sonar ";
			String d3="3rd Doctor Name : Karan Patil ";
			
			String patientDetails2 = patientDetails.patientDetails();
			
			return d1+","+d2+","+d3+":: -------|| Patient Details ||----------:: "+patientDetails2;
		}
}
