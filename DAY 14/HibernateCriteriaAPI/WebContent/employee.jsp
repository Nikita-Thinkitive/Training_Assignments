<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
				Name:<input type="text" name="ename" >
				<input type="submit" name="search" value="Search">
				
				<%
				String message=(String)request.getAttribute("l");
				//List l=(List)request.getAttribute("l");
				if(message!=null)
				{
					out.println("Success"+message);
				}
				else
				{
					out.println("Something is wrong"+message);
				}
				%>>
</body>
</html>