package com.infy.springbootrestapicrud.app.productservice;

import java.util.List;
import java.util.Optional;

import com.infy.springbootrestapicrud.app.model.AccountHolder;



public interface ProductService {

	AccountHolder savedata(AccountHolder p);

	 List<AccountHolder> getdata();

	 AccountHolder updatedata(AccountHolder p, int id) ;

	void deletedeta(int accountNumber);

	
	
	Optional<AccountHolder> getsingledata(int accno);


	

}
