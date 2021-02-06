package com.thinkitive.jsp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   static int count=0;
    public LoginServlet() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	this.doPost(request, response);	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String name=request.getParameter("name");
		String pass=request.getParameter("password");
		String num=request.getParameter("number");
		
		count=count++;
		RequestDispatcher d;
		
		if(name.equals("admin") && pass.equals("admin") && !num.equals(null))
		{
			int n=Integer.parseInt(num); 
		   
		    int fact=1;
			for( int i=1;i<=n;i++)
			{
				fact=fact*i;
			}
			
			
			
			d=request.getRequestDispatcher("index.jsp");
			request.setAttribute("message", "<p class='btn-info'>SUCCESSFULL<br/> Factorial is "+fact+ "<br/>Visitors count "+count+ "</p>");
			HttpSession session=request.getSession();
			session.setAttribute("Visitor Count", count++);
			d.include(request, response);
		}
		else
		{
		 d=request.getRequestDispatcher("index.jsp");
			request.setAttribute("message", "<p class='btn-success'>Invalid User and Password...Please Login Again....</p>");
			
			
			
		}
	
	}

}
