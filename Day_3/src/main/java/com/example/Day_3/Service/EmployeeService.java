package com.example.Day_3.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.Day_3.Model.Employee;
import com.example.Day_3.Repository.EmployeeRepo;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepo ee;
	
	public Employee saveInfo(Employee e) {
		return ee.save(e);
	}
	
	public List<Employee> showInfo(){
		return ee.findAll();
	}
}
