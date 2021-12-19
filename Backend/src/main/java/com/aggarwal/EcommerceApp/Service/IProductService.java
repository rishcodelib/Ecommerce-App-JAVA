package com.aggarwal.EcommerceApp.Service;

import java.util.List;

import com.aggarwal.EcommerceApp.entity.Products;

public interface IProductService {

	public List<Products> getAllProducts();
	
	public void addProduct(Products prod);
	
	public void updateProduct(Products prod);
	
	public void deleteProduct(int id);
}
