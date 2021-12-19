package com.aggarwal.EcommerceApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aggarwal.EcommerceApp.entity.Order;

@Repository
public interface OrderRepo extends JpaRepository<Order, Integer>{

}
