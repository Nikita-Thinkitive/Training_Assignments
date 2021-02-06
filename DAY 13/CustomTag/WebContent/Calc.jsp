<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<div class="container">
	<center>
   <br/>
		<h3>JSP CALCULATOR</h3>
		<br/>
		<form  action="CalcServlet" method="POST">
			
			<label >FIRST NUMBER &nbsp;&nbsp;</label>
				 <input
					type="number" class="form-control" 
					 placeholder="Enter Number" name="number1" style="width: 400px; height: 50px; color:black;"> 
			<br/><br/>
			<label >SECOND NUMBER</label>
				 <input
					type="number" class="form-control" 
					 placeholder="Enter Number" name="number2" style="width: 400px; height: 50px; color:black;"> 
			
			
			<br/>
			<br/>
			
			<button type="submit" class="btn btn-primary " style="width:150px; height: 40px;">Calculate</button>
			
		</form>
</center>
</div>
<br/>

						<%
							String msg=(String)request.getAttribute("message");
						 String msg1=(String)request.getAttribute("message1");
							if(msg!=null)
							{
								out.println("\n"+msg);
							}
							else
							{
								out.println(msg1);
							}
							
							
							
							
							%>
</body>
</html>