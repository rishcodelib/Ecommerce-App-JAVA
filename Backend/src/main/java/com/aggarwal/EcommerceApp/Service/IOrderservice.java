package com.aggarwal.EcommerceApp.Service;

import java.util.List;

import com.aggarwal.EcommerceApp.entity.Order;



public interface IOrderservice {
	
	public List<Order> getAllOrder();
	
	public void addOrder(Order Order);
	
	public void deleteOrder(int OrderId);

	Order updateOrder(int orderId, Order order);


}
