package com.aggarwal.EcommerceApp.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aggarwal.EcommerceApp.Service.IOrderService;
import com.aggarwal.EcommerceApp.Service.OrderService;
import com.aggarwal.EcommerceApp.entity.Order;

@RestController
public class OrderController {
	
	@Autowired
	private IOrderService OServe;
	
//	@RequestMapping("/order")
//	public List<Order> GetAllOrders() {
//		return OServe.getAllOrder();
//	}
	
//	@PostMapping("/order")
//	public void AddProduct(Orders Order) {
//		OServe.addOrder(Order);
//		
//	}

}
