package com.skcc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
	 
	BookRepository bookRepository;
	
	@Autowired
	public void BookSerice(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}


	
	

}
