package com.capgemini.greatoutdoors.dto;
public class ProductTable {
	
	private String productId;
	private double price;
	private String colour;
	
	private String dimension;
	private int  quantity;
	private String specification;
	private int productCategory;
	private String manufacture;
	private String productName;
	
	
	
	public ProductTable(String productId, double price, String colour, String dimension, int quantity,
			String specification, int productCategory, String manufacture, String productName) {
		super();
		this.productId = productId;
		this.price = price;
		this.colour = colour;
		this.dimension = dimension;
		this.quantity = quantity;
		this.specification = specification;
		this.productCategory = productCategory;
		this.manufacture = manufacture;
		this.productName = productName;
	}
	
	
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getDimension() {
		return dimension;
	}
	public void setDimension(String dimension) {
		this.dimension = dimension;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getSpecification() {
		return specification;
	}
	public void setSpecification(String specification) {
		this.specification = specification;
	}
	public int getProductCategory() {
		return productCategory;
	}
	public void setProductCategory(int productCategory) {
		this.productCategory = productCategory;
	}
	public String getManufacture() {
		return manufacture;
	}
	public void setManufacture(String manufacture) {
		this.manufacture = manufacture;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	
	
	
	
}
