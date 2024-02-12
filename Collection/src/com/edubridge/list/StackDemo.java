package com.edubridge.list;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<Object>q1=new Stack<>();
		q1.add("Snehal");
		q1.add(9);
		q1.add('c');
		System.out.println(q1.lastElement());
		q1.push(63.5);
		System.out.println(q1);
		q1.pop();

	}

}
