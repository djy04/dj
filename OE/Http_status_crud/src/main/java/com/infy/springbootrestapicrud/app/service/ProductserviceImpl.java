package com.infy.springbootrestapicrud.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.infy.springbootrestapicrud.app.exception.ProductNotFoundException;
import com.infy.springbootrestapicrud.app.model.Product;
import com.infy.springbootrestapicrud.app.repository.ProductRepository;

@Service
public class ProductserviceImpl implements ProductService{

	@Autowired
	ProductRepository pr;
	
	@Override
	public Product savedata(Product p) {
		// TODO Auto-generated method stub
		return pr.save(p);
	}

	@Override
	public List<Product> getdata() {
		// TODO Auto-generated method stub
		return pr.findAll();
	}

	@Override
	public Product updatedata(Product p, Long id) {
		Optional<Product> op = pr.findById(id);
		if(op.isPresent())
		{
			Product product = op.get();
			product.setProductName(p.getProductName());
			product.setPrice(p.getPrice());
			product.setSupplierName(p.getSupplierName());
			
			return pr.save(product);
		}
		else
		{
			throw new ProductNotFoundException("product not found");
		}
	
	}

	@Override
	public void delete(Long id) {
		pr.deleteById(id);
		
	}

	@Override
	public List<String> getbyquery(Long id) {
		List<String> findbyProductName = pr.findbyProductName(id);
		return findbyProductName;
	}
	
	

}
