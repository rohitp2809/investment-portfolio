<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SignUp</title>
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
      <h2>Sign Up</h2>
      <p>please fill following details to sign up</p>
      <form action="saveuser"  method="post">
		
		     
		<div class="container">
			<label for="firstname"><b>First Name</b></label>
			<input type="text" placeholder="Enter First Name" name="firstname" required>
            <label for="lastname"><b>Last Name</b></label>
			<input type="text" placeholder="Enter Last Name" name="lastname" required>
            
            <label for="mobilenumber"><b>Mobile Number</b></label>
			<input type="number" placeholder="Enter Mobile Number" name="mobilenumber" pattern="[1-9]{1}[0-9]{9}" maxlength="10" required>
			
			<label for="email"><b>Aadhar Number</b></label>
			<input type="text" placeholder="Enter Adhar Number"  name="aadharcardnumber" maxlength="12" required>

			<label for="emailid"><b>Email</b></label>
			<input type="text" placeholder="Enter Email" name="emailid" required>
			
			<label for="password"><b>Password</b></label>
			<input type="password" placeholder="Enter Password" name="password" required>
			
		
			<div class="checkbox">
				<input type="checkbox" id="signupCheck" />

				<label for="signupCheck">I accept all terms & conditions</label>
			  </div>
			<input type="submit" value="Sign Up">
		</div>
		
		
		
	</form>
      <script>
        function showSuccessAlert() {
          // Show alert message
          alert("registration  successfully!");
          // Redirect to new page
          window.location.href = "https://www.trackmyinvestment.com";
          return true; // Form will be submitted
        }
        </script>
    </main>
    <footer>
      <p>&copy; Investment Portfolio Tracking Application, 2023. All rights reserved.</p>
    </footer>
  </body>
</html>