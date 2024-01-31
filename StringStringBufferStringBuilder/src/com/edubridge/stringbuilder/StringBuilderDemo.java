package com.edubridge.stringbuilder;

public class StringBuilderDemo {

	public static void main(String[] args) {
		StringBuilder b=new StringBuilder("Shiwani is the java"+"full stack trainer");
		System.out.println(b);
		System.out.println(b.capacity());
		System.out.println(b.append(" of edubridge"));

	}

}
