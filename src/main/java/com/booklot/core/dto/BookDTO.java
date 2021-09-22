package com.booklot.core.dto;

import java.util.ArrayList;
import java.util.List;

import com.booklot.core.entities.Author;
import com.booklot.core.entities.Book;

public class BookDTO {
	
	private String title;
	private List<AuthorDTO> authors = new ArrayList<AuthorDTO>();
	
	public BookDTO() {
	}
	
	public BookDTO(Book book) {
		this.title = book.getTitle();
		//System.out.println("size: " + book.getAuthorOfBook().size());
		
		for(Author au : book.getAuthorOfBook()) {
			AuthorDTO authorDTO = new AuthorDTO();
			authorDTO.setName(au.getFirst_name());
			authors.add(authorDTO);
		}
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}

}
