package CommonUtility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class db 
{
	
	public static void getdbData() throws ClassNotFoundException, SQLException
	{
		
		String url = "jdbc:mysql://localhost:3306/abdb";
		String uname = "root";
		String pass = "Rona@0987654";
		String query = "select first_name from customer";
		
		//represent classes and interfaces in a running Java application
		//to load and register the driver
		
				
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, uname, pass);
		
		//The object used for executing a static SQL statement and returning the results it produces.
		//Create a statement
		Statement st = con.createStatement();
		// table of data representing a database result set
		//Execute query
		ResultSet rs = st.executeQuery(query);
		//Cursor will point to the table name so need to move
		rs.next();
		// process the result  
		String name = rs.getString("first_name");
		System.out.println(name);
		st.close();
		con.close();
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		
		db.getdbData();
	}
}
