package com.edubridge.filtering;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FilterDemo {

	public static void main(String[] args) {
		//filter
		List<String>obj=Arrays.asList("shifa","snehal","preeti");
		obj.stream().filter(i->i.length()>5).forEach(i->System.out.println(i));
		
		//count
		Stream<Integer>obj1=Stream.of(11,4,67,89);
		System.out.println(obj1.count());
		
		//limit
		obj.stream().limit(2).forEach(i->System.out.println(i+" "));
		
		//skip
		obj.stream().skip(1).forEach(i->System.out.println(i));
	}
}
