package com.edubridge.thiskeyworddemo;
/*this keyword used to pass inside the method call */
public class ThisKeywordDemo2 {
	
	             /*class_name object*/
	void printOne(ThisKeywordDemo2 d)
	{
		System.out.println("welcome to "+"edubridge");
	}
	
	void printTwo()
	{
		printOne(this);
	}
	public static void main(String[] args) {
		ThisKeywordDemo2 d=new ThisKeywordDemo2();
		d.printTwo();
	}

}
