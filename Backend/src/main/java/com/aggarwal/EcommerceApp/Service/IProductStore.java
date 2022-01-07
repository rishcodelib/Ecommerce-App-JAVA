package com.aggarwal.EcommerceApp.Service;

import java.util.List;

import com.aggarwal.EcommerceApp.entity.ProductStore;

public interface IProductStore{

	public ProductStore getProductWithSizes(int id);
	
	public void addProductToStore (ProductStore store);
	
	

}
