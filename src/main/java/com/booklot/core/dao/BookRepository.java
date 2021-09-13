package com.booklot.core.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.booklot.core.dto.Book;

public interface BookRepository extends JpaRepository<Book, Long>{

	Book findById(long id);
}
