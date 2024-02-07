package com.edubridge.thiskeyworddemo;
/*it can be use to refer instance variable
 * of current class*/
class Account
{
	//instance variable
	public String accType;
	public long accno;
	
	//method
	public void setData(String accType, long accno)
	{
		this.accType=accType;
		this.accno=accno;
	}
	public void display()
	{
		System.out.println("accType"+""+accno);
	}
}

public class ThisKeywordDemo1 {

	public static void main(String[] args) {
		Account obj=new Account();
		obj.setData("Saving", 123);
		obj.display();

	}

}
