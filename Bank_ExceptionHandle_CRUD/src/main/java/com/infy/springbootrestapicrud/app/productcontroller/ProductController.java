package com.infy.springbootrestapicrud.app.productcontroller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infy.springbootrestapicrud.app.model.AccountHolder;

import com.infy.springbootrestapicrud.app.productservice.ProductService;

@RestController
@RequestMapping("/api")
public class ProductController {

	@Autowired
	ProductService ps;
	
	@PostMapping("/AccountHolder")
	public AccountHolder savedata(@RequestBody AccountHolder p)
	{
	
	return ps.savedata(p);	
	}
	
	@GetMapping("/AccountHolder")
	public List<AccountHolder> getdata()
	{
		return ps.getdata();
	}
	
	@PutMapping("/AccountHolder/{accountNumber}")
	public AccountHolder updatedata(@PathVariable("accountNumber")int id,@RequestBody AccountHolder p)
	{
		
		return ps.updatedata(p,id);
	}
	
	@DeleteMapping("/AccountHolder/{accountNumber}")
	public void deletedata(@PathVariable("accountNumber")int accountNumber)
	{
		ps.deletedeta(accountNumber);
	}
	
	@GetMapping("/acc/{accountNumber}")
	public Optional<AccountHolder> getdata(@PathVariable("accountNumber")int accno)
	{
		
		return ps.getsingledata(accno);
	}
	
	
	
	
}
