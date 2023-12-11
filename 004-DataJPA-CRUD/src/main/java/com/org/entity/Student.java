package com.org.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Student {

	@Id
	private int sid;
	private String sName;
	private String gender;
	private double result;
}
