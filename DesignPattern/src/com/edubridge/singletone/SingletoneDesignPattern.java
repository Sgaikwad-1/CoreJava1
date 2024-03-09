package com.edubridge.singletone;

import java.sql.SQLException;
import java.util.Scanner;

public class SingletoneDesignPattern {

	public static void main(String[] args) throws SQLException {
		System.out.println("SingleTone Design creational Design Pattern");
		Scanner sc=new Scanner(System.in);
		
		JDBCSingleton jdbc=JDBCSingleton.getInstance();
		
		int choice=0;
		
		do {
			System.out.println("1.Insert");
			System.out.println("2.View");
			System.out.println("3.Update");
			System.out.println("4.delete");
			System.out.println("5.Exit");
			System.out.println("Insert your choice");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter name:");
				String name=sc.next();
				
				System.out.println("Enter password:");
				String password=sc.next();
				
				System.out.println("Enter employee id:");
				int id=sc.nextInt();
				
				int i=jdbc.insert(name,  password,  id);
				
				if(i>0) {
					System.out.println("Data Inserted successfully");
				}
				else {
					System.out.println("Data Not Inserted");
				}
				break;
			case 2:
				jdbc.view();
				break;
			case 3:
				System.out.println("Enter the username which u want to update:");
				String uname1=sc.next();
				
				System.out.println("Enter the password which you want to update:");
				String upass1=sc.next();
				
				System.out.println("Enter the id which you want to update:");
				int uid=sc.nextInt();
				
				int i1=jdbc.update(uid, upass1, uname1);
				
				if(i1>0) {
					System.out.println("Data updated sucessfully");
				
				}
				else {
					System.out.println("data not updated");
				}
				break;
			case 4:
				System.out.println("Which id you wqant to delete:");
				int id1=sc.nextInt();
				
				jdbc.delete(id1);
				System.out.println("Deleted sucessfully");
				break;
				
			case 5:
				System.out.println("Exitting....");
				break;
			default:
				System.out.println("Invalid output....");
				
				
			}
			
			
		}while(choice!=5);
		
	}

}
