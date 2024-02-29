package com.edubridge.assignment;

import java.util.Scanner;

public class MathOperation {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter value of a and b:");
		int a=s.nextInt();
		int b=s.nextInt();
		int map_no=s.nextInt();
		switch(map_no){
		case 1:
			System.out.println("Addition of a and b:"+(a+b));
		break;
		case 2:
			System.out.println("Substraction of a and b:"+(a-b));
		break;
		case 3:
			System.out.println("Multiplication of a and b:"+(a*b));
		break;
		case 4:
			System.out.println("Divison of a and b:"+(a/b));
		break;
		default:
			System.out.println("Invalid map no.");
		}		
	}		
}
