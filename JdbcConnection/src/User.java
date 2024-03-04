import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.cj.jdbc.CallableStatement;

public class User {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//step-1 load the jdbc driver class
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//step-2 establish the connection
		String url="jdbc:mysql://localhost:3306/users";
		String uname="root";
		String password="root";
		
		//step-3 connect with database
		Connection conn=DriverManager.getConnection(url,uname,password);
		
		//step-4 inserting record using preparedstatement()
		
		String sql="insert into employee(uid,uname,location)values(?,?,?)";
		
		PreparedStatement ps=conn.prepareStatement(sql);
		
		ps.setInt(1, 102);
		ps.setString(2, "sayli");
		ps.setString(3, "pune");
		
		//int i=ps.executeUpdate();
		
		CallableStatement cs=(CallableStatement) conn.prepareCall(sql);
				
				cs.setInt(1, 103);
		        cs.setString(2,"shalini");
		        cs.setString(3,"Delhi");
		        cs.execute();
		
		System.out.println("Data inserted sucessfully");
		

	}

}
