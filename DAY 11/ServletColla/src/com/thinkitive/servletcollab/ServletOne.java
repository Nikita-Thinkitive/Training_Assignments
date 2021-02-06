package com.thinkitive.servletcollab;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletOne
 */
@WebServlet("/ServletOne")
public class ServletOne extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ServletOne() {
        super();
       
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		out.println("We ARE IN SERVLET ONE....");
		String user=request.getParameter("name");
		String pass=request.getParameter("password");
		
		out.println(user+" "+pass);
		//response.sendRedirect("ServletTwo");// Without sharing data call another servlet
	}

}
