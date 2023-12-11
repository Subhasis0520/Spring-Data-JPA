package com.org.entity;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Course {

	@Id
	@GenericGenerator(name="generate_id" ,strategy = "com.org.generator.GenerateId")
	@GeneratedValue(generator = "generate_id" )
	private String cid;
	
	private String cname;
	private double cprice;
	private String duration;
	
	@CreationTimestamp
	@Column(name = "creation_time", updatable = false)
	private LocalDate createDate;
	
	@UpdateTimestamp
	@Column(name = "last_update", insertable =false )
	private LocalDate lastUpdate;
}
