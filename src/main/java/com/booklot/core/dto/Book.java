package com.booklot.core.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

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
	@Column(name = "author_id")
	private Integer authorId;

}
