package com.nt.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.nt.binding.Book;

@Controller
public class BookController {

	@GetMapping("/book")
	public String getBookInfo(Model model) {
		Book bookInfo = new Book();
		bookInfo.setBookId(1);
		bookInfo.setBookName("Harry Potter");
		bookInfo.setBookPrice(1500.0);
		model.addAttribute("book", bookInfo);
		return "bookView";
	}
	
	@GetMapping("/books")
	public String getBooksData(Model model) {
		Book b1 = new Book(1, "HTML", 155.0);
		Book b2 = new Book(2, "Spring Boot", 122.3);
		Book b3 = new Book(3, "Spring", 150.6);
		Book b4 = new Book(4, "JAVA", 200.0);
	
		List<Book> booksList = Arrays.asList(b1,b2,b3,b4);
		model.addAttribute("books", booksList);
		return "booksView";
	}
}
