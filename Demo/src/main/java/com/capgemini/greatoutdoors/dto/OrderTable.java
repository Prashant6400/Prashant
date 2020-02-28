package com.capgemini.greatoutdoors.dto;
import java.util.*;
public class OrderTable {
	
	private String orderId;
	private byte orderDispatchStatus;
	private String userId;
	private String addressId;
	private Date orderInitiateTime;
	
	
	
	public OrderTable(String orderId, byte orderDispatchStatus, String userId, String addressId, Date orderInitiateTime)
	{
		super();
		this.orderId = orderId;
		this.orderDispatchStatus = orderDispatchStatus;
		this.userId = userId;
		this.addressId = addressId;
		this.orderInitiateTime = orderInitiateTime;
	}
	
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public byte getOrderDispatchStatus() {
		return orderDispatchStatus;
	}
	public void setOrderDispatchStatus(byte orderDispatchStatus) {
		this.orderDispatchStatus = orderDispatchStatus;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getAddressId() {
		return addressId;
	}
	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}
	public Date getOrderInitiateTime() {
		return orderInitiateTime;
	}
	public void setOrderInitiateTime(Date orderInitiateTime) {
		this.orderInitiateTime = orderInitiateTime;
	}
	
	
	
	
	
	
	//private one variable is repeated in table
	
	
	
	
	
}
