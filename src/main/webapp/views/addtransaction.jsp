<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Transaction</title>
<link rel="stylesheet" href="/css/style.css" />
</head>

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
<main>
	<h1>Add Transaction</h1>
	<h2>please fill following details to transaction</h2>


	<div class="container">
		<form action="/Test/savetransaction" method="post">

			
			<div class="col-75">
				<label for="name"><b>Name</b></label> <input type="text" id="name"
					name="name" required><br>
					<div class="col-75">
				<label for="userid"><b>User Id</b></label> 
				<input type="number"
					id="userid" name="userid" required><br>
			</div>
			</div>
			<div class="col-75">
				<label for="amount"><b>Amount</b></label> <input type="number"
					id="amount" name="amount" required><br>
			</div>
			<div class="col-75">
				<label for="amountsold"><b>Amount Sold</b></label> <input
					type="number" id="amountsold" name="amountsold" required><br>
			</div>
			<div class="col-75">
				<label for="loss"><b>Loss</b></label> <input
					type="number" id="loss" name="loss" required><br>
			</div>
			<div class="col-75">
				<label for="gain"><b>gain</b></label> <input
					type="number" id="gain" name="gain" required><br>
			</div><br>
			<div class="col-75">
				<input type="submit" value="Submit">
			</div>

		</form>
	</div>
</main>

 
</html>