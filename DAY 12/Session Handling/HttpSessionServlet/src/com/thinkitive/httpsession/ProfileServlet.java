package com.thinkitive.httpsession;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/ProfileServlet")
public class ProfileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public ProfileServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
		}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String sessionid=request.getParameter("sessionid");
		HttpSession session=request.getSession(false);//do not create session if already exists
		if(session!=null)
		{
			out.println("HTTPSESSION SUCESSFULL");
			out.println(session.getId()); //setting id for session
			
			session.invalidate();
		}
		else {
			out.println("SOMETHING IS WRONG....");
		}
			
		
	}

}
