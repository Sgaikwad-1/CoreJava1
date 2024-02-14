package com.edubridge.typecasting;

public class ImplicitAndExplicitTypeCasting {
	public static void main(String[] args) {
		// Implicit Type-casting or Widening
		// smaller to larger data type size
		char c = 'b';
		int num = c;
		System.out.println(num);
				
		// Explicit Type-casting or Narrowing
		// larger to smaller data type size
		int num1 = 63;
		char x = (char) num1;
		System.out.println(x);

	}

}


