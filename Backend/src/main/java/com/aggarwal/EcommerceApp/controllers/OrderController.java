package com.aggarwal.EcommerceApp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aggarwal.EcommerceApp.Service.IOrderservice;
import com.aggarwal.EcommerceApp.entity.OrderDetail;

@RestController
public class OrderController {

	@Autowired
	private IOrderservice OServe;

	@RequestMapping("/order")
	public List<OrderDetail> getAllOrders() {
		return OServe.getAllOrder();
	}

	@PostMapping("/order")
	public void addProduct(OrderDetail Order) {
		OServe.addOrder(Order);

	}

	@PutMapping
	public OrderDetail updateProduct(@PathVariable("id") int OrderId, OrderDetail order) {
		OServe.updateOrder(OrderId, order);
		return order;

	}
}
