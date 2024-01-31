package com.edubridge.string;

public class StringExample {

	public static void main(String[] args) {
		// 1.
				String str1 = "Edubridge";
				String str2 = "Edubridge";
				//2. by using new keyword
				String str3 = new String ("Edubridge");
				String str4 = new String ("Edubridge");
				
			System.out.println(str1==str2);
			System.out.println(str1==str3);
			System.out.println(str3==str4);
			System.out.println((str1).equals (str4));
			}

		}
