package com.aggarwal.EcommerceApp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.sun.istack.NotNull;

@Entity
@Table(name = "users")
public class Users {

	public Users(int userId, String firstName, String lastName, String password, String salt, String email,
			String address, String contact, boolean isAuthorized, int role) {
		UserId = userId;
		FirstName = firstName;
		LastName = lastName;
		Password = password;
		Salt = salt;
		Email = email;
		Address = address;
		Contact = contact;
		this.isAuthorized = isAuthorized;
		this.role = role;
	}

	public Users() {
	}

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int UserId;
	@Column(name = "first_name", nullable = true)
	private String FirstName;
	@Column(name = "last_name", nullable = true)
	private String LastName;
	@Column(name = "password", nullable = true)
	private String Password;
	@Column(name = "salt", nullable = true)
	private String Salt;
	@Column(name = "email", nullable = true, unique = true)
	private String Email;
	@Column(name = "address", nullable = true)
	private String Address;
	@Column(name = "contact", nullable = true, unique = true)
	private String Contact;
	@Column(name = "isAuthorized", columnDefinition = "tinyint(1) default 1")
	private boolean isAuthorized;
	@Column(name = "role", nullable = true)
	private int role;

	public int getUserId() {
		return UserId;
	}

	public void setUserId(int userId) {
		UserId = userId;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getSalt() {
		return Salt;
	}

	public void setSalt(String salt) {
		Salt = salt;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getContact() {
		return Contact;
	}

	public void setContact(String contact) {
		Contact = contact;
	}

	public boolean isAuthorized() {
		return isAuthorized;
	}

	public void setAuthorized(boolean isAuthorized) {
		this.isAuthorized = isAuthorized;
	}

	public int getRole() {
		return role;
	}

	public void setRole(int role) {
		this.role = role;
	}

}
