package com.example.Day_4.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.Day_4.Model.StudentEntity;
import com.example.Day_4.Repository.StudentRepo;

@Service
public class StudentService {
	
	@Autowired
	StudentRepo sr;
	
	public StudentEntity saveinformation(StudentEntity ss) {
		return sr.save(ss);
	}
	
	public List<StudentEntity> showinformation(){
		return sr.findAll();
	}
}
