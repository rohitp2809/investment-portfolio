<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.util.List"%>
<%@page import="com.example.test2.dto.*"%>

<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="/css/style.css" />
</head>
<style>
ul {
	list-style-type: none;
	margin: 0;
	padding: 0;
	overflow: hidden;
	background-color: #333;
}

li {
	float: left;
}

li a {
	display: block;
	color: white;
	text-align: center;
	padding: 14px 16px;
	text-decoration: none;
}

li a:hover {
	background-color: #111;
}

#customers {
	font-family: Arial, Helvetica, sans-serif;
	border-collapse: collapse;
	width: 100%;
}

#customers td, #customers th {
	border: 1px solid #ddd;
	padding: 8px;
}

#customers tr:nth-child(even) {
	background-color: #f2f2f2;
}

#customers tr:hover {
	background-color: #ddd;
}

#customers th {
	padding-top: 12px;
	padding-bottom: 12px;
	text-align: left;
	background-color: #04AA6D;
	color: white;
}
</style>
<header>
	<h1>Investment Portfolio Tracking Application</h1>
	<nav>
		<ul>
			<li><a class="active" href="/">Home</a></li>
			<li><a href="/contactus">Contact</a></li>
			<li><a href="/about">About</a></li>
		</ul>
	</nav>
</header>
<body>
	<table id="customers" border="1">
		<tr>
			<td>user id</td>
			<td>First Name</td>
			<td>LastName</td>
			<td>MobileNumber</td>
			<td>AdharCardNumber</td>
			<td>email id</td>
			

		</tr>
		<%
		UsersDTO objUser = (UsersDTO) request.getAttribute("showProfile");

		{
		%>
		<tr>
			<td><%=objUser.getUserId()%></td>
			<td><%=objUser.getFirstName()%></td>
			<td><%=objUser.getLastName()%></td>
			<td><%=objUser.getMobileNumber()%></td>
			<td><%=objUser.getAadharCardNumber()%></td>
			<td><%=objUser.getEmailId()%></td>
			


		</tr>
		<%
		}
		%>
	</table>


	footer>
	<p>&copy; Investment Portfolio Tracking Application, 2023. All
		rights reserved.</p>
	</footer>
</body>
</html>