package com.edubridge.operators;
import java.util.Scanner;
public class LogicalOperatorDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value for a and b:");
		int a=s.nextInt();
		int b=s.nextInt();
		System.out.println(a==b && b>a);
		System.out.println(a==3 || b>a);
		System.out.println(!(a<=b));
		
	}
}

