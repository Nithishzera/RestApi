package com.example.ZipZap.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ZipZap.Models.Child;

@Repository
public interface ChildRepo extends JpaRepository<Child, Integer> {

}
