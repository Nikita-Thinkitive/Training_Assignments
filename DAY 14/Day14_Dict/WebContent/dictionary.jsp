<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<meta name="description" content="">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
	integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
	crossorigin="anonymous"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
	integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
	crossorigin="anonymous"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
	integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
	crossorigin="anonymous"></script>
</head>
<body>
<h2></h2>
	<div class="container">
	<center>
   <div class="box" style="background-color:  lightcoral; width: 500px; height:500px; box-shadow: 5px 5px lightseagreen;border-radius: 15px;">
   <br/>
		<h3>DICTIONARY</h3>
		<br/>
		<form  action="DicServlet" method="POST">
			<div class="form-group" style="font-size:20px; ">
				<label >WORD</label>
				 <input
					type="text" class="form-control" 
					 placeholder="Enter word" name="word"  style="width: 400px; height: 50px; color:black;"> 
			</div>
			
			<br/>
			<button type="submit" class="btn btn-primary " name="insert" value="insert" style="width:120px;">INSERT</button>
			
			<button type="submit" class="btn btn-primary " name="display" value="display"  style="width:120px;">DISPLAY</button>
			<button type="submit" class="btn btn-primary " name="display_all" value="display_all" style="width:120px;">DISPLAY ALL</button>
			
		</form>
</center>
</div>
<br/>

								<%
								String display=request.getParameter("display");
								if(display!=null)
								{
									out.print("display"+display);
								}
								else
								{
									out.println("Wrong");
								}
								
								String show=request.getParameter("show");
								if(show!=null)
								{
									out.print("Display success"+show);
								}
								else
								{
									out.println("Wrong");
								}
								%>
						
</body>
</html>