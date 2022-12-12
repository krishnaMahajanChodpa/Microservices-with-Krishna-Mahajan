package com.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductsController 
{
		@GetMapping("mobile")
		public String mobile()
		{
			return "This is Mobile Products List Method..!!s";
		}
		
		
		@GetMapping("/shirt")
		public String shirts()
		{
			return "This is shirts products list method..!!";
		}
}
