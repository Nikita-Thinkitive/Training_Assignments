package com.thinkitive.url_rewriting;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ImpoertantPage
 */
@WebServlet("/ImportantPage")
public class ImportantPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public ImportantPage() {
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
		String session=request.getParameter("sessionid");
		if(session!=null)
			out.println("Successfull");
		else
			out.println("Something is Wrong..");
	}

}
