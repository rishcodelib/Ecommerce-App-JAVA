package com.aggarwal.EcommerceApp.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "productStore")
public class ProductStore {

	@CreationTimestamp
	private Timestamp timestamp;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = true)
	private int storeId;


	@Column(name = "Size", nullable = true)
	private String Size;

	@Column(name = "Quantity", nullable = true)
	private int Quantity;




	public String getSize() {
		return Size;
	}

	public void setSize(String size) {
		Size = size;
	}

	public int getQuantity() {
		return Quantity;
	}

	public Timestamp getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}

	public int getStoreId() {
		return storeId;
	}

	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}

	public void setQuantity(int quantity) {
		Quantity = quantity;
	}


	public ProductStore(Timestamp timestamp, int storeId, String size, int quantity) {
		super();
		this.timestamp = timestamp;
		this.storeId = storeId;
		Size = size;
		Quantity = quantity;
	}

	public ProductStore() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
