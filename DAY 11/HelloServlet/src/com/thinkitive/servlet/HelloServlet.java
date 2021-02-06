package com.thinkitive.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/hello") //URL MAPPING or URL PATTERN
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L; //Serialization
	int count;
	static int count1;
	 public HelloServlet() {
	        super();
	           }
       
    @Override
    	public void init() throws ServletException { //Servlet init will load the class only once
    		System.out.println("Init Method....");
    		count=0;
    		count1=0;
    		super.init();
    	}
   
    //doGet is default method of HttpServlet
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		System.out.println("doGet Method...");
		response.getWriter().println("doGet method on Browser...");
		count++;
		response.getWriter().println("GET:Visitors count: "+count);
		count1++;
		response.getWriter().println("Visitors count using static: "+count1);
	
		PrintWriter out=response.getWriter();
		
		String user=request.getParameter("name");
		String pass=request.getParameter("password");
		
		out.println(user+" "+pass);
		if(user.equals("admin") && user.equals("admin"))
		{
			out.println("done");
		}
	
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			System.out.println("doPost method...");
			response.getWriter().println("doPost method on Browser...");
			count++;
			response.getWriter().println("POST: Visitors count using doPost: "+count);
			count1++;
			response.getWriter().println("Visitors count using static using doPost : "+count1);
			
			PrintWriter out=response.getWriter();
			
			String user=request.getParameter("name");
			String pass=request.getParameter("password");
			
			String num=request.getParameter("number");
			
		    int n=Integer.parseInt(num); 
		    System.out.println(n);
		    int fact=1;
			for( int i=1;i<=n;i++)
			{
				fact=fact*i;
			}
			
			out.println(user+" "+pass+" "+fact);
	
	}
	
	//destroy will unload the class
	@Override
		public void destroy() {
			System.out.println("Destroy method...");
			super.destroy();
		}

}
