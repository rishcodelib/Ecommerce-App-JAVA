package com.aggarwal.EcommerceApp.Service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.oauth2.resource.OAuth2ResourceServerProperties.Jwt;

import com.aggarwal.EcommerceApp.Repository.ProductImageRepository;
import com.aggarwal.EcommerceApp.Repository.ProductRepo;
import com.aggarwal.EcommerceApp.entity.Product;

import javassist.scopedpool.ScopedClassPoolRepositoryImpl;

import org.springframework.stereotype.Service;

@Service
public class Productservice implements IProductservice {

	@Autowired
	private ProductRepo Prepo;

	public List<Product> getAllProduct() {
		List<Product> prod = new ArrayList<>();
		Prepo.findAll().forEach(prod::add);
		return prod;
		
	}

	public void addProduct(Product Prod) {
		Prod.setProductId(Prod.getProductid());
		Prepo.save(Prod);

	}

	public void updateProduct(Product prod) {
		Prepo.save(prod);
	}

	public void deleteProduct(int id) {
		Prepo.deleteById(id);

	}

	@Override
	public Product getProduct(int productId) {
		if (Prepo.existsById(productId)) {
			return Prepo.findById(productId).get();
		}
		return null;

		// TODO Auto-generated method stub

	}

}
