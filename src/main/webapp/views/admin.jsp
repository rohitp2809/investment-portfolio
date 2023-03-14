<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Log In</title>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css">
<link rel="stylesheet" href="./style.css">
<link rel="stylesheet" href="../css/style.css" />
</head>
<header>
      <h1>Investment Portfolio Tracking Application</h1>
      <nav>
        <ul>
          <li><a href="/">Home</a></li>
          <li><a href="/about">About</a></li>
          <li><a href="/contactus">Contact Us</a></li>
        </ul>
      </nav>
    </header>
    <main>
     <div id="login-form-wrap">
  <h2>Admin Login</h2>
  <form id="login-form"  action="/Testb/showallusers">
    <p>
    <input type="number" id="userid" name="userid" placeholder="Userid" required><i class="validation"><span></span><span></span></i>
    </p>
    <br>
    <br>
    <p>
    <input type="password" id="password" name="password" placeholder="password" required><i class="validation"><span></span><span></span></i>
    </p>
    <p>
    <br>
    <br>
    <input type="submit" id="login" value="Login">
    </p>
  </form>
  
</div><!--login-form-wrap-->
<!-- partial -->
</main>
    </body>
    
    <footer>
      <p>&copy; Investment Portfolio Tracking Application, 2023. All rights reserved.</p>
    </footer>
</html>