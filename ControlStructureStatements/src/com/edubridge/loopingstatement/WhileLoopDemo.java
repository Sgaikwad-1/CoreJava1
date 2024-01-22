package com.edubridge.loopingstatement;
import java.util.Scanner;
public class WhileLoopDemo {

	public static void main(String[] args) {
		int i=1;
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		while(i<=n)
		{
			System.out.println(i+" ");
			i++;
		}
		

	}

}
