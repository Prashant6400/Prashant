package com.capgemini.greatoutdoors.util;

import java.util.*;


//2 more data added

import com.capgemini.greatoutdoors.dto.ProductTable;

public class ProductTableRepository {
	
	public static Map<String,ProductTable> productTableMap=new HashMap<String,ProductTable>();
	
	ProductTableRepository()
	{
		
		
		ProductTable productTableObj1= new ProductTable("Pro510",15.2,"black","circle",2,"Limited stock",3,"Made in India","Personal Accessories"); 
		ProductTable productTableObj2= new ProductTable("Pro156",10.1,"blue","circle",15,"In stock",3,"Made in India","Outdoor Protection"); 
		ProductTable productTableObj3= new ProductTable("Pro217",1.7,"brown","rectangle",20,"Not in stock",2,"Made in India","Camping Equipment"); 
		ProductTable productTableObj4= new ProductTable("Pro181",4.98,"dark brown","rectangle",2,"Limited stock",2,"Made in India","Golf Equipment"); 
		ProductTable productTableObj5= new ProductTable("Pro320",23.31,"black","cone",8,"Limited stock",3,"Made in India","Mountaineering"); 
		
		ProductTable productTableObj6= new ProductTable("Pro181",4.98,"dark brown","rectangle",2,"Limited stock",2,"Made in India","Golf Equipment"); 
		ProductTable productTableObj7= new ProductTable("Pro320",23.31,"black","cone",8,"Limited stock",3,"Made in India","Mountaineering"); 
		
		
		productTableMap.put("Pro510",productTableObj1);
		productTableMap.put("Pro156",productTableObj2);
		productTableMap.put("Pro217",productTableObj3);
		productTableMap.put("Pro181",productTableObj4);
		productTableMap.put("Pro320",productTableObj5);
		
		productTableMap.put("Pro181",productTableObj6);
		productTableMap.put("Pro320",productTableObj7);
		
	}
	
	
}
