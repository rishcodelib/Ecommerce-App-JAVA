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

	public void addOrder(Order Order) {
		Orepo.save(Order);
	}

	public void updateOrder(Order Order) {
		Orepo.save(Order);
	}

	public void deleteOrder(int OrderId) {
		Orepo.deleteById(OrderId);
	}

	@Override
	public Order updateOrder(int orderId, Order order) {
		if (Orepo.existsById(orderId)) {
			Orepo.save(order);
		}
		return null;
		// TODO Auto-generated method stub

	}

}
