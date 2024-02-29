package com.edubridge.assignment;

import java.util.Scanner;

public class UserInputString {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter String");
		char c=s.next().charAt(0);
		if(c=='a'||c=='e'||c=='i'||c=='u'||c=='o')
		{
			System.out.println("Given String is Vowel");
		}else
		{
			System.out.println("Given String is not vowel");
		}
	}

}
