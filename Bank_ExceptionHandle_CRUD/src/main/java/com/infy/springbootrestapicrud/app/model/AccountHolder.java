package com.infy.springbootrestapicrud.app.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;


@Entity
@Data
//@AllArgsConstructor
public class AccountHolder {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int accountNumber;
	private String accountHolderName;
	private long accountHoldermob;
	private String address;
	
	@OneToOne(cascade = CascadeType.ALL)
	private  Account account;
}
