package com.booklot.core.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.booklot.core.dto.Author;

@Repository
public interface OriginalBookAuthor extends JpaRepository<Author, Long> {

	Author findById(long id);
}
