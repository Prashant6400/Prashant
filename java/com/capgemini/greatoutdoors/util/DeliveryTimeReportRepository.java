package com.capgemini.greatoutdoors.util;

import java.awt.*;
import java.util.*;

import com.capgemini.greatoutdoors.dto.DeliveryTimeReportDTO;
//import com.capgemini.greatoutdoors.dto.OrderProductMap;
//import com.capgemini.greatoutdoors.dto.WeeklyReport;

public class DeliveryTimeReportRepository {
	
	
	static ArrayList<Date> itemDispatchTimeObj=new ArrayList<Date>();
	
	static ArrayList<Date> itemRecieveTimeObj=new ArrayList<Date>();
	
	static ArrayList<Date> productCatDispatchTimeObj=new ArrayList<Date>();
	
	static ArrayList<Date> productCatRecieveTimeObj=new ArrayList<Date>();
	
	static
	{
		
		
		itemDispatchTimeObj.add(new Date(2020,01,4));
		itemDispatchTimeObj.add(new Date(2020,01,7));
		itemDispatchTimeObj.add(new Date(2020,01,16));
		itemDispatchTimeObj.add(new Date(2020,02,21));
		itemDispatchTimeObj.add(new Date(2020,03,11));
		
		itemRecieveTimeObj.add(new Date(2020,01,7));
		itemRecieveTimeObj.add(new Date(2020,01,9));
		itemRecieveTimeObj.add(new Date(2020,01,22));
		itemRecieveTimeObj.add(new Date(2020,02,29));
		itemRecieveTimeObj.add(new Date(2020,03,13));
		
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
	
	public ArrayList<Date> getItemDispatchTimeObj() {
		return itemDispatchTimeObj;
	}

	public ArrayList<Date> getItemRecieveTimeObj() {
		return itemRecieveTimeObj;
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
			array.add(new DeliveryTimeReportDTO(itemDispatchTimeObj.get(i),itemRecieveTimeObj.get(i),productCatDispatchTimeObj.get(i),productCatRecieveTimeObj.get(i)));
	  return array;
	}
	
}
