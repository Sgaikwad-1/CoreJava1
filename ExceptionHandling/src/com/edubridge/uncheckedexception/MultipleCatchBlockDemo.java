package com.edubridge.uncheckedexception;

import java.util.Scanner;

public class MultipleCatchBlockDemo {
	public static void displayArray(int arr[])
	{
		try {
			System.out.println(arr[3]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int x=15;
		
		System.out.println("Enter the value of y: ");
		int y=s.nextInt();
		try {
			
			System.out.println(x/y);	
		}
		catch(ArithmeticException a)
		{
			System.out.println(a);
		}
		int arr[]= {12,5,23};
		MultipleCatchBlockDemo.displayArray(arr);
		
		

	}

}
