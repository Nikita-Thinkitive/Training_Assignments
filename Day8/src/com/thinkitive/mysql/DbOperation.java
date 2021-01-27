package com.thinkitive.mysql;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DbOperation {
	DbConnection db = new DbConnection();
	Statement st;
	PreparedStatement ps;

	public void insertEmp(int id,String name,int salary)
	{
	try {	
	ps=db.getPreparedStatement("insert into employee values(?,?,?)");
	ps.setInt(1, id);
	ps.setString(2, name);
	ps.setInt(3, salary);
	ps.execute();
	db.Dbclose();
	}
	catch(SQLException e)
	{
		System.out.println(e);
	}
			
	}
	
	
	public void deleteEmp(int id)
	{
		try {
		ps=db.getPreparedStatement("delete from employee where id=?");
		ps.setInt(1, id);
		ps.execute();
		db.Dbclose();
		}
		catch (Exception e) {
			
		}
	}
	
	public void updateEmp(int id,String name)
	{
		try
		{
			ps=db.getPreparedStatement("update employee set ename=? where empid=?");
			ps.setString(1, name);
			ps.setInt(2, id);
			ps.execute();
			
			db.Dbclose();
			
		}catch (Exception e) {
			
		}
	}
	
	
	
	public void displayEmp()
	{
		
		try {
			
		st=db.getstatement();
		ResultSet rs=st.executeQuery("select * from employee");
		while(rs.next())
		{
			System.out.println(" "+rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
		}
		
		db.Dbclose();
		}catch (Exception e) {
			
		}
	}
}
