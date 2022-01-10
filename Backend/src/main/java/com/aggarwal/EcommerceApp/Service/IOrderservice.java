package com.aggarwal.EcommerceApp.Service;

import java.util.List;

import com.aggarwal.EcommerceApp.entity.OrderDetail;



public interface IOrderservice {
	
	public List<OrderDetail> getAllOrder();
	
	public void addOrder(OrderDetail Order);
	
	public void deleteOrder(int OrderId);

	void updateOrder(int orderId, OrderDetail order);


}
