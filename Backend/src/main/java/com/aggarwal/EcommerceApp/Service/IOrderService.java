package com.aggarwal.EcommerceApp.Service;

import java.util.List;

import com.aggarwal.EcommerceApp.entity.Orders;

public interface IOrderService {
	
	public List<Orders> getAllOrders();
	
	public String addOrder(Orders Order);
	
	public void updateOrder(Orders Order);
	
	public void deleteOrder(int OrderId);

}
