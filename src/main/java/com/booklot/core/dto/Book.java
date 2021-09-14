package com.booklot.core.dto;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.Data;

@Entity
@Data
public class Book {
	@Id
	@Column(name = "id")
	private Long id;
	@Column(name = "title")
	private String title;
	@Column(name = "subtitle")
	private String subtitle;
	@Column(name = "publishing_year")
	private Date publishingYear;
	@Column(name = "publishong_editor")
	private String publishingEditor;
	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "booksAuthored", cascade = CascadeType.ALL)
	private Set<Author> authorOfBook = new HashSet<Author>();

}
