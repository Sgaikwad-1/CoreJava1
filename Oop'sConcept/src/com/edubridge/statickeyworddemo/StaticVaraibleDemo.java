package com.edubridge.statickeyworddemo;
//program to demonstrate static keyword with variable
public class StaticVaraibleDemo {
	//static keyword with variable name
	/*1.when any var name is no static and
	 * we are trying to access that variable 
	 * inside the main method, then we will get error, 
	 * so that we have to use static keyword  with var name*/
	static float percentage=89.78f;
	
	public static void main(String[] args) {
		
		System.out.println(percentage);

	}

}
