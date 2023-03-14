<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Investment</title>
<link rel="stylesheet" href="/css/style.css" />
<link rel="stylesheet" href="../style.css">
</head>

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
      <h1>Add Investment</h1>
      <h2>please fill following details to add investment</h2>
      <div class="container">
    <form:form  action="/Investments/saveinvestment"  method="post">
			<div class="col-75">
			<label for="userid"><b>User Id</b></label>
			<input type="number" id="userid" name="userid" required><br>
</div><div class="col-75">
         <label for="type"><b>type</b></label>
			<input type="text" id="type" name="type" required><br>
            </div><div class="col-75">
            <label for="name"><b>Name</b></label>
			<input type="text" id="name" name="name" required><br>
			</div><div class="col-75">
			<label for="amount"><b>Amount</b></label>
      <input type="number" id="amount" name="amount" required><br>
      </div><div class="col-75">
      <label for="status"><b>status</b></label>
      <input type="text" id="status" name="status" required><br>
</div><div class="col-75">
      <input type="submit" value="Submit">
      </div>
	</form:form>
	</div>
     
    </main>
    
</html>