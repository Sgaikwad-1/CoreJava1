package com.edubridge.packtwo;
import com.edubridge.packone.AccessSpecifierDemo;
public class AccessSpecifierProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessSpecifierDemo obj=new AccessSpecifierDemo();
		/*atm_pinNo is private and we can't access
		 * into another class */
		//obj.atm_pinNo=1234
		obj.emailId="snehalgaikwad408@gmail.com";
		obj.displayemailId();	

	}

}
