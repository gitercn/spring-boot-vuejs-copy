package com.example.demo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/api")
public class BackendController {
	
	@CrossOrigin(origins = "http://localhost:8080")
	@RequestMapping("/helloa")
	public String backendHelloa() {
		System.out.println("backendHello");
		return "backendHello a";
	}

	@RequestMapping("/hellob")
	public String backendHellob() {
		System.out.println("backendHello");
		return "backendHello b";
	}
	
	@RequestMapping("/helloc")
	public String backendHelloc() {
		System.out.println("backendHello");
		return "backendHello c";
	}

}
