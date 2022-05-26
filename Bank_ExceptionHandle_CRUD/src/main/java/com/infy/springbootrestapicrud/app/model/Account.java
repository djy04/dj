package com.infy.springbootrestapicrud.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity
@Data
public class Account {

	@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int accountNumber;
	private String accountType;
	private double accountBalance;
//	 
//	@OneToOne(cascade = CascadeType.ALL ,mappedBy = "account")
//	 AccountHolder accountholder;
}
