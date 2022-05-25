package com.infy.springbootrestapicrud.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infy.springbootrestapicrud.app.model.Product;
import com.infy.springbootrestapicrud.app.service.ProductService;

@RestController
@RequestMapping("/api")
public class ProductController {
	
	@Autowired
	ProductService ps;
	
	 @PostMapping("/product")
	   public ResponseEntity<Product> savedata(@RequestBody Product p)
	   {
		  Product pr=ps.savedata(p);
		  return new ResponseEntity<Product>(pr,HttpStatus.CREATED);
	   }
	 @GetMapping("/product")
	 public ResponseEntity<List<Product>> getdata()
	 {
		 List<Product> pr=ps.getdata();
		 return new ResponseEntity<List<Product>>(pr,HttpStatus.OK);
	 }
	 
	 @PutMapping("/product/{productId}")
	 public ResponseEntity<Product> updatedata(@RequestBody Product p,@PathVariable("productId")Long id)
	 {
		 Product pr= ps.updatedata(p,id);
		 return new ResponseEntity<Product>(pr,HttpStatus.OK);
	 }
	 
	 @DeleteMapping("/product/{productId}")
	 public ResponseEntity<String> delete(@PathVariable("productId")Long id)
	 {
		 ps.delete(id);
		 return new ResponseEntity<String>("Delete",HttpStatus.NO_CONTENT);
	 }
	 
	 @GetMapping("/query/{productId}")
	 public List<String> getquery(@PathVariable("productId")Long id)
	 {
		List<String> s=ps.getbyquery(id);
		 return s;
	 }

}
