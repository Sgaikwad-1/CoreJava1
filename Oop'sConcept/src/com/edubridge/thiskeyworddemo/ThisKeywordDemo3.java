package com.edubridge.thiskeyworddemo;
/*this keyword used to invoke current class constructor*/
public class ThisKeywordDemo3 {
	
	public int x;
	ThisKeywordDemo3()
	{
		/*this keyword is calling parameterized constructor*/
		this(12);
		System.out.println("Non-parameterized constructor");
	}
	ThisKeywordDemo3(int x)
	{
		System.out.println("parameterized constructor");
	}

	public static void main(String[] args) {
		ThisKeywordDemo3 t=new ThisKeywordDemo3();
		

	}

}
