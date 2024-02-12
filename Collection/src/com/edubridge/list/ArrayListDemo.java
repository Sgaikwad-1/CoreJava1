package com.edubridge.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
	public static void main(String[] args) {
		//we can't create the object for  collection interface
		List<String>obj=new ArrayList<>();
		obj.add("Snehal");
		obj.add("Yukta");
		obj.add("Sakshi");
		System.out.println(obj);
		List<Object>obj1=new ArrayList<>();
		obj1.add("Snehal");
		obj1.add(101);
		obj1.add(78.9);
		System.out.println(obj1);
		List<String>obj2=new ArrayList<>();
		obj2.addAll(obj);
		System.out.println(obj2);
		System.out.println(obj1.get(1));
		obj2.remove(1);
		System.out.println(obj2);
	}
}
