package com.capgemini.greatoutdoors.ui;

import com.capgemini.greatoutdoors.dao.*;
import com.capgemini.greatoutdoors.dto.ProductTable;
import com.capgemini.greatoutdoors.service.DeliveryServiceClass;
//import com.capgemini.greatoutdoors.service.RevenueGrowthServiceClass;
import com.capgemini.greatoutdoors.util.*;

import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		String user,pass;
		int flag=0;
		
		System.out.println("Enter Your Username:");
		user=input.nextLine();
		
		System.out.println("Enter Your Password:");
		pass=input.nextLine();
		
		if(user.equals("Prashant") && (pass.equals("123456"))) 
		{
			System.out.println("Welcome Prashant!!");
			flag++;
		}
		else 
		{
			System.out.println("Credentials are not valid");
			System.exit(0);
		}
		
	
		int choice=0,choiceReport=0,deliveryReport=0;
		
	
		Scanner obj=new Scanner(System.in);
		/*if(flag==1)
		{
			System.out.println("enter 1 for delivery time report \n enter 2 for exit");
			choiceReport=obj.nextInt();
		}*/
		int choice1=0;
		while(choice1 != 3)
		{
			System.out.println("enter 1 for delivery time report \nenter 2 for Viewing product details \nenter 2 for exit");
			choice1=obj.nextInt();
		
		switch(choice1)
		{

		case 1:
			System.out.println("Checking delivery report\n enter 1 for item delivery report \n enter 2 fo product category delivery report\n");
			deliveryReport=obj.nextInt();
			switch(deliveryReport)
			{
			case 1:
				System.out.println("enter between 1 to 5 to check different item delivery report");
				choice1=obj.nextInt();
				choice1--;
				//DeliveryTimeReportDao.finddifferencesIteam(choice);
				DeliveryServiceClass.findIteam(choice1);
				break;
			
			case 2:
				System.out.println("enter between 1 to 5 to check different product category delivery report");
				choice1=obj.nextInt();
				choice1--;
				//DeliveryTimeReportDao.finddifferencesPro(choice);
				DeliveryServiceClass.findPro(choice1);
				
				break;
			
			}
		//	DeliveryTimeReportDao.finddifferences();
			break;
		
		case 2:
			ProductTableRepository o=new ProductTableRepository(); 
			List<ProductTable> l=o.productTableMap();
			for(ProductTable h : l)
			{
				
				System.out.println(h.getProductId()+" "+h.getProductName()+" "+h.getProductCategory()+""+h.getQuantity());
			}
			break;
		case 3:
			System.out.println("You are logged out");
			break;
		}
	
	}
	}
}