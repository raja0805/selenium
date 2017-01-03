package raja;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class database {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		 String dbUrl = "jdbc:mysql://localhost:3306/emp";
		 
		 String username="root";
		 
		 String password="raja@1234";
		 
		 String query = "select *  from employees;";
		 
		 Class.forName("com.mysql.jdbc.Driver");
		 
		 Connection con = DriverManager.getConnection(dbUrl,username,password);
		 
		 Statement stmt = con.createStatement();
		 
		 ResultSet rs= stmt.executeQuery(query);
		 
		 while (rs.next()){
			// String field=rs.getString(0);
     		String myName = rs.getString(1);								        
             String myAge = rs.getString(2);
             String mysal=rs.getString(3);
             System. out.println(myName+"  "+myAge+" "+mysal);		
     }		
	     con.close();
		 
	}

	
}
