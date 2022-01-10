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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import org.hibernate.annotations.CreationTimestamp;

@Entity
public class Product {

	@CreationTimestamp
	private Timestamp timestamp;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int productId;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "userId")
	private User userId;

	@Column(name = "prodName", nullable = true)
	private String name;

	@Column(name = "prodDesc", nullable = true)
	private String description;

	@OneToMany(mappedBy = "productId" ,cascade = CascadeType.ALL)
	private List<ProductImage> productImages;

	@Column(name = "price", nullable = true)
	private long price;

	@Column(name = "inStock", nullable = true)
	private Boolean inStock;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(Timestamp timestamp, int productid, User user, String name, String description,
			List<ProductImage> productImage, long price, Boolean inStock) {
		super();
		this.timestamp = timestamp;
		this.productId = productid;
		this.userId = user;
		this.name = name;
		this.description = description;
		this.productImages = productImage;
		this.price = price;
		this.inStock = inStock;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public User getUserId() {
		return userId;
	}

	public void setUserId(User userId) {
		this.userId = userId;
	}

	public List<ProductImage> getProductImages() {
		return productImages;
	}

	public void setProductImages(List<ProductImage> productImages) {
		this.productImages = productImages;
	}

	public int getProductid() {
		return productId;
	}

	public void setProductid(int productid) {
		this.productId = productid;
	}

	public Timestamp getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}

	public User getUser() {
		return userId;
	}

	public void setUser(User user) {
		this.userId = user;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public Boolean getInStock() {
		return inStock;
	}

	public void setInStock(Boolean inStock) {
		this.inStock = inStock;
	}

}
