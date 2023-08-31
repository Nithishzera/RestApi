package com.example.ZipZap.Service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import com.example.ZipZap.Model.Customer;
import com.example.ZipZap.Repository.CustomerRepo;

@Service
public class CustomerService {
	
	@Autowired
	CustomerRepo cr;
	
	public Customer add(Customer c) {
		return cr.save(c);
	}
	
	public List<Customer> addmany(List<Customer> c){
		return cr.saveAll(c);
	}
	
	public Page<Customer> display(int number,int size,String type) {
		Pageable p = PageRequest.of(number,size,Sort.by(type));
		return cr.findAll(p);
	}
	
	public Optional<Customer> displayone(int id) {
		return cr.findById(id);
	}
	
	public String update(int id,Customer c) {
		if(cr.existsById(id))
		{
			cr.getReferenceById(id).compare(c);
			cr.save(cr.getReferenceById(id));
			return "Successfully updated";
		}
		return "id not found";
	}
	
	public String delete(int id) {
		if(cr.existsById(id))
		{
			cr.deleteById(id);
			return "Successfully deleted";
		}
		return "id not found";
	}
	
	public String updateone(String val1,String val2) {
		try {
			cr.updatetable(val1, val2);
			return "Successfully updated";
		}catch(Exception e) {
			return e.getMessage();
		}
	}
}
