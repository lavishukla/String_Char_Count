package com.nt;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.entity.Book;
import com.nt.repository.BookRepository;

@SpringBootApplication
public class Proj4SpringBootDataJpaFindByXxx {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Proj4SpringBootDataJpaFindByXxx.class, args);
		BookRepository bookRepo = context.getBean(BookRepository.class);

		List<Book> book = bookRepo.findBybookprice(1000);
		book.forEach(b ->{
			System.out.println(b);
		});
	}

}
