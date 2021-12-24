package com.aggarwal.EcommerceApp.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aggarwal.EcommerceApp.Repository.OrderRepo;
import com.aggarwal.EcommerceApp.entity.Order;

@Service
public class OrderService implements IOrderservice {

	@Autowired
	private OrderRepo Orepo;

	public List<Order> getAllOrder() {
		List<Order> orders = new ArrayList<>();
		Orepo.findAll().forEach(orders::add);
		return orders;

	}

	public String addOrder(Order Order) {
		Orepo.save(Order);
		return "Order Added Success";
	}

	public void updateOrder(Order Order) {
		Orepo.save(Order);
	}

	public void deleteOrder(int OrderId) {
		Orepo.deleteById(OrderId);
	}

}
