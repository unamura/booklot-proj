package com.booklot.core.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.booklot.core.dto.BookEntity;

public interface BookRepository extends JpaRepository<BookEntity, Long>{

	BookEntity findById(long id);
}
