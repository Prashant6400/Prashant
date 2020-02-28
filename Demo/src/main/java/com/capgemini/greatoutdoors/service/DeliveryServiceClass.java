package com.capgemini.greatoutdoors.service;

import com.capgemini.greatoutdoors.dao.DeliveryTimeReportDao;

public  class DeliveryServiceClass {
	public static void findIteam(int choice) 
	{
	DeliveryTimeReportDao.finddifferencesIteam(choice);
	}
	
	public static void findPro(int choice)
	{
		DeliveryTimeReportDao.finddifferencesPro(choice);
	}

	
}
