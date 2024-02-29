package com.edubridge.uncheckedexception;

import java.util.Scanner;

public class CatchBlockDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int x=15;
		
		System.out.println("Enter the value of y: ");
		int y=s.nextInt();
		int arr[]= {12,5,23};

		try {
			
			System.out.println(x/y);	
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
			try 
			{
				System.out.println(arr[3]);
			}
			catch(ArithmeticException |ArrayIndexOutOfBoundsException e1) {
				System.out.println(e);
				System.out.println(e1);
			}
		}
		
		
	}

}
