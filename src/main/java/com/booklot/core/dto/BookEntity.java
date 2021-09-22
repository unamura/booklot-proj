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

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.Data;

@Entity
@Data
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class BookEntity {
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
	//@JsonBackReference
	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "booksAuthored", cascade = CascadeType.ALL)
	private Set<AuthorEntity> authorOfBook = new HashSet<AuthorEntity>();

}
