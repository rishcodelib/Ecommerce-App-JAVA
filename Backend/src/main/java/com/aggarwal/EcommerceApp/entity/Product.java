package com.aggarwal.EcommerceApp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product {

	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int productid;
	
	@Column(name = "User_id", nullable = true)
	private int userId;
	
	@Column(name = "Prod_name", nullable = true)
	private String name;
	
	@Column(name = "Prod_Desc", nullable = true)
	private String description;
	
	@Column(name = "Prod_image", nullable = true)
	private String image;
	
	@Column(name = "Prod_ImgPath", nullable = true)
	private String imagePath;
	
	@Column(name = "Price", nullable = true)
	private long price;
	
	@Column(name = "InStock", nullable = true)
	private Boolean inStock;

	public int getProductid() {
		return productid;
	}

	public void setProductid(int productid) {
		this.productid = productid;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
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

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
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
