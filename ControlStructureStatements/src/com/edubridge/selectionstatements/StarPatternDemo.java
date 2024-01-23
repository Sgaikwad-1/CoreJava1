package com.edubridge.selectionstatements;

import java.util.Scanner;

public class StarPatternDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1; i<=5; i++)
		{
			for(int j=1;j<=i; j++)
			{
				System.out.print("*");
				
			}
			System.out.println();
		}
		

	}

}
