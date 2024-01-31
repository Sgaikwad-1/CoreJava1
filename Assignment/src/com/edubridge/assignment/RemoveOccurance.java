package com.edubridge.assignment;
import java.util.Scanner;
public class RemoveOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String a=s.nextLine();
		a=a.replaceAll("The","");
		a=a.substring(0,a.length());
		System.out.println(a);

	}

}
