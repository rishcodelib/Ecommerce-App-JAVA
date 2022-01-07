package com.aggarwal.EcommerceApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aggarwal.EcommerceApp.entity.ProductStore;

@Repository
public interface ProductStoreRepo extends JpaRepository<ProductStore, Integer>{

}
