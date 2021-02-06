package com.thinkitive;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ServletTwo
 */
@WebServlet("/ServletTwo")
public class ServletTwo extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static Integer count=0;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletTwo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			this.doGet(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session =request.getSession();
		count =(Integer)session.getAttribute("count");
		if(count!=null) {
			count++;
			session.setAttribute("count", count);
		}
		else {
			count=0;
			count++;
			session.setAttribute("count",count);
		}
		response.getWriter().println("SERVLET TWO COUNT:"+count);
	}

}
