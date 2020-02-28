package com.capgemini.greatoutdoors.dto;

import java.util.*;

public class RevenueReportTable {
	
	private String userId;
	private Date date;
	private String orderId;
	private String productId;
	private int productCategory;
	private double price;
	
	
	
	
	public RevenueReportTable(String userId, Date date, String orderId, String productId, int productCategory,
			double price) {
		super();
		this.userId = userId;
		this.date = date;
		this.orderId = orderId;
		this.productId = productId;
		this.productCategory = productCategory;
		this.price = price;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public int getProductCategory() {
		return productCategory;
	}
	public void setProductCategory(int productCategory) {
		this.productCategory = productCategory;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
	
	
}
