package com.thinkitive.Register;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class DbOperation {
	DbConnection db = new DbConnection();
	Statement st;
	PreparedStatement ps;
	
	public void create()
	{
		try {
	st=db.getstatement();
	/* String sql = 	 "create table register (id INTEGER not NULL auto_increment,  name VARCHAR(255), "
	 		+ "password VARCHAR(255), PRIMARY KEY ( id ) )"; */
	
	String sql="create table register (name varchar(50),password varchar(25));";
		st.executeUpdate(sql);
		System.out.println("Table is Created");
		db.Dbclose();
	} catch (SQLException e) {
		System.out.println(e);
	}
			
	}

	public void insertEmp(String name,String pass )
	{
		try {	
			//ps=db.getPreparedStatement("insert into register values(?,?,?)");
			//ps.setInt(1, id);
			ps=db.getPreparedStatement("insert into register values(?,?)");
			
			ps.setString(1, name);
			ps.setString(2, pass);
			ps.execute();
			db.Dbclose();
			}
			catch(SQLException e)
			{
				System.out.println(e);
			}
					
		
	}
	
	public int search(String name,String pass)
	{
		int status=0;
		try
		{
		String sql="select name,password from register where name=? and password=?";
		ps=db.getPreparedStatement(sql);
		ps.setString(1, name);
		ps.setString(2, pass);
		ResultSet rs=ps.executeQuery();
		if(rs.next()==false )
		{
			System.out.println("WRONG LOGIN....");
		}
		else
		{
			rs.getString(1);
			rs.getString(2);
			System.out.println("Login Successfull...");
			status++;
		}
		
		db.Dbclose();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		if(status>0)
		{
			return 1;
		}
		else
		{
			return 0;
		}
		
	
	}
	
	public List displayEmp()
	{
		List l=new ArrayList();
		try {
			
		st=db.getstatement();
		ResultSet rs=st.executeQuery("select * from register");
		while(rs.next())
		{
			System.out.println(" "+rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
			
			l.add(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
		}
		
		db.Dbclose();
		}catch (Exception e) {
			
		}
		return l;
	}
	
	
	

}
