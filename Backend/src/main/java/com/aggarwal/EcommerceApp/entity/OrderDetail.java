package com.aggarwal.EcommerceApp.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class OrderDetail {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int orderId;

	@OneToOne
	@JoinColumn(name = "productId")
	private Product productId;

	@Column(name = "orderQuantity", nullable = true)
	private int orderQuantity;

	@Column(name = "orderAmount", nullable = true)
	private int orderAmount;

	@Column(name = "courierName", nullable = true)
	private String courierName;

	@Column(name = "courierNumber", nullable = true)
	private String courierNumber;

	@Column(name = "orderStatus", nullable = true)
	private int orderStatus;

	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "userId")
	private User userId;

	public OrderDetail() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OrderDetail(int orderId, Product productId, int orderQuantity, int orderAmount, String courierName,
			String courierNumber, int orderStatus, User userId) {
		super();
		this.orderId = orderId;
		this.productId = productId;
		this.orderQuantity = orderQuantity;
		this.orderAmount = orderAmount;
		this.courierName = courierName;
		this.courierNumber = courierNumber;
		this.orderStatus = orderStatus;
		this.userId = userId;
	}

	public int getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(int orderAmount) {
		this.orderAmount = orderAmount;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public Product getProductId() {
		return productId;
	}

	public void setProductId(Product productId) {
		this.productId = productId;
	}

	public int getOrderQuantity() {
		return orderQuantity;
	}

	public void setOrderQuantity(int orderQuantity) {
		this.orderQuantity = orderQuantity;
	}

	public String getCourierName() {
		return courierName;
	}

	public void setCourierName(String courierName) {
		this.courierName = courierName;
	}

	public String getCourierNumber() {
		return courierNumber;
	}

	public void setCourierNumber(String courierNumber) {
		this.courierNumber = courierNumber;
	}

	public int getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(int orderStatus) {
		this.orderStatus = orderStatus;
	}

	public User getUserId() {
		return userId;
	}

	public void setUserId(User userId) {
		this.userId = userId;
	}

}
