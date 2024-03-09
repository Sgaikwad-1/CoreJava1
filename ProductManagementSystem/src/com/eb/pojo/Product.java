package com.eb.pojo;

public class Product {
	private int productid;
	private String productname;
	private int productPrice;
	private int productquantity;
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	public int getProductquantity() {
		return productquantity;
	}
	public void setProductquantity(int productquantity) {
		this.productquantity = productquantity;
	}
	@Override
	public String toString() {
		return "Product [productname=" + productname + ", productPrice=" + productPrice + ", productquantity="
				+ productquantity + "]";
	}
	public Product( String productname, int productPrice, int productquantity) {
		super();
		this.productname = productname;
		this.productPrice = productPrice;
		this.productquantity = productquantity;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
