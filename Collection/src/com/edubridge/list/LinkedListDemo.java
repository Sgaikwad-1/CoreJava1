package com.edubridge.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		List<Integer>obj=new LinkedList<>();
		obj.add(11);
		obj.add(9);
		obj.add(8);
		System.out.println("List is"+obj);
		obj.add(0, 12);
		System.out.println("List is"+obj);
		//whether object contain these element or not(true/false)
		System.out.println(obj.contains(10));
		//to get class name
		System.out.println(obj.getClass());
		//to clear the object and return empty list
		//obj.clear();
		//System.out.println(obj);
		//for extracting list element
		for(Integer itr:obj)
		{
			System.out.print(itr+" ");
		}
		System.out.println();
		Iterator<Integer>itr=obj.listIterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}
		
	}
}
