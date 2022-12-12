package com.example.demo.rest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRest
{
	@RequestMapping("/msg")
	public String showMessage()
	{
		String msg="Hi Krishna, How are you...??";
		
		return msg;
	}
}
















