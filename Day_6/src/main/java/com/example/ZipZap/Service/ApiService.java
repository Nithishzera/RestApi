package com.example.ZipZap.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.ZipZap.Models.Child;
import com.example.ZipZap.Repository.ChildRepo;

@Service
public class ApiService {
	
	@Autowired
	ChildRepo cr;
	
	public Child add(Child c){
		return cr.save(c);
	}
	
	public List<Child> show(){
		return cr.findAll();
	}
	
	public Page<Child> showpage(){
		Pageable p = PageRequest.of(1, 2, Sort.by("babyFirstName"));
		return cr.findAll(p);
	}
}