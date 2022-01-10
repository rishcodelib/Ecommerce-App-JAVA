package com.aggarwal.EcommerceApp.Service;

import org.springframework.beans.factory.annotation.Autowired;

import com.aggarwal.EcommerceApp.Repository.ProductStoreRepo;
import com.aggarwal.EcommerceApp.entity.ProductStore;

public class ProductStoreService implements IProductStore {

	@Autowired
	private ProductStoreRepo StoreRepo;

	@Override
	public ProductStore getProductWithSizes(int id) {
		return  StoreRepo.findById(id).get();

	}

	@Override
	public void addProductToStore(ProductStore store) {
		// TODO Auto-generated method stub

	}

}
