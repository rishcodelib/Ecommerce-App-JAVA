package com.aggarwal.EcommerceApp.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.aggarwal.EcommerceApp.Repository.ProductRepo;
import com.aggarwal.EcommerceApp.entity.Products;

import org.springframework.stereotype.Service;

@Service
public class ProductService implements IProductService{

	@Autowired
	private ProductRepo Prepo;
	
	
	public List<Products> getAllProducts(){
		List<Products> prod = new ArrayList<>();
		Prepo.findAll().forEach(prod::add);
		return prod;
	}
	
	public void AddProduct (Products Prod) {
		Prepo.save(Prod);
	}
	public void updateProduct(Products prod) {
		Prepo.save(prod);
	}
	
	public void deleteProduct(int id) {
		Prepo.deleteById(id);;
	}

	@Override
	public void addProduct(Products prod) {
		// TODO Auto-generated method stub
		
	}

	
}
