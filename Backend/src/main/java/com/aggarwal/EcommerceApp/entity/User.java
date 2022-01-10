package com.aggarwal.EcommerceApp.entity;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.CreationTimestamp;

@Entity
public class User {

	@CreationTimestamp
	private Timestamp timestamp;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int UserId;

	@Column(name = "firstname", nullable = true)
	private String firstName;

	@Column(name = "lastname", nullable = true)
	private String lastName;

	@Column(name = "email", nullable = true, unique = true)
	private String email;

	@Column(name = "address", nullable = true)
	private String address;

	@Column(name = "contact", length = 12, nullable = true, unique = true)
	private Long contact;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "productId")
	private List<Product> product;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "orderId")
	private List<OrderDetail> order;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "userId")
	private List<CustomerDetail> custDetail;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name ="serial_id")
	private UserCredentials ucred;

	public Timestamp getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}

	public int getUserId() {
		return UserId;
	}

	public void setUserId(int userId) {
		UserId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Long getContact() {
		return contact;
	}

	public void setContact(Long contact) {
		this.contact = contact;
	}

	public List<Product> getProduct() {
		return product;
	}

	public void setProduct(List<Product> product) {
		this.product = product;
	}

	public List<OrderDetail> getOrder() {
		return order;
	}

	public void setOrder(List<OrderDetail> order) {
		this.order = order;
	}

	public List<CustomerDetail> getCustDetail() {
		return custDetail;
	}

	public void setCustDetail(List<CustomerDetail> custDetail) {
		this.custDetail = custDetail;
	}

	public UserCredentials getUcred() {
		return ucred;
	}

	public void setUcred(UserCredentials ucred) {
		this.ucred = ucred;
	}

	public User(Timestamp timestamp, int userId, String firstName, String lastName, String email, String address,
			Long contact, List<Product> product, List<OrderDetail> order, List<CustomerDetail> custDetail,
			UserCredentials ucred) {
		super();
		this.timestamp = timestamp;
		UserId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.address = address;
		this.contact = contact;
		this.product = product;
		this.order = order;
		this.custDetail = custDetail;
		this.ucred = ucred;
	}

}
