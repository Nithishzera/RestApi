package com.example.ZipZap.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.ZipZap.Model.Delivery;
import com.example.ZipZap.Repository.DeliveryRepo;

@Service
public class DeliveryService {
	
	@Autowired
	DeliveryRepo dr;
	
	public Delivery add(Delivery d) {
		return dr.save(d);
	}
	
	public List<Delivery> addmany(List<Delivery> d){
		return dr.saveAll(d);
	}
	
	public List<Delivery> display() {
		return dr.findAll();		
	}
	
	public Optional<Delivery> displayone(int id) {
		return dr.findById(id);
	}
	
	public String update(int id,Delivery d) {
		if(dr.existsById(id))
		{
			dr.getReferenceById(id).compare(d);
			dr.save(dr.getReferenceById(id));
			return "Successfully updated";
		}
		return "id not found";
	}
	
	public String delete(int id) {
		if(dr.existsById(id))
		{
			dr.deleteById(id);
			return "Successfully deleted";
		}
		return "id not found";
	}
}
