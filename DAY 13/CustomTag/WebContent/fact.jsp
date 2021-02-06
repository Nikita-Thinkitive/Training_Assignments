<%@page import="com.thinkitive.taglibs.HelloJsp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
     <%@ taglib uri="/WEB-INF/fact.tld" prefix="tag" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>FACTORIAL NUMBER</title>
</head>
<body>
<form>
<input type="number" name="data"><br/>
<input type="submit">
</form>
<%!
 String s="0";
%>
<%
	s=request.getParameter("data");
if(s==null)
{
	s="0";
}
%>
	<tag:fact message="<%=s%>" >
	</tag:fact>
	
</body>
</html>