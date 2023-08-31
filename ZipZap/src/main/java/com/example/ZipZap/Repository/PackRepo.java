package com.example.ZipZap.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.ZipZap.Model.Pack;

@Repository
public interface PackRepo extends JpaRepository<Pack, Integer> {

}
