package com.test.client.patient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "PATIENT-DETAILS")
public interface PatientDetails
{
	
	@GetMapping("/patient")
	public String patientDetails();
	
}
