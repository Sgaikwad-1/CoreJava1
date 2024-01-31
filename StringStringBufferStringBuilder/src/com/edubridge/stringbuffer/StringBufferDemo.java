package com.edubridge.stringbuffer;

public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer b=new StringBuffer("Shiwani");
		System.out.println(b.capacity());
		b=new StringBuffer(" ");
		System.out.println(b.capacity());
		System.out.println(b.append("India"));
		/*b.setCharAt(29,'Z');
		System.out.println(b);*/
		
		
		String str="Edubridge";
		StringBuffer b1=new StringBuffer(str.length());
		
		System.out.println(b1.capacity());
		StringBuffer buff=new StringBuffer("Internet Of Things");
		System.out.println(buff.capacity());	
	}

}
