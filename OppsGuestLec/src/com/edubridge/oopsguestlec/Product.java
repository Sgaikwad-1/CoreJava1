package com.edubridge.oopsguestlec;

public class Product {

	String pname;
	int prise;
	void disp(String p,int p1) {
		pname=p;
		prise=p1;
		System.out.println("Product Name:"+pname+""
				+ "\nProduct Prise:"+prise);
	}
	public static void main(String[] args) {
		Product p=new Product();
		p.disp("Speaker", 2000);
		p.disp("Hp Laptop", 50000);
		p.disp("shoose", 400);
	}
}