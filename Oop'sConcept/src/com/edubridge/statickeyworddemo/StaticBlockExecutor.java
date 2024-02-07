package com.edubridge.statickeyworddemo;

public class StaticBlockExecutor {
	int x;
	static String str;
	
	//static block used to initialized only static variable
	static
	{
		str="Static Block";
	}
	static void print()
	{
		System.out.println(str);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticBlockExecutor.print();

	}

}
