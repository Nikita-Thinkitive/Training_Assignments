package com.thinkitive.calculator;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



/**
 * Servlet implementation class CalcServlet
 */
@WebServlet(name = "CalcServlet", urlPatterns = { "/CalcServlet" })
public class CalcServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
    public CalcServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		RequestDispatcher d;
		
		
	
		int num1=Integer.parseInt(request.getParameter("number1"));
		int num2=Integer.parseInt(request.getParameter("number2"));
		MVC_Calculator c=new MVC_Calculator(num1, num2);
		
		if(num1!=0 & num2!=0)
		{
			out.println("Number1"+num1+" Number2:"+num2);
			d=request.getRequestDispatcher("Calc.jsp");
			int add=c.add(num1, num2);
			int sub=c.sub(num1, num2);
			int div=c.div(num1, num2);
			int multi=c.multiply(num1, num2);
			
			request.setAttribute("message","Addition of Number: "+add+"\nSubstraction of Number: "+sub+"\nDivision of Number: "+div+"\nMultiplication of Number: "+multi);
			
			
			d.forward(request, response);
		}
		else
		{
			d=request.getRequestDispatcher("Calc.jsp");
			request.setAttribute("message1","Please Enter Values");
			out.println("Please Enter Values");
		}
	}

}
