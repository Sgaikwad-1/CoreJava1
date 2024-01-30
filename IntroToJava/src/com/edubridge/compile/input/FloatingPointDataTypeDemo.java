package com.edubridge.compile.input;
import java.util.Scanner;

public class FloatingPointDataTypeDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		float f = s.nextFloat();
		double d = s.nextDouble();
		System.out.println("The Float value is " +f);
		System.out.println("The Double value is " +d);
		s.close();
	}

}
