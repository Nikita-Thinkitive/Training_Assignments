package com.thinkitive.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/DbServlet")
public class DbServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public DbServlet() {
           }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
			}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		int id=Integer.parseInt(request.getParameter("empid"));
		
		String name=request.getParameter("name");
		int salary=Integer.parseInt(request.getParameter("salary"));
		
		DbOperation op=new DbOperation();
		op.insertEmp(id, name, salary);
		//op.deleteEmp(id);
		
		out.println(op.displayEmp());
		
		out.println(op.displayEmp());
		
		  int status=op.updateEmp(id, name);
		  out.println( status);
		  int id1=Integer.parseInt(request.getParameter("empid"));
			
			String name1=request.getParameter("name");
		  int dele=op.deleteEmp(id1);
		  out.println(dele);
		 
		
		
		
	}

}
