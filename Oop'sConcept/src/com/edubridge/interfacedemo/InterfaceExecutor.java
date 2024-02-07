package com.edubridge.interfacedemo;

public class InterfaceExecutor {

	public static void main(String[] args) {
		/*we cannot create object for interface */
		//Cafe c=new Cafe();
		TheVibe t=new TheVibe();
		t.showMenu();
		t.displayPrice();
	}
}
