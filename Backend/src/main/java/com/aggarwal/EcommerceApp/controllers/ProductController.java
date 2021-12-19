package com.aggarwal.EcommerceApp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aggarwal.EcommerceApp.Service.IProductService;
import com.aggarwal.EcommerceApp.entity.Products;

@RestController("/product")
public class ProductController {

	@Autowired
	private IProductService ProdServe;

	@GetMapping
	public List<Products> GetAllProducts() {
		return ProdServe.getAllProducts();
	}
	
	@PostMapping
	public void AddProduct(Products prod) {
		ProdServe.addProduct(prod);
		
	}
//	@PostMapping("/{id}")
//	public void UpdateProduct(Products prod) {
//		ProdServe.updateProduct(prod);;
//		
//	}
//	@PostMapping("/{id}")
//	public void DeleteProduct(@PathVariable("id") int Userid) {
//		ProdServe.deleteProduct(Userid);;
//		
//	}
	
}
