package com.edubridge.compile.input;
import java.util.Scanner;

public class BooleanDataTypeDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		char c = s.next().charAt(2);
		String str = s.next();
		boolean b = false;
		System.out.println(b);
		System.out.println("The Character Value is "+c);
		System.out.println("The String Value is "+str);
		s.close();
	}
	

}
