package com.aggarwal.EcommerceApp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.aggarwal.EcommerceApp.Service.IProductservice;
import com.aggarwal.EcommerceApp.entity.Product;

@RestController
public class ProductController {

	@Autowired
	private IProductservice myprod;

	@GetMapping("/product")
	public List<Product> GetAllProducts() {
		return myprod.getAllProduct();
	}

	@GetMapping("/product/{id}")
	public Product getProduct(@PathVariable("id") int ProductId) {
		return myprod.getProduct(ProductId);
	}

	@PostMapping("/product")
	public void addProduct(@RequestBody Product prod) {
		try {
			myprod.addProduct(prod);
		} catch (DataIntegrityViolationException e) {
			e.printStackTrace();
		} catch (NullPointerException e) {
			e.printStackTrace();
		}

	}

	@PutMapping("/product/{id}")
	public void UpdateProduct(@RequestBody Product prod) {
		myprod.updateProduct(prod);

	}

	@DeleteMapping("/product/{id}")
	public void DeleteProduct(@PathVariable("id") int Userid) {
		myprod.deleteProduct(Userid);

	}

}
