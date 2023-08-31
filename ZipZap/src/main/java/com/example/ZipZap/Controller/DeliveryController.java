package com.example.ZipZap.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.ZipZap.Model.Delivery;
import com.example.ZipZap.Service.DeliveryService;

@RestController
public class DeliveryController {
	
	@Autowired
	DeliveryService ds;
	
	@PostMapping("/adddelone")
	public Delivery addone(@RequestBody Delivery d) {
		return ds.add(d);
	}
	
	@PostMapping("/adddel")
	public List<Delivery> addmore(@RequestBody List<Delivery> d){
		return ds.addmany(d);
	}
	
	@GetMapping("/showdel")
	public List<Delivery> show(){
		return ds.display();
	}
	
	@GetMapping("/showdelone/{id}")
	public Optional<Delivery> showone(@PathVariable int id) {
		return ds.displayone(id);
	}
	
	@PutMapping("/updatedel")
	public String modify(@RequestParam int id,@RequestBody Delivery c) {
		return ds.update(id,c);
	}
	
	@DeleteMapping("/deletedel")
	public String remove(@RequestParam int id) {
		return ds.delete(id);
	}
}
