package com.example.Day_5.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Day_5.Model.Book;
import com.example.Day_5.Repository.BookRepo;

@Service
public class BookService {
	
	@Autowired
	BookRepo br;
	
	public Book add(Book b) {
		return br.save(b);
	}
	
	public List<Book> show() {
		return br.findAll();
	}
	
	public Book showone(int id) {
		if(br.existsById(id))
		{
			return br.getReferenceById(id);
		}
		return null;
	}
	
	public Book update(Book b) {
		return br.saveAndFlush(b);
	}
	
	public boolean delete(int id) {
		if(br.existsById(id))
		{
			br.deleteById(id);
			return true;
		}
		return false;
	}
}
