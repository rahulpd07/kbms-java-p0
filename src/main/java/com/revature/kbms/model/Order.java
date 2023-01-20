package com.revature.kbms.model;

public class Order {

	public Order() {
		// TODO Auto-generated constructor stub
	}

	private int orderId;
    private java.lang.String productName;
    private int quantity;
    private double totalPrice;
    private java.lang.String status;
    
	public Order(int orderId, String productName, int quantity, double totalPrice, String status) {
		super();
		this.orderId = orderId;
		this.productName = productName;
		this.quantity = quantity;
		this.totalPrice = totalPrice;
		this.status = status;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public java.lang.String getProductName() {
		return productName;
	}
	public void setProductName(java.lang.String productName) {
		this.productName = productName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public java.lang.String getStatus() {
		return status;
	}
	public void setStatus(java.lang.String status) {
		this.status = status;
	}
	 
    
}
