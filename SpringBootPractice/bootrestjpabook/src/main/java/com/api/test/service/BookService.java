package com.api.test.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.api.test.dao.BookRepository;
import com.api.test.entities.Book;

@Component
public class BookService {
	
	@Autowired
	private BookRepository bookRepository;
	
//	private static List<Book> list=new ArrayList<>();
//	static {
//		list.add(new Book(12,"JavaComplete","XYZ"));
//		list.add(new Book(36,"JavaCompleteBook","ABC"));
//		list.add(new Book(12,"Java","Z"));
//	}
	
	//get all books
	public List<Book> getAllBooks(){
		List<Book> list=(List<Book>)this.bookRepository.findAll();
		return list;
	}
	
	



	//adding book
	public Book addBook(Book b) {
		Book result =bookRepository.save(b);
		return result;
	}


	public void deleteBook(int bid) {
	//	list=list.stream().filter(book->book.getId()!=bid).collect(Collectors.toList());
				bookRepository.deleteById(bid);
		
		
	}
	
	
	
	//update the book
	public void updateBook(Book book,int bookId) {
//		list.stream().map(b->{
//			if(b.getId()==bookId) {
//				b.setTitle(book.getTitle());
//				b.setAuthor(book.getAuthor());
//			}
//			
//			return b;
//		}).collect(Collectors.toList());
//	
		
		bookRepository.save(book);
	
}





	public Book getBookById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
