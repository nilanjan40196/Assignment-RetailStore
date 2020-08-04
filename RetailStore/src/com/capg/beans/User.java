package com.capg.beans;

import java.util.List;

public class User {
	
	private int userId;
	private String userName;
	private UserType userType;
	private String register_date;
	private List<Product> products;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public UserType getUserType() {
		return userType;
	}
	public void setUserType(UserType userType) {
		this.userType = userType;
	}
	public String getRegister_date() {
		return register_date;
	}
	public void setRegister_date(String register_date) {
		this.register_date = register_date;
	}
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	public User(int userId, String userName, UserType userType, String register_date, List<Product> products) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userType = userType;
		this.register_date = register_date;
		this.products = products;
	}
	public User() {
		super();
	}
	
	

}
