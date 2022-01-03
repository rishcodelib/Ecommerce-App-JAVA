package com.aggarwal.EcommerceApp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aggarwal.EcommerceApp.Service.IProductservice;
import com.aggarwal.EcommerceApp.entity.Product;

@RestController("/product")
public class ProductController {

	@Autowired
	private IProductservice ProdServe;

	@GetMapping
	public List<Product> GetAllProducts() {
		return ProdServe.getAllProduct();
	}
	
//	@PostMapping
//	public void AddProduct(Product prod) {
//		ProdServe.addProduct(prod);
//		
//	}
//	@PostMapping("/{id}")
//	public void UpdateProduct(Product prod) {
//		ProdServe.updateProduct(prod);;
//		
//	}
//	@PostMapping("/{id}")
//	public void DeleteProduct(@PathVariable("id") int Userid) {
//		ProdServe.deleteProduct(Userid);;
//		
//	}
	
}
