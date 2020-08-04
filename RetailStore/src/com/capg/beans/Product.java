package com.capg.beans;

public class Product {
	
	private int prodId;
	private String prodName;
	private ProductType prodType;
	private int quantity;
	private double amount;
	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public ProductType getProdType() {
		return prodType;
	}
	public void setProdType(ProductType prodType) {
		this.prodType = prodType;
	}
	public Product(int prodId, String prodName, ProductType prodType, int quantity, double amount) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
		this.prodType = prodType;
		this.quantity = quantity;
		this.amount = amount;
	}
	
	
	public Product() {
		super();
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	

}
