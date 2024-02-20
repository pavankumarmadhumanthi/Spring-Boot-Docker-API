package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {
	
	@GetMapping("/")
	public String getdata() {
		return "HII Welcome";
	}

}
