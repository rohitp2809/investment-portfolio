<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Investment</title>
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
    <main>
      <h1>Remove Transaction</h1>
      <h2>please fill following details to add investment</h2>
    <form action="/Test/removetransaction/">
			<div class="container">
		
			<label for="transactionid"><b>TransactionId</b></label>
          <input type="number" id="transactionid" name="transactionid" required>
   <input type="submit" value="Submit">
		</div>
     </form>
    </main>
    

</html>