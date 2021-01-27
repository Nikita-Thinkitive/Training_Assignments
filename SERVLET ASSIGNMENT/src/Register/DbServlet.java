package com.thinkitive.Register;

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
       
    static int i=16;
    static int a=0;
    public DbServlet() {
           }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			this.doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		
		
		String name=request.getParameter("name");
		String pass=request.getParameter("password");
		
		DbOperation op=new DbOperation();
		//op.create();
		
		 //a=++i;
		 //op.insertEmp(a, name, pass);
		
		op.insertEmp(name, pass);
		  response.sendRedirect("Login.html");
		 
		  
		 
		
		
		
	}

}
