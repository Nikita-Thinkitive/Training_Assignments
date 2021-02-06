package com.thikitive.cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException,NullPointerException {
		
		PrintWriter out=response.getWriter();
		String user=request.getParameter("name");
		String pass=request.getParameter("password");
		
		
		
		if(user.equals("root") && pass.equals("root"))
		{
			out.println(user+" "+pass);
			Cookie ck=new Cookie("session", "123");
			response.addCookie(ck);
			
			RequestDispatcher d=request.getRequestDispatcher("ProfileServlet");
			d.forward(request, response);
		}
		else
		{
			out.println("INVALID USERNAME/PASSWORD...PLEASE LOGIN AGAIN....");
		}
		
	}

}
