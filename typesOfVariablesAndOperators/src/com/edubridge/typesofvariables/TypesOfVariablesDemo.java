package com.edubridge.typesofvariables;

public class TypesOfVariablesDemo {
	//Instance Variable
		float salary = 78900.56f;
		//Static Variable
		static int x = 80;
	//Creating a method
		String display()
		{
			//Local Variable
			char y1 = 'Z';	
			System.out.println(y1);
			return "Local Variable";
			
		            }
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			TypesOfVariablesDemo obj = new TypesOfVariablesDemo();
			System.out.println(x);
			System.out.println(obj.display());
			System.out.println(obj.salary);
			
		}
	}

	