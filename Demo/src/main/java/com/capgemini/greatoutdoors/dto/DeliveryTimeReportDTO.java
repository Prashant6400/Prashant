package com.capgemini.greatoutdoors.dto;

import java.util.*;

public class DeliveryTimeReportDTO {
	
	private Date iteamDispatchTime;
	private Date iteamRecieveTime;
	
	private Date productCatDispatchTime;
	private Date productCatRecieveTime;
	
	public DeliveryTimeReportDTO(Date iteamDispatchTime, Date iteamRecieveTime, Date productCatDispatchTime,
			Date productCatRecieveTime) {
		super();
		this.iteamDispatchTime = iteamDispatchTime;
		this.iteamRecieveTime = iteamRecieveTime;
		this.productCatDispatchTime = productCatDispatchTime;
		this.productCatRecieveTime = productCatRecieveTime;
	}
	
	public Date getIteamDispatchTime() {
		return iteamDispatchTime;
	}
	public void setIteamDispatchTime(Date iteamDispatchTime) {
		this.iteamDispatchTime = iteamDispatchTime;
	}
	public Date getIteamRecieveTime() {
		return iteamRecieveTime;
	}
	public void setIteamRecieveTime(Date iteamRecieveTime) {
		this.iteamRecieveTime = iteamRecieveTime;
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