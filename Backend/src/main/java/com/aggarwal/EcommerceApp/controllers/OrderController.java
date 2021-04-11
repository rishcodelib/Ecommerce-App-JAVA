package com.aggarwal.EcommerceApp.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aggarwal.EcommerceApp.Services.OrderService;
import com.aggarwal.EcommerceApp.entity.Orders;

@RestController
public class OrderController {
	
	@Autowired
	private OrderService OServe;
	
	@RequestMapping("/orders")
	public List<Orders> GetAllOrders() {
		return OServe.getAllOrders();
	}
	
	@PostMapping("/orders")
	public void AddProduct(Orders Order) {
		OServe.addOrder(Order);
		
	}

}
