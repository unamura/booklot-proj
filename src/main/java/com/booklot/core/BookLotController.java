package com.booklot.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.booklot.core.dao.BookRepository;
import com.booklot.core.dao.OriginalBookAuthor;
import com.booklot.core.dto.AuthorEntity;
import com.booklot.core.dto.BookEntity;

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
	public AuthorEntity findAuthorById(@PathVariable long id) {
		System.out.println("findAuthorById(" + id + ");");
		
		AuthorEntity au = bookAuthor.findById(id);
		return au;
	}
	
	@RequestMapping("lotr/book/{id}")
	public BookEntity findBookById(@PathVariable long id) {
		System.out.println("findBookById(" + id + ");");
		
		BookEntity bk = bookRepo.findById(id);
		return bk;
	}

}
