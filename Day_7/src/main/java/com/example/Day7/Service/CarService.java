package com.example.Day7.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Day7.Model.Car;
import com.example.Day7.Repository.CarRepo;

@Service
public class CarService {
	
	@Autowired
	CarRepo cr;
	
	public Car add(Car c) {
		return cr.save(c);
	}
	
	public List<Car> owner(int id){
		return cr.owners(id);
	}
	
	public List<Car> address(String s){
		return cr.address(s);
	}
	
	public List<Car> carname(String d){
		return cr.carname(d);
	}
	
	public List<Car> cartype(int id,String type){
		return cr.cartype(id, type);
	}
}
	