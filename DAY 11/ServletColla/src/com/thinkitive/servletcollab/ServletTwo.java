package com.thinkitive.servletcollab;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletTwo
 */
@WebServlet("/ServletTwo")
public class ServletTwo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ServletTwo() {
        super();
           }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);	
		}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		out.println("We ARE IN SERVLET Two....");
		String user=request.getParameter("name");
		String pass=request.getParameter("password");
		out.println(user+" "+pass);
		RequestDispatcher d=request.getRequestDispatcher("ServletOne"); //share data to sevlet
		
		d.include(request, response); //include both servlet data
		//d.forward(request, response); //only display servlet one data
		
	}

}
