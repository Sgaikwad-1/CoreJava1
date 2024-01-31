package com.edubridge.operators;
import java.util.Scanner; 

public class ArithmeticOperatorDemo {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value for a and b:");
		int a=s.nextInt();
		int b=s.nextInt();
		System.out.println("Addition of two number is:"+(a+b));
		System.out.println("Substraction of two number is:"+(a-b));
		System.out.println("Multiplication of two number is:"+(a*b));
		System.out.println("Devision of two number is:"+(a/b));
		System.out.println("Modulo of two number is:"+(a%b));
		s.close();
		
	}
}