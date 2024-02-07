package com.edubridge.polymorphism;
//driver class
public class MethodOverridingExecutor {

	public static void main(String[] args) {
		
		Gmeet g=new Gmeet();
		g.accept("Gmeet", "k@gmail.com");
		System.out.println(g instanceof Google);
	}
}
