package com.booklot.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.booklot.core.dao.BookRepository;
import com.booklot.core.dao.OriginalBookAuthor;
import com.booklot.core.dto.Author;
import com.booklot.core.dto.Book;

@RestController
public class BookLotController {
	@Autowired
	private OriginalBookAuthor bookAuthor;
	
	@Autowired
	private BookRepository bookRepo;

	@RequestMapping("/trial")
	public String trialPage() {
		return "Here we are";
	}
	
	@RequestMapping("lotr/author/{id}")
	public Author findAuthorById(@PathVariable long id) {
		System.out.println("findAuthorById(" + id + ");");
		
		Author au = bookAuthor.findById(id);
		return au;
	}
	
	@RequestMapping("lotr/book/{id}")
	public Book findBookById(@PathVariable long id) {
		System.out.println("findBookById(" + id + ");");
		
		Book bk = bookRepo.findById(id);
		return bk;
	}

}
