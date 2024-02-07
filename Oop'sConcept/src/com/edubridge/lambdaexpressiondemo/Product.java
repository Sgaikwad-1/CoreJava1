package com.edubridge.lambdaexpressiondemo;
@FunctionalInterface
public interface Product {
	
	//abstract method
	void displayProductPrice(int price);
	
	//default method
	default String displayProductName()
	{
		return "Perfume";
	}
	
	//static method
	static String ProductBrand()
	{
		return "zara";
	}
}
