package com.example.Day_1.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Exercise2 {

	@GetMapping("/name")
	public String display() {
		String name = "Nithish";
		String a = "Welcome "+name;
		return a;
	}
}
