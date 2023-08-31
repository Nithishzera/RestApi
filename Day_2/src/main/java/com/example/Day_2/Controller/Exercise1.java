package com.example.Day_2.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Exercise1 {
	
	@Value("${var}")
	private String name;
	
	@GetMapping("/value")
	public String display() {
		String s = "Myself "+name;
		return s;
	}
}
