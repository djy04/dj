package com.infy.springbootrestapicrud.app.productrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infy.springbootrestapicrud.app.model.AccountHolder;


@Repository
public interface ProductRepository extends JpaRepository<AccountHolder, Integer>{

}
