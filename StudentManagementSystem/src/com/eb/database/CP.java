package com.eb.database;

import java.sql.Connection;
import java.sql.DriverManager;

public class CP {
	static Connection conn;
	public static Connection createc()
	{	
		try{
	Class.forName("com.mysql.cj.jdbc.Driver");
	String url="jdbc:mysql://localhost:3306/miniproject";
	String uname="root";
	String password="root";
	conn=DriverManager.getConnection(url,uname,password);

}
catch(Exception e)
{
e.printStackTrace();
}
return conn;
}
}