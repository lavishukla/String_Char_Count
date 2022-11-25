package com.nt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer>{
	
	public List<Book> findBybookprice(int d);

}
