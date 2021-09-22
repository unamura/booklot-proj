package com.booklot.core.dto;

import com.booklot.core.entities.Author;
import com.booklot.core.entities.Book;

import java.util.HashSet;
import java.util.Set;

public class AuthorDTO {

	private String name;
	private Set<BookDTO> books = new HashSet<BookDTO>();

	public AuthorDTO() {
	}

	public AuthorDTO(Author author) {
		this.setName(author.getFirst_name());
		System.out.println("author.getBooks.size() = " + author.getBooksAuthored().size());
		for (Book bk : author.getBooksAuthored()) {
			System.out.println("here");
			BookDTO bkDTO = new BookDTO();
			bkDTO.setTitle(bk.getTitle());
			//System.out.println("bk.getTitle: " + bk.getTitle());
			books.add(bkDTO);
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
