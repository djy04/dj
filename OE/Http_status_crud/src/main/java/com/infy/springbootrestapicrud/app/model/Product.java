package com.infy.springbootrestapicrud.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Product {

	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY )
	private Long productId;
	private String productName;
	private Double price;
	private String supplierName;
	
}
