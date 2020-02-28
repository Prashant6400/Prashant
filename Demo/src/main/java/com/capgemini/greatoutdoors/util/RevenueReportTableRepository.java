package com.capgemini.greatoutdoors.util;

import java.util.*;

import com.capgemini.greatoutdoors.dto.RevenueReportTable;

//2 more data added
public class RevenueReportTableRepository {
	
	public static Map<String,RevenueReportTable> revenueReportMap=new HashMap<String, RevenueReportTable>();
	
	RevenueReportTableRepository ()
	{
	
		Date d1=new Date(2020/2/12);
		Date d2=new Date(2020/2/13);
		Date d3=new Date(2020/2/14);
		Date d4=new Date(2020/2/15);
		Date d5=new Date(2020/2/16);
		
		Date d6=new Date(2020/1/15);
		Date d7=new Date(2020/1/16);
		
		RevenueReportTable revenueReportTableObj1= new RevenueReportTable("user100",d1,"A101","Pro510",3,15.2);
		RevenueReportTable revenueReportTableObj2= new RevenueReportTable("user101",d2,"D102","Pro156",2,10.1);
		RevenueReportTable revenueReportTableObj3= new RevenueReportTable("user102",d3,"AF103","Pro217",3,1.7);
		RevenueReportTable revenueReportTableObj4= new RevenueReportTable("user103",d4,"AG104","Pro181",1,4.98);
		RevenueReportTable revenueReportTableObj5= new RevenueReportTable("user104",d5,"U105","Pro320",3,23.31);
		
		RevenueReportTable revenueReportTableObj6= new RevenueReportTable("user103",d6,"AG104","Pro181",1,4.98);
		RevenueReportTable revenueReportTableObj7= new RevenueReportTable("user104",d7,"U105","Pro320",3,23.31);
		
		
		
		revenueReportMap.put("user100",revenueReportTableObj1);
		revenueReportMap.put("user101",revenueReportTableObj2);
		revenueReportMap.put("user102",revenueReportTableObj3);
		revenueReportMap.put("user103",revenueReportTableObj4);
		revenueReportMap.put("user104",revenueReportTableObj5);
		
		revenueReportMap.put("user103",revenueReportTableObj6);
		revenueReportMap.put("user104",revenueReportTableObj7);
		
		
	}
	
	
}
