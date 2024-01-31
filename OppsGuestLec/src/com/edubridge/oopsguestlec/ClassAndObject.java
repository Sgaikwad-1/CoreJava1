package com.edubridge.oopsguestlec;

public class ClassAndObject {
	int empId=101;
	String empName="Jhon Smith";
	int age=21;
	void testing() {    //method
		System.out.println("Testing is in progress");
		}
	public static void main(String[] args) {
//object creation using new keyword
		ClassAndObject e1=new ClassAndObject();
		/*Employee e1;
		 * * e1=new Employee();
		 * * 
		 * * */
		System.out.println("Employee Id:"+e1.empId+""
				+ "\nEmployee Name: "+e1.empName+"\nEmployee Age: "
						+ ""+e1.age);
		e1.testing();

	}

 

}

	