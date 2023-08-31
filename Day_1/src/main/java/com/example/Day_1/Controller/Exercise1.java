package com.example.Day_1.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Exercise1 {

	@GetMapping("/welcome")
	public String Welcome() {
		return "Welcome";
	}
}
