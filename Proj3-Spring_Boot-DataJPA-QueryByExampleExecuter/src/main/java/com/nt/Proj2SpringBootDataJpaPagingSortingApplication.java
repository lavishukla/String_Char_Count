package com.nt;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.domain.Example;

import com.nt.entity.Book;
import com.nt.repository.BookRepository;

@SpringBootApplication
public class Proj2SpringBootDataJpaPagingSortingApplication {

	public static void main(String[] args) {
	ApplicationContext context =	SpringApplication.run(Proj2SpringBootDataJpaPagingSortingApplication.class, args);
	
	BookRepository bookRepo = context.getBean(BookRepository.class);
	
	Book book = new Book();
	book.setBookname("Spring");

	Example<Book> of = Example.of(book);
	List<Book> findAll = bookRepo.findAll(of);
	findAll.forEach(b ->{
		System.out.println(b);
	});
	}
}
