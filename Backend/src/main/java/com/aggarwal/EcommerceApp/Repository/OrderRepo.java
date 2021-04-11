package com.aggarwal.EcommerceApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aggarwal.EcommerceApp.entity.Orders;

public interface OrderRepo extends JpaRepository<Orders, Integer>{

}
