package com.infy.springbootrestapicrud.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.infy.springbootrestapicrud.app.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

	//Query("SELECT u FROM User u WHERE u.status = 1")
	@Query(value="SELECT  productName FROM Product WHERE productId=:pid")
	List<String> findbyProductName(Long pid);
	
}
