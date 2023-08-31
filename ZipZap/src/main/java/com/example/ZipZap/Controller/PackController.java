package com.example.ZipZap.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.ZipZap.Model.Pack;
import com.example.ZipZap.Service.PackService;

@RestController
public class PackController {
	
	@Autowired
	PackService ps;
	
	@PostMapping("/addpackone")
	public Pack addone(@RequestBody Pack p) {
		return ps.getone(p);
	}
	
	@PostMapping("/addpack")
	public List<Pack> add(@RequestBody List<Pack> p){
		return ps.getmany(p);
	}
	
	@GetMapping("/showpackone")
	public Optional<Pack> dispone(@RequestParam int id) {
		return ps.showone(id);
	}
	
	@GetMapping("/showpack")
	public List<Pack> disp(){
		return ps.showall();
	}
	
	@PutMapping("/updatepack")
	public String modify(@RequestParam int id,@RequestBody Pack p) {
		return ps.update(id, p);
	}
	
	@DeleteMapping("/deletepack")
	public String remove(@RequestParam int id) {
		return ps.delete(id);
	}
}
