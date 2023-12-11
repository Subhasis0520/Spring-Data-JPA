package com.org.entity;

import java.io.Serializable;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Embeddable
@Data
public class CompositeId implements Serializable{

	private int aid;
	private long accountNumber;
}


// creating the composite key