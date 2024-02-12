package com.edubridge.list;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		Queue<Integer>q1=new PriorityQueue<>();
		q1.add(11);
		q1.add(9);
		q1.add(8);
		System.out.println(q1);
		for(int i:q1)
		{
			System.out.print(i+" ");
		}
		Deque<Integer>d=new LinkedList<>();
		d.add(11);
		d.add(9);
		d.add(8);
		System.out.println(d);
		d.addFirst(1);
		d.removeLast();
		System.out.println(d);
		System.out.println(d.peek());
		d.pollLast();
		d.pollLast();
		d.pollLast();
		d.pollLast();
		d.pollLast();
		System.out.print(d);
		

	}

}
