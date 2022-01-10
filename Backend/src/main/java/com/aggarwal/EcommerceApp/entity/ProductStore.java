package com.aggarwal.EcommerceApp.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "productStore")

public class ProductStore {

	@CreationTimestamp
	private Timestamp timestamp;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Serial", nullable = true)
	private int Serial;

	@Column(name = "Product_id", nullable = true)
	private int productid;
	
	@Column(name = "Size", nullable = true)
	private String Size;
	
	@Column(name = "Quantity", nullable = true)
	private int Quantity;

	public int getSerial() {
		return Serial;
	}

	public void setSerial(int serial) {
		Serial = serial;
	}

	public int getProductid() {
		return productid;
	}

	public void setProductid(int productid) {
		this.productid = productid;
	}

	public String getSize() {
		return Size;
	}

	public void setSize(String size) {
		Size = size;
	}

	public int getQuantity() {
		return Quantity;
	}

	public void setQuantity(int quantity) {
		Quantity = quantity;
	}

	

}
