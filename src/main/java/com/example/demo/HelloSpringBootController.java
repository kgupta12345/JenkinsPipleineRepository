package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloSpringBootController {

	@RequestMapping("/")
	public String welcome() {
		return "Welcome to Spring Boot";
	}

	@RequestMapping("/hello")
	public String myData() {
		return "Hello Spring Boot. Awesome !";
	}
}
