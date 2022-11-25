package com.nt;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import com.nt.entity.Book;
import com.nt.repository.BookRepository;

@SpringBootApplication
public class Proj2SpringBootDataJpaPagingSortingApplication {

	public static void main(String[] args) {
	ApplicationContext context =	SpringApplication.run(Proj2SpringBootDataJpaPagingSortingApplication.class, args);
	
	BookRepository bookRepo = context.getBean(BookRepository.class);

	// List<Book> book = bookRepo.getAllBooks();
	List<Book> book = bookRepo.getAllBooksNative();
	
	book.forEach(b->{
		System.out.println(b);
	});
	}
}
