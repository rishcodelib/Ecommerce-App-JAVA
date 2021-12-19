package com.aggarwal.EcommerceApp.entity;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "Orders")
public class Order {

	
	@DateTimeFormat
	private int timeStamp;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "order_Id", nullable = true)
	private int orderId;
	
//	@Column(name = "User_Id", nullable = true)
//	private int userId;
	
	@Column(name = "Product_Id", nullable = true)
	private int productId;
	
	@Column(name = "Quantity", nullable = true)
	private int quantity;
	
	@Column(name = "Courier_Partner", nullable = true)
	private String courierName;
	
	@Column(name = "Courier_Number", nullable = true)
	private String courierNumber;
	
	@Column(name = "Status", nullable = true)
	private int status;

}
