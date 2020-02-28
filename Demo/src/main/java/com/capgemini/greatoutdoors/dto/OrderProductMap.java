package com.capgemini.greatoutdoors.dto;

public class OrderProductMap {
	
	private String orderId;
	private String productId;
	private String productUin;
	private int productStatus;
	private int giftStatus;
	
	
	public OrderProductMap(String orderId, String productId, String productUin, int productStatus, int giftStatus) {
		super();
		this.orderId = orderId;
		this.productId = productId;
		this.productUin = productUin;
		this.productStatus = productStatus;
		this.giftStatus = giftStatus;
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
	public String getProductUin() {
		return productUin;
	}
	public void setProductUin(String productUin) {
		this.productUin = productUin;
	}
	public int getProductStatus() {
		return productStatus;
	}
	public void setProductStatus(int productStatus) {
		this.productStatus = productStatus;
	}
	public int getGiftStatus() {
		return giftStatus;
	}
	public void setGiftStatus(int giftStatus) {
		this.giftStatus = giftStatus;
	}
	
	
	
	

}
