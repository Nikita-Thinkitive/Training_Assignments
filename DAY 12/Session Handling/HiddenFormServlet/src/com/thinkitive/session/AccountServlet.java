package com.thinkitive.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/AccountServlet")
public class AccountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public AccountServlet() {
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
	
		String sessionid=request.getParameter("sessionid");//hidden input in html page
		if(sessionid!=null)
			out.println("YOUR ACCOUNT BALANCE IS 15000....");
		else
			out.println("Please login to view this page....");
			
	}

}
