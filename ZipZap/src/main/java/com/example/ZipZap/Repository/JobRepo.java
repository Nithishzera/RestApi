package com.example.ZipZap.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.example.ZipZap.Model.Job;

@Repository
public interface JobRepo extends JpaRepository<Job, Integer> {
	
	@Query(value = "select * from job where sender= :id", nativeQuery = true)
	List<Job> getsender(int id);
	
	@Query(value = "select * from job where receiver= :id", nativeQuery = true)
	List<Job> getreceiver(int id);
}
