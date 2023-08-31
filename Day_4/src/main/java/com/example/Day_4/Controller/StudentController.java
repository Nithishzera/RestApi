package com.example.Day_4.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.Day_4.Model.StudentEntity;
import com.example.Day_4.Service.StudentService;

@RestController
public class StudentController {
		
	@Autowired
	StudentService st;
	
	@PostMapping("/add")
	public StudentEntity addinformation(@RequestBody StudentEntity ss) {
		return st.saveinformation(ss);
	}
	
	@GetMapping("/show")
	public List<StudentEntity> show(){
		return st.showinformation();
	}
}
