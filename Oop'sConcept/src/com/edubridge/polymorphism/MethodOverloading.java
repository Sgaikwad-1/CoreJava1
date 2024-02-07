package com.edubridge.polymorphism;

class Stocks
{
	String shareName;
	long sharePrice;
	String shareType;
	
	public static void displayStockDetails(String shareName, int sharePrice)
	{
		System.out.println("Share Name: "+shareName+"Share Price: "+sharePrice);
	}
	public static void displayStockDetails(String shareName,String shareType)
	{
		System.out.println("Share Name: "+shareName+"Share Price: "+shareType);
	}
}

public class MethodOverloading {

	public static void main(String[] args) {
		Stocks.displayStockDetails("Birla", 2500);
		Stocks.displayStockDetails("Birla", "Nifty-Fifty");
		

	}

}
