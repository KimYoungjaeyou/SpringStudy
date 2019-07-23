package com.skcc;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class BookService {
	
	@Autowired //@Qualifier("mybookRepository")
	BookRepository bookRepository;
	
//	@Autowired
//	List<BookRepository> bookRepository;
	
	public void printBookRepository() {
		System.out.println(bookRepository.getClass());
//		this.bookRepository.forEach(System.out::println);
	}
	
	//만약 이걸로한다면 러너가 없어도 되겠지@@@@@@@@
	@PostConstruct
	public void setUp() {
		System.out.println("만들어지고난후~~~~~~~~~~~~");
	}
	
	
}
