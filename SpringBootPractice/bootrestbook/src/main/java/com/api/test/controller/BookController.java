package com.api.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.test.entities.Book;
import com.api.test.service.BookService;

@RestController
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	@GetMapping("/books")
	public List<Book> getBooks() {
		
//		Book book=new Book();
//		book.setId(1234);
//		book.setTitle("Java Complete Reference");
//		book.setAuthor("xyz");
//		
		return this.bookService.getAllBooks();
		
	}

	
	@GetMapping("/books/{id}")
	public Book getBook(@PathVariable("id")int id) {
		return bookService.getBookById(id);
	}
	
	
	
	
	//add new book
	@PostMapping("/books")
	public Book addBook(@RequestBody Book book) {
		Book b=this.bookService.addBook(book);
		System.out.println(b);
		return b;
	}
	
	
	
	//delete book
	@DeleteMapping("/books/{bookId}")
	public void deleteBook(@PathVariable("bookId")int bookId) {
		this.bookService.deleteBook(bookId);
		
	}
	
	//update book handler
	@PutMapping("/books/{bookId}")
	public Book updateBook(@RequestBody Book book,@PathVariable("bookId")int bookId) {
		this.bookService.updateBook(book,bookId);
		return book;
		
	}
	
	
}
