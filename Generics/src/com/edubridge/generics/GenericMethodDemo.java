package com.edubridge.generics;
/*program to demonstrate on generic method*/
public class GenericMethodDemo {

	//where E stands for any Kind of argument type
	public static <E>void accept(E[] arr)
	{
		for(E itr:arr)
		{
			System.out.print(itr+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Integer[] arr1= {66,63,44,33};
		String[] arr2= {"Rhea","Snehal","Priti"};
		System.out.println("First array is:");
		GenericMethodDemo.accept(arr1);
		
		System.out.println("second array is:");
		GenericMethodDemo.accept(arr2);
		

	}

}
