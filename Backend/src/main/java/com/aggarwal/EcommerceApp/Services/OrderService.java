package com.aggarwal.EcommerceApp.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aggarwal.EcommerceApp.Repository.OrderRepo;
import com.aggarwal.EcommerceApp.entity.Orders;

@Service
public class OrderService {

	@Autowired
	private OrderRepo Orepo;
	
	public List<Orders> getAllOrders() {
		List<Orders> orders = new ArrayList<>();
		Orepo.findAll().forEach(orders::add);
		return orders;

	}

	public String addOrder(Orders Order) {
			Orepo.save(Order);
			return "Order Added Success";
	}

	public void updateOrder(Orders Order) {
		Orepo.save(Order);
	}

	public void deleteOrder(int OrderId) {
		Orepo.deleteById(OrderId);
	}
}
