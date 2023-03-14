<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@page import="java.util.List" %>
    <%@page import="com.example.test2.pojo.Transactions" %>
    
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="../css/style.css" />
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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
			<li><a class="active" href="/">Home</a></li>
			<li><a href="/removetransaction">RemoveTransaction</a></li>
			<li><a href="/contactus">Contact</a></li>
			<li><a href="/about">About</a></li>
		</ul>
	</nav>
</header>
<body>
<h1>your Transactions</h1>
<table  id="customers" border="1">
<tr>
<td>transaction id</td>
<td>Name</td>
<td>purchase amount</td>
<td>amount sold</td>
<td>profit</td>
<td>loss</td>
</tr>
<%
List<Transactions> list = (List<Transactions>)request.getAttribute("showtransaction");
for(Transactions objTransactions : list)
{
%>
<tr>
<td><%=  objTransactions.getTransactionid() %></td>
<td><%=  objTransactions.getName() %></td>
<td><%= objTransactions.getAmount() %></td>
<td><%= objTransactions.getAmountsold()%></td>
<td><%= objTransactions.getGain() %></td>
<td><%= objTransactions.getLoss() %></td>

</tr>
<%
}
%>
</table>

</body>

</html>