package com.demo.controller;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestYmlController
{
		@Value("${app.messages.greetMsg}")
		private String gMsg;
		
		@Value("${app.messages.welcomeMsg}")
		private String wMsg;
		
		@Value("${app.emp.name}")
		private String eName;
		
		@GetMapping("/wmsg")
		public String welcomeMsg()
		{
			return wMsg;
		}
		
		@GetMapping("/gmsg")
		public String greetMsg()
		{
			return gMsg;
		}
		
		@GetMapping("/ename")
		public String eName()
		{
			return eName;
		}
}

















