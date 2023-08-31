package com.example.ZipZap.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.ZipZap.Model.Job;
import com.example.ZipZap.Service.JobService;

@RestController
public class JobController {
	
	@Autowired
	JobService js;
	
	@PostMapping("/addjobone")
	public Job insertone(@RequestBody Job j) {
		return js.addone(j);
	}
	
	@PostMapping("/addjob")
	public List<Job> insert(@RequestBody List<Job> j){
		return js.add(j);
	}
	
	@GetMapping("/showsender/{id}")
	public List<Job> dispsender(@PathVariable int id){
		return js.showsender(id);
	}
	
	@GetMapping("/showreceiver/{id}")
	public List<Job> dispreceiver(@PathVariable int id){
		return js.showreceiver(id);
	}
	
	@PutMapping("/updatejob")
	public String modify(@RequestParam int id,@RequestBody Job j) {
		return js.update(id, j);
	}
	
	@DeleteMapping("/deletejob")
	public String remove(@RequestParam int id) {
		return js.delete(id);
	}
}
