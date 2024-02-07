package com.edubridge.interfacedemo;
//interface
public interface Cafe {
	
	/*all the fields inside an interface are 
	 * by default public static final*/
	String menu="Pav Bhaji";
	int price=90;
	
	
	/*all the method inside an interface are 
	 * by default public abstract */
	void showMenu();
	void displayPrice();

}
