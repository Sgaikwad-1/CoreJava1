package com.edubridge.assignment;

public class NumberPatternIII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int num=2*n;
		for(int i=1; i<=num; i=i+2)
		{
			for(int j=i; j<=num; j=j+2) {
				System.out.print(j+"");
			}
			System.out.println("");
		}

	}

}
