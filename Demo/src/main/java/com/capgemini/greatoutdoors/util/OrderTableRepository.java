package com.capgemini.greatoutdoors.util;

import com.capgemini.greatoutdoors.dto.OrderTable;

import java.util.*;
//2 more data added

public class OrderTableRepository {
	
	Date d1=new Date(2020/2/12);
	Date d2=new Date(2020/2/13);
	Date d3=new Date(2020/2/14);
	Date d4=new Date(2020/2/15);
	Date d5=new Date(2020/2/16);
	Date d6=new Date(2020/1/15);
	Date d7=new Date(2020/1/16);
	
	public static Map<String,OrderTable> orderTableMap=new HashMap<String,OrderTable>();
	
	OrderTableRepository()
	{
	//	orderTableMap.put("100",new OrderTable("100",(byte)1,"user100","address1",new Date()));
	//	orderTableMap.put("100",new OrderTable("100",(byte)1,"user100","address1",new Date()));
		
		OrderTable orderTableObj1 = new OrderTable ("A101",(byte)1,"user100","6,Rohini, New Delhi,100011",d1);
		OrderTable orderTableObj2 = new OrderTable ("D102",(byte)0,"user101","72,Mau Aima,Uttar pradesh, 200807",d2);
		OrderTable orderTableObj3 = new OrderTable ("AF103",(byte)1,"user102","18,Jalandhar,Punjab,144411",d3);
		OrderTable orderTableObj4 = new OrderTable ("AG104",(byte)0,"user103","21, Amritsar,Punjab,123339",d4);
		OrderTable orderTableObj5 = new OrderTable ("U105",(byte)0,"user104","39,Kolkata,West Bengal,311190",d5);
		
		
		OrderTable orderTableObj6 = new OrderTable ("AG104",(byte)0,"user103","21, Amritsar,Punjab,123339",d6);
		OrderTable orderTableObj7 = new OrderTable ("U105",(byte)0,"user104","39,Kolkata,West Bengal,311190",d7);
		
		orderTableMap.put("A101",orderTableObj1);
		orderTableMap.put("D102",orderTableObj2);
		orderTableMap.put("AF103",orderTableObj3);
		orderTableMap.put("AG104",orderTableObj4);
		orderTableMap.put("U105",orderTableObj5);
		orderTableMap.put("AG104",orderTableObj6);
		orderTableMap.put("U105",orderTableObj7);

}

}
