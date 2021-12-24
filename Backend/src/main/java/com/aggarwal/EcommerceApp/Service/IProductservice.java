package com.aggarwal.EcommerceApp.Service;

import java.util.List;

import com.aggarwal.EcommerceApp.entity.Product;

public interface IProductservice {

	public List<Product> getAllProduct();
	
	public void addProduct(Product prod);
	
	public void updateProduct(Product prod);
	
	public void deleteProduct(int id);
}
