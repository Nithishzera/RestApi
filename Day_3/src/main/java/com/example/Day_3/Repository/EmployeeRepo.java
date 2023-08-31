package com.example.Day_3.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.Day_3.Model.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer>{

}
