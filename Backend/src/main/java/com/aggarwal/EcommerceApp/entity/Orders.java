package com.aggarwal.EcommerceApp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Orders")
public class Orders {

	public Orders() {

	}

	public Orders(int orderId, int userId, int productId, int quantity, String courierName, String courierNumber,
			int status) {
		OrderId = orderId;
		UserId = userId;
		ProductId = productId;
		Quantity = quantity;
		CourierName = courierName;
		CourierNumber = courierNumber;
		Status = status;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	@Column(name = "Order_Id", nullable = true)
	private int OrderId;
	@Column(name = "User_Id", nullable = true)
	private int UserId;
	@Column(name = "Product_Id", nullable = true)
	private int ProductId;
	@Column(name = "Quantity", nullable = true)
	private int Quantity;
	@Column(name = "Courier_Partner", nullable = true)
	private String CourierName;
	@Column(name = "Courier_Number", nullable = true)
	private String CourierNumber;
	@Column(name = "Status", nullable = true)
	private int Status;

}
