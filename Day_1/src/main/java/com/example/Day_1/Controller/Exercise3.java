package com.example.Day_1.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Exercise3 {

	@GetMapping("/colour")
	public String display() {
		
		String colour = "Black";
		String a = "I am fond of "+colour+" colour";
		return a;
	}
}
