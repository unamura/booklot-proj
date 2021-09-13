package com.booklot.core.dto;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="document")
@Data
public class Document {

	@Id
	private Long id;
	
}