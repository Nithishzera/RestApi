package com.example.Day7.Controller;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Day7.Model.Car;
import com.example.Day7.Service.CarService;

@RestController
public class ApiController {
	
	@Autowired
	CarService cs;
	
	@PostMapping("/")
	public Car update(@RequestBody Car c) {
		return cs.add(c);
	}
	
	@GetMapping("/owners")
	public List<Car> show(@RequestParam int id){
		return cs.owner(id);
	}
	
	@GetMapping("/address")
	public List<Car> showcar(@RequestParam String s){
		return cs.address(s);
	}
	
	@GetMapping("/carname")
	public List<Car> showname(@RequestParam String n){
		return cs.carname(n);
	}
	
	@GetMapping("/both")
	public List<Car> showboth(@RequestParam int id,@RequestParam String s){
		return cs.cartype(id, s);
	}
}
