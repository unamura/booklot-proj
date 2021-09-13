package com.booklot.core.dto;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="author")
@Data
public class Author {
	@Id
	private Long id;
	private String first_name;
	private String lastName;
	private Date birthDate;
	private Date deathDate;
	private Integer book;
}