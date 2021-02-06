package com.thinkitive.taglibs;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class FactJsp extends TagSupport{
	
	private String message;
	

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
			
			
			for(int i=1;i<=Integer.parseInt(message);i++)
			{
				fact=fact*i;
			}
			out.println("\nFACTORIAL FOR NUMBER: "+message+" is:"+fact);
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