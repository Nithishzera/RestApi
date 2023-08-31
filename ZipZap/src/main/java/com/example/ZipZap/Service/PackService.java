package com.example.ZipZap.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ZipZap.Model.Pack;
import com.example.ZipZap.Repository.PackRepo;

@Service
public class PackService {
	
	@Autowired
	PackRepo pr;
	
	public Pack getone(Pack p) {
		return pr.save(p);
	}
	
	public List<Pack> getmany(List<Pack> p){
		return pr.saveAll(p);
	}
	
	public List<Pack> showall(){
		return pr.findAll();
	}
	
	public Optional<Pack> showone(int id) {
		return pr.findById(id);
	}
	
	public String update(int id,Pack p) {
		if(pr.existsById(id))
		{
			pr.getReferenceById(id).compare(p);
			pr.save(pr.getReferenceById(id));
			return "Successfully updated";
		}
		return "id not found";
	}
	
	public String delete(int id) {
		if(pr.existsById(id))
		{
			pr.deleteById(id);
			return "Successfully deleted";
		}
		return "id not found";
	}
}
