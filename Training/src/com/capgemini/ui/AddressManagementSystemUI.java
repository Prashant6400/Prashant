package com.capgemini.ui;

import java.sql.SQLException;
import java.util.Scanner;

import com.capgemini.service.AddressManagementSystemService;

public class AddressManagementSystemUI {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		int userid=0;
String housenumber="";
String streetnumber="";
String city="";
String district="";
String state="";
double pincode=0;

Scanner sc=new Scanner(System.in);
AddressManagementSystemService ps=new AddressManagementSystemService();
while(true)
{
System.out.println("1.Add Address 2.Update Address 3.Delete Address");
System.out.println("enter choice : ");
int ch=sc.nextInt();
switch(ch)
{
case 1:
	System.out.println("enter id : ");
	userid=sc.nextInt();
	System.out.println("enter house number : ");
	housenumber=sc.next();
	System.out.println("enter street number: ");
    streetnumber=sc.next();
    System.out.println("enter city: ");
    city=sc.next();
    System.out.println("enter district: ");
    district=sc.next();
    System.out.println("enter state: ");
    state=sc.next();
    System.out.println("enter pincode: ");
    pincode=sc.nextDouble();
	int n=ps.addAddress(userid,housenumber,streetnumber,city,district,state,pincode);
	System.out.println(n);
	break;
case 2: 
	
    while(true)
	{		
    	System.out.println("enter id : ");
    	userid=sc.nextInt();
    	System.out.println("1.update housenumber 2.Update streetnumber 3.update city 4.update district 5.update state 6.update pincode 7.Exit");
        System.out.println("enter option : ");
        AddressManagementSystemService au=new AddressManagementSystemService();
        int value=sc.nextInt();
	switch(value) {
	case 1:
		System.out.println("enter housenumber to be updated:");
		housenumber=sc.next();
		int p1=au.updateAddresshousenumber(userid,housenumber);
		System.out.println(p1);
		break;
	case 2:
		System.out.println("enter streetnumber to be updated:");
		streetnumber=sc.next();
		int p2=au.updateAddressstreetnumber(userid,streetnumber);
		System.out.println(p2);
		break;
	case 3:
		System.out.println("enter city to be updated:");
		city=sc.next();
		int p3=au.updateAddresscity(userid,city);
		System.out.println(p3);
		break;
	case 4:
		System.out.println("enter district to be updated:");
		district=sc.next();
		int p4=au.updateAddressdistrict(userid,district);
		System.out.println(p4);
		break;
	case 5:
		System.out.println("enter state to be updated:");
		state=sc.next();
		int p5=au.updateAddressstate(userid,state);
		System.out.println(p5);
		break;
	case 6:
		System.out.println("enter pincode to be updated:");
		pincode=sc.nextDouble();
		int p6=au.updateAddresspincode(userid,pincode);
		System.out.println(p6);
		break;
	case 7:
		System.exit(0);
		System.out.println("exit");
	default:System.out.println("invalid choice");
	}
	}
case 3:
	System.out.println("enter id : ");
	userid=sc.nextInt();
	int n2=ps.deleteAddress(userid);
	System.out.println(n2);
	break;
default:System.out.println("invalid choice");
	}
}
}}