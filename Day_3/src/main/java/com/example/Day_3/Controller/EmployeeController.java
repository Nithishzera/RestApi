package com.example.Day_3.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.Day_3.Model.Employee;
import com.example.Day_3.Service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService es;
	
	@PostMapping("/add")
	public Employee add(@RequestBody Employee e) {
		return es.saveInfo(e);
	}
	
	@GetMapping("/show")
	public List<Employee> show(){
		return es.showInfo();
	}
}
