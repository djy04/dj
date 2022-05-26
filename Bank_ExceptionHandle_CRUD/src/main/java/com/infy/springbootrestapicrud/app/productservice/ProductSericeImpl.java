package com.infy.springbootrestapicrud.app.productservice;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.springbootrestapicrud.app.exception.AccountNotFoundException;
import com.infy.springbootrestapicrud.app.model.Account;
import com.infy.springbootrestapicrud.app.model.AccountHolder;
import com.infy.springbootrestapicrud.app.productrepository.ProductRepository;




@Service
public class ProductSericeImpl implements ProductService{

	@Autowired
	ProductRepository pr;
	
	@Override
	public AccountHolder savedata(AccountHolder p) {
		// TODO Auto-generated method stub
		return pr.save(p);
	}

	@Override
	public List<AccountHolder> getdata() 
	{
		List all = pr.findAll();
//Optional<AccountHolder> opt=all.stream().collect(Collectors.maxBy(Comparator.comparingDouble(AccountHolder::getAccountNumber)));
		
		return all;
	}

	@Override
	public AccountHolder updatedata(AccountHolder p, int id)  {
		Optional<AccountHolder> opl = pr.findById(id);
		if(opl.isPresent())
		{   
			p.setAccountNumber(id);
		AccountHolder product2 = pr.save(p);
			
			return product2;
		}
		
		else 
		{
		  throw new AccountNotFoundException("");
       
	     }
		
//		AccountHolder product = opl.get();
//		product.setAccountHolderName(p.getAccountHolderName());
//		product.setAccountHoldermob(p.getAccountHoldermob());
//		product.setAddress(p.getAddress());
//		
//	
//		Account a=new Account();
//		a.setAccountNumber(id);
//		a.setAccountType(p.getAccount().getAccountType());
//		a.setAccountBalance(p.getAccount().getAccountBalance()); 
//		product.setAccount(a);

	
		
	}

	@Override
	public void deletedeta(int accountNumber) {
		pr.deleteById(accountNumber);
		
	}

	@Override
	public Optional<AccountHolder> getsingledata(int accno) {
		Optional<AccountHolder> ah = pr.findById(accno);
		
		
		
		return ah;
	}

}
