package com.org.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Account_Details")
public class Account {

	@EmbeddedId
	@Column(name = "id_account_Number")
	private CompositeId id;
	
	private String aHolderName;
	private String branch;
}
