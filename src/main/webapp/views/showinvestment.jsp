<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@page import="java.util.List" %>
    <%@page import="com.example.test2.pojo.Investments" %>
    
<!DOCTYPE html>
<html>
<head>

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
  
  <li><a href="/contactus">Contact</a></li>
  <li><a href="/about">About</a></li>
  <li><a href="/removeinvestment">RemoveInvestment</a></li>
        </ul>
      </nav>
    </header>
<body>
<br>
<h2>Your Investments</h2>
<table  id="customers" border="1">
<tr>
<td>Investment id</td>
<td>Name</td>
<td>type</td>
<td>purchase amount</td>

</tr>
<%
 
List<Investments> list = (List<Investments>)request.getAttribute("showinvestments");

for(Investments objInvestment : list)
{
%>
<tr>
<td><%=  objInvestment.getInvestmentId() %></td>
<td><%=  objInvestment.getName()  %></td>
<td><%= objInvestment.getType() %></td>
<td><%=  objInvestment.getAmount()  %></td>


</tr>
<%
}
%>
</table>

 <br>
  <br>
   <br>
    <br>
     <br>
      <br>
</body>

</html>