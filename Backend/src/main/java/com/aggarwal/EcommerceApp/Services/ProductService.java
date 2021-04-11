package com.aggarwal.EcommerceApp.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.aggarwal.EcommerceApp.Repository.ProductRepo;
import com.aggarwal.EcommerceApp.entity.Products;

import org.springframework.stereotype.Service;

@Service
public class ProductService {

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
	public void UpdateProduct(Products prod) {
		Prepo.save(prod);
	}
	
	public void deleteProduct(int id) {
		Prepo.deleteById(id);;
	}
}
