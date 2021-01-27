package com.thinkitive.Register;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletLogin
 */
@WebServlet("/ServletLogin")
public class ServletLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ServletLogin() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		
		
		String name=request.getParameter("name");
		String pass=request.getParameter("password");
		
		DbOperation op=new DbOperation();
		
		 
		  if(op.search(name, pass)!=0)
		  {
			  response.sendRedirect("index.html");
		  }
			out.println("PLEASE LOGIN AGAIN....");
		 
		  
	}

}
