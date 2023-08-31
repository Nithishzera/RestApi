package com.example.ZipZap.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.ZipZap.Models.Child;
import com.example.ZipZap.Service.ApiService;

@RestController
public class ApiController {
	
	@Autowired
	ApiService as;
	
	@PostMapping("/add")
	public Child update (@RequestBody Child c) {
		return as.add(c);
	}
	
	@GetMapping("/show")
	public List<Child> showone(){
		return as.show();
	}
	
	@GetMapping("/page")
	public Page<Child> showpage(){
		return as.showpage();
	}
}
