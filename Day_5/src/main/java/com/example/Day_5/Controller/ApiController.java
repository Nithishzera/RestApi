package com.example.Day_5.Controller;

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
import com.example.Day_5.Model.Book;
import com.example.Day_5.Service.BookService;

@RestController
public class ApiController {
	
	@Autowired
	BookService bs;
	
	@GetMapping("/show")
	public List<Book> showdetails(){
		return bs.show();
	}
	
	@GetMapping("/showone/{id}")
	public Book showonw(@PathVariable int id) {
		return bs.showone(id);
	}
	
	@PostMapping("/add")
	public Book adddetails(@RequestBody Book b) {
		return bs.add(b);
	}
	
	@PutMapping("/update")
	public Book updatedetails(Book b) {
		return bs.update(b);
	}
	
	@DeleteMapping("/delete")
	public boolean deleteitem(@RequestParam int id) {
		return bs.delete(id);
	}
}
