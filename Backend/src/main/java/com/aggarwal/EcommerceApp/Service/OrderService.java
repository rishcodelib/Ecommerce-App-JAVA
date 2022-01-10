package com.aggarwal.EcommerceApp.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aggarwal.EcommerceApp.Repository.OrderRepo;
import com.aggarwal.EcommerceApp.entity.OrderDetail;

@Service
public class OrderService implements IOrderservice {

	@Autowired
	private OrderRepo Orepo;

	public List<OrderDetail> getAllOrderDetails() {
		List<OrderDetail> orders = new ArrayList<>();
		Orepo.findAll().forEach(orders::add);
		return orders;

	}

	public void addOrder(OrderDetail Order) {
		Orepo.save(Order);
	}

	public void updateOrder(OrderDetail Order) {
		Orepo.save(Order);
	}

	public void deleteOrder(int OrderId) {
		Orepo.deleteById(OrderId);
	}

	@Override
	public List<OrderDetail> getAllOrder() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateOrder(int orderId, OrderDetail order) {
		// TODO Auto-generated method stub
		
	}



	

}
