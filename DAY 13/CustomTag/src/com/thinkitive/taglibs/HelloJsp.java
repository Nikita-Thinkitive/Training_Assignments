package com.thinkitive.taglibs;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class HelloJsp extends TagSupport{
	
	private String message;
	 Integer num;
	 public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	Integer fact=1;
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public int doStartTag() throws JspException {
		
		JspWriter out=pageContext.getOut();// to print on browser
		try
		{
			out.println("HELLO JSP WE ARE IN CUSTOM JSP......"+message+"\n");
			
			
			for(int i=1;i<=num;i++)
			{
				fact=fact*i;
			}
			out.println("\n***FACTORIAL FOR NUMBER: "+num+" is:"+fact);
		}catch (IOException e) {
			System.out.println(e);
		}
		return super.doStartTag();
	}

	public Integer getFact() {
		return fact;
	}

	public void setFact(Integer fact) {
		this.fact = fact;
	}

}
