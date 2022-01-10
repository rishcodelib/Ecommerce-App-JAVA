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
public class ProductImage {

	@CreationTimestamp
	private Timestamp timestamp;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int serial;

	@ManyToOne
	@JoinColumn(name = "productId")
	private Product productId;

	@Column(name = "prodImage", nullable = true)
	private String image;

	@Column(name = "prodImgPath", nullable = true)
	private String imagePath;

	@Column(nullable = true)
	private String imageExtn;

	public ProductImage() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Timestamp getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}

	public ProductImage(Timestamp timestamp, int serial, Product productId, String image, String imagePath,
			String imageExtn) {
		super();
		this.timestamp = timestamp;
		this.serial = serial;
		this.productId = productId;
		this.image = image;
		this.imagePath = imagePath;
		this.imageExtn = imageExtn;
	}

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public Product getProductId() {
		return productId;
	}

	public void setProductId(Product productId) {
		this.productId = productId;
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

	public String getImageExtn() {
		return imageExtn;
	}

	public void setImageExtn(String imageExtn) {
		this.imageExtn = imageExtn;
	}

}
