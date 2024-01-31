package com.edubridge.string;
import java.util.Scanner;
public class stringConcat {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str1=s.next();
		String str2=new String(s.next());
		
		System.out.println(str1.concat(str2));
		
			System.out.println(20+30+"Hello"+40+65);
			System.out.println(30+"Hello"+40+65);

	}

}