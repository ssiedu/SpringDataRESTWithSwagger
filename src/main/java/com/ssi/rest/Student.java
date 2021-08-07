package com.ssi.rest;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data

public class Student {
	@Id
	private Integer rollNumber;
	private String name;
	private String branch;
	private Integer sem;
}
