package com.aggarwal.EcommerceApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aggarwal.EcommerceApp.entity.Products;

public interface ProductRepo extends JpaRepository<Products, Integer>  {

}
