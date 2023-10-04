package com.finalProject.finalProjectAQE;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@GetMapping("/get")
	public String handleGetRequest() {
		return "Welcome to Amdocs";
	}
	
	@GetMapping("/in")
	public String handleInRequest() {
		return "We are going to run project on jenkins";
	}
}
