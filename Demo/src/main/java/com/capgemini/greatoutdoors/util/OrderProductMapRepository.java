package com.capgemini.greatoutdoors.util;

import java.util.*;

import com.capgemini.greatoutdoors.dto.OrderProductMap;

//2 more data added

public class OrderProductMapRepository {
	
	public static Map<String,OrderProductMap> OrderProductMaps=new HashMap<String, OrderProductMap>();
	
	
	OrderProductMapRepository()
	{
		OrderProductMap OrderProductMapObj1= new OrderProductMap("A101","Pro510","23AAAES101",1,0);
		OrderProductMap OrderProductMapObj2= new OrderProductMap("D102","Pro156","23AAAES101",1,1);
		OrderProductMap OrderProductMapObj3= new OrderProductMap("AF103","Pro217","23AAAES101",0,0);
		OrderProductMap OrderProductMapObj4= new OrderProductMap("AG104","Pro181","23AAAES101",0,1);
		OrderProductMap OrderProductMapObj5= new OrderProductMap("U105","Pro320","23AAAES101",1,0);
		
		OrderProductMap OrderProductMapObj6= new OrderProductMap("AG104","Pro181","23AAAES101",0,1);
		OrderProductMap OrderProductMapObj7= new OrderProductMap("U105","Pro320","23AAAES101",1,0);
		

		OrderProductMaps.put("A101",OrderProductMapObj1);
		OrderProductMaps.put("D102",OrderProductMapObj2);
		OrderProductMaps.put("AF103",OrderProductMapObj3);
		OrderProductMaps.put("AG104",OrderProductMapObj4);
		OrderProductMaps.put("U105",OrderProductMapObj5);
		
		OrderProductMaps.put("AG104",OrderProductMapObj6);
		OrderProductMaps.put("U105",OrderProductMapObj7);
	}

}
