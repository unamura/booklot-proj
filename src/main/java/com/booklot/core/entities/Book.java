package com.booklot.core.entities;

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

//import lombok.Data;

@Entity
//@Data
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
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
	//@JsonBackReference
	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "booksAuthored", cascade = CascadeType.ALL)
	private Set<Author> authorOfBook = new HashSet<Author>();
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSubtitle() {
		return subtitle;
	}
	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}
	public Date getPublishingYear() {
		return publishingYear;
	}
	public void setPublishingYear(Date publishingYear) {
		this.publishingYear = publishingYear;
	}
	public String getPublishingEditor() {
		return publishingEditor;
	}
	public void setPublishingEditor(String publishingEditor) {
		this.publishingEditor = publishingEditor;
	}
	public Set<Author> getAuthorOfBook() {
		return authorOfBook;
	}
	public void setAuthorOfBook(Set<Author> authorOfBook) {
		this.authorOfBook = authorOfBook;
	}

}
