package com.rupesh;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@GetMapping("/")
	public String sayHello() {
		return "Welcome to Spring AWS from Root";
	}
	
	
	@GetMapping("/second")
	public String sayHello3() {
		return "Welcome to Spring AWS from another version of our application";
	}
	
	
	
	@GetMapping("/hello")
	public String sayHello2() {
		return "Welcome to Spring AWS";
	}
	
}
