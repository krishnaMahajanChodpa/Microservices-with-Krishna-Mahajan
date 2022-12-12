package com.example.demo.rest;

import com.example.demo.test.Customer;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PutAndDeleteRestController 
{
		@PutMapping(value = "/customer", consumes = "application/json" , produces = "application/json")
		public ResponseEntity<String> updateCustomer(@RequestBody Customer request)
		{
			// write logic for update customer data.. 
			System.out.println(request);
			
			return new ResponseEntity<>("Record Updated ..!!", HttpStatus.OK);
		}
		
		
		@DeleteMapping(value = "/delete/{customerId}")
		public ResponseEntity<String> deleteCustomer(@PathVariable Integer customerId)
		{
			System.out.println(customerId);
			return new ResponseEntity<>("Record is deleted Succefully..!!", HttpStatus.OK);
					
		}
		
		
}




















