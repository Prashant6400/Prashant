package com.capgemini.greatoutdoors.util;

import java.awt.*;
import java.util.*;

import com.capgemini.greatoutdoors.dto.DeliveryTimeReportDTO;
import com.capgemini.greatoutdoors.dto.OrderProductMap;
import com.capgemini.greatoutdoors.dto.WeeklyReport;

public class DeliveryTimeReportRepository {
	
	
	static ArrayList<Date> iteamDispatchTimeObj=new ArrayList<Date>();
	
	static ArrayList<Date> iteamRecieveTimeObj=new ArrayList<Date>();
	
	static ArrayList<Date> productCatDispatchTimeObj=new ArrayList<Date>();
	
	static ArrayList<Date> productCatRecieveTimeObj=new ArrayList<Date>();
	
	static
	{
		
		
		iteamDispatchTimeObj.add(new Date(2020,01,4));
		iteamDispatchTimeObj.add(new Date(2020,01,7));
		iteamDispatchTimeObj.add(new Date(2020,01,16));
		iteamDispatchTimeObj.add(new Date(2020,02,21));
		iteamDispatchTimeObj.add(new Date(2020,03,11));
		
		iteamRecieveTimeObj.add(new Date(2020,01,7));
		iteamRecieveTimeObj.add(new Date(2020,01,9));
		iteamRecieveTimeObj.add(new Date(2020,01,22));
		iteamRecieveTimeObj.add(new Date(2020,02,29));
		iteamRecieveTimeObj.add(new Date(2020,03,13));
		
		productCatDispatchTimeObj.add(new Date(2020,01,9));
		productCatDispatchTimeObj.add(new Date(2020,01,15));
		productCatDispatchTimeObj.add(new Date(2020,01,19));
		productCatDispatchTimeObj.add(new Date(2020,02,3));
		productCatDispatchTimeObj.add(new Date(2020,02,16));
		
		productCatRecieveTimeObj.add(new Date(2020,01,11));
		productCatRecieveTimeObj.add(new Date(2020,01,19));
		productCatRecieveTimeObj.add(new Date(2020,01,23));
		productCatRecieveTimeObj.add(new Date(2020,02,8));
		productCatRecieveTimeObj.add(new Date(2020,02,20));
	}
		
	//static Map<Date,WeeklyReport> obj=new HashMap<Date,WeeklyReport>();
	
	public ArrayList<Date> getIteamDispatchTimeObj() {
		return iteamDispatchTimeObj;
	}

	public ArrayList<Date> getIteamRecieveTimeObj() {
		return iteamRecieveTimeObj;
	}

	public ArrayList<Date> getProductCatDispatchTimeObj() {
		return productCatDispatchTimeObj;
	}
	
	public ArrayList<Date> getProductCatRecieveTimeObj() {
		return productCatRecieveTimeObj;
	}
	public ArrayList<DeliveryTimeReportDTO> getTotalArray()
	{
		ArrayList<DeliveryTimeReportDTO>array=new ArrayList<DeliveryTimeReportDTO>();
		for(int i=0;i<5;i++)
			array.add(new DeliveryTimeReportDTO(iteamDispatchTimeObj.get(i),iteamRecieveTimeObj.get(i),productCatDispatchTimeObj.get(i),productCatRecieveTimeObj.get(i)));
	  return array;
	}
	
}
