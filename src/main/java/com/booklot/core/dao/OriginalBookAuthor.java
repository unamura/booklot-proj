package com.booklot.core.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.booklot.core.dto.AuthorEntity;

@Repository
public interface OriginalBookAuthor extends JpaRepository<AuthorEntity, Long> {

	AuthorEntity findById(long id);
}
