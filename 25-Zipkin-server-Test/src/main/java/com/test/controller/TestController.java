package com.test.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController 
{
		
		Logger logger=LoggerFactory.getLogger(TestController.class);
		
		@GetMapping("/welcome")
		public String getWelcome()
		{
		 	logger.info(" ******  getWelcome() Excution Started.. ***********");
			
			String msg="Welcome Krishna";
			
			logger.info(" ******* getWelcome() Excution Stop... ******** ");
			
			return msg;
		}
}





