package com.example.ZipZap.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;	
import org.springframework.stereotype.Repository;
import com.example.ZipZap.Model.Customer;
import jakarta.transaction.Transactional;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer> {
	
	@Modifying
	@Transactional
	@Query(value="update Customer set password= :val2 where name= :val1",nativeQuery = true)
	void updatetable(String val1,String val2);
}