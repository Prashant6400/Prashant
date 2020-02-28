package com.capgemini.greatoutdoors.dto;

import java.util.*;

public class DeliveryTimeReportDTO {
	
	private Date itemDispatchTime;
	private Date itemRecieveTime;
	
	private Date productCatDispatchTime;
	private Date productCatRecieveTime;
	
	public DeliveryTimeReportDTO(Date iteamDispatchTime, Date iteamRecieveTime, Date productCatDispatchTime,
			Date productCatRecieveTime) {
		super();
		this.itemDispatchTime = iteamDispatchTime;
		this.itemRecieveTime = iteamRecieveTime;
		this.productCatDispatchTime = productCatDispatchTime;
		this.productCatRecieveTime = productCatRecieveTime;
	}
	
	public Date getIteamDispatchTime() {
		return itemDispatchTime;
	}
	public void setIteamDispatchTime(Date iteamDispatchTime) {
		this.itemDispatchTime = iteamDispatchTime;
	}
	public Date getIteamRecieveTime() {
		return itemRecieveTime;
	}
	public void setIteamRecieveTime(Date iteamRecieveTime) {
		this.itemRecieveTime = iteamRecieveTime;
	}
	public Date getProductCatDispatchTime() {
		return productCatDispatchTime;
	}
	public void setProductCatDispatchTime(Date productCatDispatchTime) {
		this.productCatDispatchTime = productCatDispatchTime;
	}
	public Date getProductCatRecieveTime() {
		return productCatRecieveTime;
	}
	public void setProductCatRecieveTime(Date productCatRecieveTime) {
		this.productCatRecieveTime = productCatRecieveTime;
	}
}