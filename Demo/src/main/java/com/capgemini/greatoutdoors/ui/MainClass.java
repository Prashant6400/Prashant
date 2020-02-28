package com.capgemini.greatoutdoors.ui;

import com.capgemini.greatoutdoors.dao.*;
import com.capgemini.greatoutdoors.service.DeliveryServiceClass;
import com.capgemini.greatoutdoors.service.RevenueGrowthServiceClass;

import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int index=0,getMonth = 0,choice=0,quaterChoice=0,choiceReport=0,deliveryReport=0;
		
		double sum=0,sum1=0,percentageChange=0,monthRevenue=0;
		
		String colour;
		
		Scanner obj=new Scanner(System.in);
		
		System.out.println("Enter 1 for growth report \n enter 2 for revenue report \n enter 3 for delivery time report \n");
		choiceReport=obj.nextInt();
		
		switch(choiceReport)
		{
		case 1:
		
			System.out.println("Enter month number in integer to calculate it's revenue");
			
			try
			{
			getMonth=obj.nextInt();
			if(1>getMonth&&getMonth>12)
				throw new Exception();
			}
			catch(Exception e)
			{
				System.out.println("Input month number from 1 to 12 only ");
			}
			
			//sum=MonthlyGrowthReportDAO.revenue(getMonth);
			
			sum=RevenueGrowthServiceClass.revenueFun(getMonth);
			System.out.println(sum+"\n");
			
			if((getMonth-1)==0)
				getMonth=12;
			
			//sum1=MonthlyGrowthReportDAO.revenue(getMonth);
			
			sum1=RevenueGrowthServiceClass.revenueFun(getMonth);

			//sum1=MonthlyGrowthReportDAO.amountOfChange(getMonth-1, sum1);
			
			sum1=RevenueGrowthServiceClass.amountChange(getMonth,sum1);
			
			//percentageChange=MonthlyGrowthReportDAO.percentageGrowth(sum,sum1);
			
			percentageChange=RevenueGrowthServiceClass.perGrowth(sum,sum1);
			
			System.out.println(percentageChange);
			
			// colour=MonthlyGrowthReportDAO.colourCode(percentageChange);
			
			
			 colour=RevenueGrowthServiceClass.colCode(percentageChange);
			System.out.println(colour);
			
			break;
			
		case 2:
			System.out.println("Revenue report ");
			
			System.out.println("enter your choice\n enter 1 for monthly report \n eneter 2 for quaterly report \n enter 3 for yearly report\n");
			choice=obj.nextInt();
			switch(choice)
			{
			case 1:
				
				System.out.println("enter month no. in int to check monthly report");
				getMonth=obj.nextInt();
				
				sum=RevenueGrowthServiceClass.revenueFun(getMonth);
				System.out.println(sum+"\n");
				break;
				
			case 2:
				sum1=sum=0;getMonth=1;
				System.out.println("Enter your choice\n 1 for first quaterly report \n 2 for 2nd quaterly report \n 3 for 3rd quaterly report\n 4 for 4rd quaterly report");
				
				quaterChoice=obj.nextInt();
				switch(quaterChoice)
				{
				
				case 1:
					index=0;
				System.out.println("first quaterly revenue report \n");
				while(index<3)
				{
					sum=RevenueGrowthServiceClass.revenueFun(getMonth);
				sum1+=sum;
				
				getMonth++;
				index++;
				}
				System.out.println(sum1+"\n");
				break;
				
				case 2:
					index=3;
					System.out.println("second quaterly revenue report \n");
					while(index<6)
					{
						sum=RevenueGrowthServiceClass.revenueFun(getMonth);
					sum1+=sum;
					
					getMonth++;
					index++;
					}
					System.out.println(sum1+"\n");
					break;
					
				case 3:
					index=6;
					System.out.println("third quaterly revenue report \n");
					while(index<9)
					{
						sum=RevenueGrowthServiceClass.revenueFun(getMonth);
					sum1+=sum;
					
					getMonth++;
					index++;
					}
					System.out.println(sum1+"\n");
					break;
					
				case 4:
					index=9;
					System.out.println("fourth quaterly revenue report \n");
					while(index<12)
					{
						sum=RevenueGrowthServiceClass.revenueFun(getMonth);
					sum1+=sum;
					
					getMonth++;
					index++;
					}
					System.out.println(sum1+"\n");
					break;
			}
			break;
			case 3:
				sum1=sum=0;getMonth=1;index=0;
				System.out.println("yearly revenue report \n");
				while(index<12)
				{
					sum=RevenueGrowthServiceClass.revenueFun(getMonth);
				sum1+=sum;
				
				getMonth++;
				index++;
				}
				System.out.println(sum1+"\n");
				break;
			}
		case 3:
			System.out.println("Checking delivery report\n enter 1 for iteam delivery report \n enter 2 fro product category delivery report\n");
			deliveryReport=obj.nextInt();
			switch(deliveryReport)
			{
			case 1:
				System.out.println("enter between 1 to 5 to check different iteam delivery report");
				choice=obj.nextInt();
				choice--;
				//DeliveryTimeReportDao.finddifferencesIteam(choice);
				DeliveryServiceClass.findIteam(choice);
				break;
			
			case 2:
				System.out.println("enter between 1 to 5 to check different product category delivery report");
				choice=obj.nextInt();
				choice--;
				//DeliveryTimeReportDao.finddifferencesPro(choice);
				DeliveryServiceClass.findPro(choice);
				
				break;
			
			}
		//	DeliveryTimeReportDao.finddifferences();
			break;
		}
		
	}
		
}