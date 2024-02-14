package com.edubridge.generics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GenericsAdvantageDemo {
	public static void main(String[] args) {
		List<Integer>obj=new LinkedList<>();
		//Compile time checking
		obj.add(11);
		obj.add(9);
		
		//type-casting not required
		List<String>obj1=new ArrayList<>();
		//Compile time checking
		obj1.add("Shifa");
		obj1.add("Shiwani");
		String str1=obj1.get(1);
		System.out.println(str1); 
		}
}
	
		
	
