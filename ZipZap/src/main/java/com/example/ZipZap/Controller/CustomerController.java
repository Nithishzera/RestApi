package com.example.ZipZap.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.ZipZap.Model.Customer;
import com.example.ZipZap.Service.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	CustomerService cs;
	
	@PostMapping("/addcustone")
	public Customer addone(@RequestBody Customer c) {
		return cs.add(c);
	}
	
	@PostMapping("/addcust")
	public List<Customer> addmore(@RequestBody List<Customer> c){
		return cs.addmany(c);
	}
	
	@GetMapping("/showcut/{number}")
	public Page<Customer> show(@PathVariable int number,@RequestParam int size,@RequestParam String type){
		return cs.display(number, size, type);
	}
	
	@GetMapping("/showcustone/{id}")
	public Optional<Customer> showone(@PathVariable int id) {
		return cs.displayone(id);
	}
	
	@PutMapping("/updatecust")
	public String modify(@RequestParam int id,@RequestBody Customer c) {
		return cs.update(id,c);
	}
	
	@DeleteMapping("/deletecust")
	public String remove(@RequestParam int id) {
		return cs.delete(id);
	}
	
	@PutMapping("/updateone")
	public String updatecol(@RequestParam String val1,@RequestParam String val2) {
		return cs.updateone(val1, val2);
	}
}
