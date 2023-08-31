package com.example.ZipZap.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.ZipZap.Model.Job;
import com.example.ZipZap.Repository.JobRepo;

@Service
public class JobService {
	
	@Autowired
	JobRepo jr;
	
	public Job addone(Job j) {
		return jr.save(j);
	}
	
	public List<Job> add(List<Job> j){
		return jr.saveAll(j);
	}
	
	public List<Job> showsender(int id){
		return jr.getsender(id);
	}
	
	public List<Job> showreceiver(int id){
		return jr.getreceiver(id);
	}
	
	public String update(int id,Job j) {
		if(jr.existsById(id)) 
		{
			jr.getReferenceById(id).compare(j);
			jr.save(jr.getReferenceById(id));
			return "Successfully updated";
		}
		return "id not found";
	}
	
	public String delete (int id) {
		if(jr.existsById(id))
		{
			String status = jr.getReferenceById(id).getStatus();
			if(status=="yes")
			{
				jr.deleteById(id);
				return "Successfully deleted";
			}
		}
		return "id not found";
	}
}
