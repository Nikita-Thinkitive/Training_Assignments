package com.thinkitive.servlet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DbConnection {
	
	
	 Connection con;
	 Statement st;
	 ResultSet rs;
	PreparedStatement ps;
	 
	 public DbConnection()
	 {
		 try {
			 
			Class.forName("com.mysql.jdbc.Driver");
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
	 }
	 
	 
	public  Connection getConnection()
	{
	try {
		
		
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "nikita", "admin");
		
		
	} 
	catch (SQLException e) {
		
		e.printStackTrace();
	}
	
	return con;
	}
	
	public Statement getstatement()
	{
		 try 
		 {
			st= this.getConnection().createStatement();
			
		} 
		 catch (SQLException e) {
			
			e.printStackTrace();
		}
		 
		 return st;
	}
	public void Dbclose()
	{
		if(con!=null)
		{
		try {
			
			con.close();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		}
	}
	
	public PreparedStatement getPreparedStatement(String sql) {
		try {
			
			ps=this.getConnection().prepareStatement(sql);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return ps;
	}

	
	
		
		
		
			
				

}
