package com.edubridge.loopingstatement;
import java.util.Scanner;
public class CountDigitDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int count=0;
		while(N!=0)
		{
			count++;
			N=N/10;
			
		}
		System.out.println(count);
		
	}
}