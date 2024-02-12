package com.edubridge.list;
import java.util.List;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		List<Object>obj=new Vector<>();
		obj.add(11);
		obj.add("Snehal");
		obj.add(80000.9);
		obj.add('Z');
		obj.add(true);
		System.out.println(obj);

	}

}
