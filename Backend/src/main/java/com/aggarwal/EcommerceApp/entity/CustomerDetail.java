package com.aggarwal.EcommerceApp.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import org.hibernate.annotations.CreationTimestamp;

@Entity
public class CustomerDetail {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int customerID;

	@CreationTimestamp
	private Timestamp timeStamp;

	private String custName;

	private String custAddress;

	private String city;

	private String State;
	
	@Column(unique = true)
	private Long custContact;

	private String custType;

	@ManyToOne
	@JoinColumn(name = "User_Id")
	private User userId;

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public Timestamp getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Timestamp timeStamp) {
		this.timeStamp = timeStamp;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCustAddress() {
		return custAddress;
	}

	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public long getCustContact() {
		return custContact;
	}

	public void setCustContact(Long custContact) {
		this.custContact = custContact;
	}

	public String getCustType() {
		return custType;
	}

	public void setCustType(String custType) {
		this.custType = custType;
	}

	public User getUserId() {
		return userId;
	}

	public void setUserId(User userId) {
		this.userId = userId;
	}

	public CustomerDetail(int customerID, Timestamp timeStamp, String custName, String custAddress, String city,
			String state, Long custContact, String custType, User userId) {
		super();
		this.customerID = customerID;
		this.timeStamp = timeStamp;
		this.custName = custName;
		this.custAddress = custAddress;
		this.city = city;
		State = state;
		this.custContact = custContact;
		this.custType = custType;
		this.userId = userId;
	}

	public CustomerDetail() {
		super();
		// TODO Auto-generated constructor stub
	}

}
