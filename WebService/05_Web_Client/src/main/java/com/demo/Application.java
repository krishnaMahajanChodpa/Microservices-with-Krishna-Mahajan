package com.demo;

import com.demo.service.Web_Client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) 
	{
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
	
		/*
		 * Web_Client bean = context.getBean(Web_Client.class); bean.callRestApi();
		 */
	}

}
