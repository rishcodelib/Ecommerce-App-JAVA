package com.aggarwal.EcommerceApp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aggarwal.EcommerceApp.Services.ProductService;
import com.aggarwal.EcommerceApp.entity.Products;

@RestController
public class ProductController {

	@Autowired
	private ProductService ProdServe;

	@GetMapping("/products")
	public List<Products> GetAllProducts() {
		return ProdServe.getAllProducts();
	}
	
	@PostMapping("/products")
	public void AddProduct(Products prod) {
		ProdServe.AddProduct(prod);
		
	}
	@PostMapping("/products")
	public void UpdateProduct(Products prod) {
		ProdServe.UpdateProduct(prod);;
		
	}
	@PostMapping("/products")
	public void DeleteProduct(int id) {
		ProdServe.deleteProduct(id);;
		
	}
	
}
