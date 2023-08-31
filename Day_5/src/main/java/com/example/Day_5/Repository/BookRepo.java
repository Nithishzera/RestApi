package com.example.Day_5.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.Day_5.Model.Book;

@Repository
public interface BookRepo extends JpaRepository<Book, Integer> {

}
