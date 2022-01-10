package com.aggarwal.EcommerceApp.entity;

import java.sql.Timestamp;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.hibernate.annotations.CreationTimestamp;

@Entity
public class UserCredentials {

	@CreationTimestamp
	private Timestamp timestamp;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int serial;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "Userid")
	private User userId;

	private String username;

	@Column(name = "password", nullable = true)
	private String password;

	private String oAuthToken;

	private String profileCode;

	private String accountType;

	@Column(name = "isAuthorized", columnDefinition = "tinyint(1) default 1")
	private boolean isAuthorized;

	private String role;

	@Column(name = "salt", nullable = true)
	private String salt;

	public Timestamp getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public User getUserId() {
		return userId;
	}

	public void setUserId(User userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getoAuthToken() {
		return oAuthToken;
	}

	public void setoAuthToken(String oAuthToken) {
		this.oAuthToken = oAuthToken;
	}

	public String getProfileCode() {
		return profileCode;
	}

	public void setProfileCode(String profileCode) {
		this.profileCode = profileCode;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public boolean isAuthorized() {
		return isAuthorized;
	}

	public void setAuthorized(boolean isAuthorized) {
		this.isAuthorized = isAuthorized;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public UserCredentials(Timestamp timestamp, int serial, User userId, String username, String password,
			String oAuthToken, String profileCode, String accountType, boolean isAuthorized, String role, String salt) {
		super();
		this.timestamp = timestamp;
		this.serial = serial;
		this.userId = userId;
		this.username = username;
		this.password = password;
		this.oAuthToken = oAuthToken;
		this.profileCode = profileCode;
		this.accountType = accountType;
		this.isAuthorized = isAuthorized;
		this.role = role;
		this.salt = salt;
	}

}
