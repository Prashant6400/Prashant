package com.capgemini.greatoutdoors.service;

import com.capgemini.greatoutdoors.dao.MonthlyGrowthReportDAO;

public class RevenueGrowthServiceClass {
	
	public static double revenueFun(int choice)
	{
		double d=MonthlyGrowthReportDAO.revenue(choice);;
		return d;
	}
	
	public static double amountChange(int getMonth,double d)
	{
		double d1=MonthlyGrowthReportDAO.amountOfChange(getMonth-1, d);
		return d1;
	}
	
	public static double perGrowth(double d,double d2)
	{
		double d3=MonthlyGrowthReportDAO.percentageGrowth(d,d2);
		return d3;
	}
	
	public static String colCode(double d)
	{
		String d4=MonthlyGrowthReportDAO.colourCode(d);
		return d4;
	}
}
