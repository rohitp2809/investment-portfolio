<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@page import="java.util.List" %>
    <%@page import="com.example.test2.dto.*" %>
    
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="../css/style.css" />
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
#customers {
  font-family: Arial, Helvetica, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

#customers td, #customers th {
  border: 1px solid #ddd;
  padding: 8px;
}

#customers tr:nth-child(even){background-color: #f2f2f2;}

#customers tr:hover {background-color: #ddd;}

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
          <li><a href="userhome.html">Home</a></li>
          <li><a href="About.html">About</a></li>
          <li><a href="contactus.html">Contact Us</a></li>
        </ul>
      </nav>
    </header>
<body>
<table  id="customers" border="1">
<tr>
<td>user id</td>
<td>First Name</td>
<td>LastName</td>
<td>MobileNumber</td>
<td>AdharCardNumber</td>
<td>email id</td>
<td>password</td>

</tr>
<%
List<UsersDTO> list = (List<UsersDTO>)request.getAttribute("userlist");
for(UsersDTO objUser : list)
{
%>
<tr>
<td><%=  objUser.getUserId() %></td>
<td><%=  objUser.getFirstName()  %></td>
<td><%= objUser.getLastName() %></td>
<td><%=  objUser.getMobileNumber() %></td>
<td><%=  objUser.getAadharCardNumber() %></td>
<td><%= objUser.getEmailId() %></td>
<td><%= objUser.getPassword()%></td>


</tr>
<%
}
%>
</table>

 <form action="removeuser"  method="post">
			<div class="container">
			<p>please enter the user id to remove the user</p>
			<label for="transactionid"><b>userid</b></label>
          <input type="number" id="userid" name="userid" required>
   <input type="submit" value="Submit">
		</div>

</form>






<footer>
      <p>&copy; Investment Portfolio Tracking Application, 2023. All rights reserved.</p>
    </footer>
</body>
</html>