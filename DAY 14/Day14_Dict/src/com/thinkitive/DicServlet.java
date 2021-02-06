package com.thinkitive;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;


@WebServlet("/DicServlet")
public class DicServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public DicServlet() {
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
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		
		String word=(String)request.getParameter("word");
		String insert=request.getParameter("insert");
		String display=(String)request.getParameter("display");
		String displayall=request.getParameter("display_all");
		
		DbConnection db=new DbConnection();
		Dictionary dit=new Dictionary(word);
		
		/*List l=db.display();
		out.println(l);
		RequestDispatcher d=request.getRequestDispatcher("dictionary.jsp");
		request.setAttribute("show", l);
	
		d.forward(request, response);*/
		
		
			if(insert.equals("insert"))
			{
				//db.getword();
				db.insert(dit);
				RequestDispatcher d=request.getRequestDispatcher("dictionary.jsp");
				request.setAttribute("word", word);
				d.forward(request, response);
			}
			
			
			
			
		
		if(display.equals("display"))
		{
			
			List l=db.display();
			out.println(l);
			RequestDispatcher d=request.getRequestDispatcher("dictionary.jsp");
			request.setAttribute("show", l);
		
			d.forward(request, response);
		}
		
		
		
		
		
	}

}
