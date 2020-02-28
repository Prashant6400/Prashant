package com.capgemini.greatoutdoors.dao;
import com.capgemini.greatoutdoors.dto.DeliveryTimeReportDTO;
import com.capgemini.greatoutdoors.dto.WeeklyReport;
import com.capgemini.greatoutdoors.util.DeliveryTimeReportRepository;
import com.capgemini.greatoutdoors.util.GrowthReportTableRepository;

import java.text.SimpleDateFormat;
import java.time.Period;
import java.util.*;
import java.util.concurrent.TimeUnit;
public class DeliveryTimeReportDao {
	
	
	
	static DeliveryTimeReportRepository obj=new DeliveryTimeReportRepository();
	static ArrayList<DeliveryTimeReportDTO> deliveryTimeReport=obj.getTotalArray();;
	
	
	public static void finddifferencesIteam(int choice)
	{
		Date d3,d4;
		
		d3=deliveryTimeReport.get(choice).getIteamDispatchTime();
		
		d4=deliveryTimeReport.get(choice).getIteamRecieveTime();
		
		//Date d1=new Date(d3);
		//Date d2=new Date(d4);
		
		
		long diffInMillies = Math.abs(d3.getTime() - d4.getTime());
	    long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
	 
	    System.out.println("difference between two dates ");
	    System.out.println(diff);
	}
	public static void finddifferencesPro(int choice)
	{
		Date d3,d4;
		
		d3=deliveryTimeReport.get(choice).getProductCatDispatchTime();
		
		d4=deliveryTimeReport.get(choice).getProductCatRecieveTime();
		
		//Date d1=new Date(d3);
		//Date d2=new Date(d4);
		
		
		long diffInMillies = Math.abs(d3.getTime() - d4.getTime());
	    long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
	 
	    System.out.println("difference between two dates ");
	    System.out.println(diff);
	}
}