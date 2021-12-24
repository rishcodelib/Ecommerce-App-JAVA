package com.aggarwal.EcommerceApp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Product")
public class Product {

	public Product() {
	}

	public Product(int userId, int productid, String name, String description, String image, String imagePath,
			int price, Boolean inStock) {
		this.userId = userId;
		this.productid = productid;
		this.name = name;
		Description = description;
		this.image = image;
		ImagePath = imagePath;
		this.price = price;
		this.inStock = inStock;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "Prod_Id", nullable = true)
	private int productid;
	
	@Column(name = "User_id", nullable = true)
	private int userId;
	
	@Column(name = "Prod_name", nullable = true)
	private String name;
	
	@Column(name = "Prod_Desc", nullable = true)
	private String Description;
	
	@Column(name = "Prod_image", nullable = true)
	private String image;
	
	@Column(name = "Prod_ImgPath", nullable = true)
	private String ImagePath;
	
	@Column(name = "Price", nullable = true)
	private long price;
	
	@Column(name = "InStock", nullable = true)
	private Boolean inStock;

}
