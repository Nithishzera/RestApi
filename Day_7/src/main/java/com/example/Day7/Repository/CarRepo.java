package com.example.Day7.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.example.Day7.Model.Car;

@Repository
public interface CarRepo extends JpaRepository<Car, Integer> {
	
	@Query(value="select * from car where owners= :id", nativeQuery = true)
	List<Car> owners(int id);
	
	@Query(value="select * from car where address= :s", nativeQuery = true)
	List<Car> address(String s);
	
	@Query(value="select * from car where carName= :d", nativeQuery = true)
	List<Car> carname(String d);
	
	@Query(value="select * from car where owners= :d AND carType= :type", nativeQuery = true)
	List<Car> cartype(int id,String type);
}
