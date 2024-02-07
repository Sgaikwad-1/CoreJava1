package com.edubridge.statickeyworddemo;
class LearnerDetails
{
	static String name;
	static int rollno;
	/*2.institute name for all the learner are
	 * common so,we */
	
	static String instituteName="Edubridge";
	/*3.*/
	public static void print()
	{
		System.out.println(name+""+rollno+""+"intituteName");
	}
}
public class StaticKeywordDemo {

	public static void main(String[] args) {
		LearnerDetails.rollno=101;
		LearnerDetails.name="Snehal";
		LearnerDetails.print();
		

	}

}
