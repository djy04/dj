package com.infy.springbootrestapicrud.app.service;

import java.util.List;

import com.infy.springbootrestapicrud.app.model.Product;

public interface ProductService {

	Product savedata(Product p);

	List<Product> getdata();

	Product updatedata(Product p, Long id);

	void delete(Long id);

	List<String> getbyquery(Long id);

}
