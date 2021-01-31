package com.thinkitive.mysql;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;


public class MyDB {
	
	public static void main(String[] args) {
		
		try {
		
		//REGISTER DRIVER CLASS
			Class.forName("com.mysql.jdbc.Driver");
		
		// CREATE AND ESTABLISH CONNECTION
			
			Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "nikita", "admin");
		
		//CREATE STATEMENT
		Statement st= (Statement) con.createStatement();
		
		
		//EXECUTE QUERY
		//st.execute("insert into think values(3,'Nik')");
		ResultSet rs=st.executeQuery("select * from think");
		
		while(rs.next())
		{
			
			System.out.println(rs.getInt(1)+" "+ rs.getString("name")+" ");
			
		}
	
		//CLOSE CONNECTION
		con.close();
		}
		catch (SQLException e) {
		
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
		
	}

}
