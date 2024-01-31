package com.edubridge.assignment;
import java.util.Scanner;

public class Search {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int flag=0;
		System.out.println("Array Elements:");
		int arr[]=new int[n];
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=s.nextInt();
		}
		System.out.println("Element to find");
		int a=s.nextInt();
		for(int i=0;i<n;i++)
		{
			if(arr[i]==a)
			flag=1;
		}
		if(flag==1)
			System.out.println("the number"+a+"found");
		else
			System.out.println("Not found");
	
	}

}
