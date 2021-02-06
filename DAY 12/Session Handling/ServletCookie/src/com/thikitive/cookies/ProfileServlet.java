package com.thikitive.cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProfileServlet
 */
@WebServlet("/ProfileServlet")
public class ProfileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ProfileServlet() {
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
		
		Cookie ck[]=request.getCookies();
		if(ck!=null)
		{
			out.println("WELCOME TO YOUR PROFILE....");
			out.println(ck[0].getValue());
			
			ck[0].setMaxAge(0); //SESSION END OR LOG OUT
			response.addCookie(ck[0]);
		}
		else
		{
			out.println("Please login again");
		}
	}

}
