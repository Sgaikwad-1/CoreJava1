package com.edubridge.compile.input;
import java.util.Scanner;
public class IntegerDataTypeDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in); //Scanner class to accept the inputs
		byte num = s.nextByte();
		short num1 = s.nextShort();
		int num2 = s.nextInt();
		long num3 = s.nextLong();
		System.out.println("The Byte Value is "+num);
		System.out.println("The Short Value is "+num1);
		System.out.println("The Integer Value is "+num2);
		System.out.println("The Long Value is "+num3);//Printing Statement
		s.close();
	}
}
