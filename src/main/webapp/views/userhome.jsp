<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<!DOCTYPE html>
<html>
  <head>
    <link rel="stylesheet" href="../css/style.css" />
    <link
      rel="stylesheet"
      href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
      integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
      crossorigin="anonymous"
    />
    <style>
      body {
        background-image: url(https://e0.pxfuel.com/wallpapers/688/970/desktop-wallpaper-bitcoin-turning-on-screen-successful-investment-virtual-darkness-blockchain.jpg);
        background-attachment: fixed;
        background-size: 100% 100%;
      }
      a:link,
      a:visited {
        /* background-color: #f44336; */
        color: black;
        /* padding: 15px 25px; */
        /* text-align: center; */
        /* text-decoration: none; */
        /* display: inline-block; */
      }
      #back {
        margin-top: 1cm;
        color: white;
        background: rgba(12, 10, 10, 0.5);
        padding: 10px;
      }

      /* a:hover,
      a:active {
        background-color: gray;
      } */
    </style>
  </head>
  <header>
    <h1 style="color: white">Investment Portfolio Tracking Application</h1>
    <nav class="navbar navbar-expand-lg navbar-light bg-light">
      <div class="container-fluid">
        <ul class="navbar-nav mr-auto"></ul>
        <ul class="navbar-nav">
          <li class="nav-item active"><a class="nav-link" href="/">Home</a></li>
          <li class="nav-item active">
            <a class="nav-link" href="/about">About</a>
          </li>
          <li class="nav-item active">
            <a class="nav-link" href="/contactus">Contact Us</a>
          </li>
          <li class="nav-item active">
            <a class="nav-link" href="/">Logout</a>
          </li>
        </ul>
      </div>
    </nav>
  </header>
  <body>
    <div class="container">
      <div class="row">
        <div class="col-md-4" id="back">
          <h2>Add investment</h2>
          <p>Add your invest to track them further</p>
          <a class="btn btn-primary" href="/Investments/addinvestment/"
            >Add investment</a
          >
        </div>
        <div class="col-md-4"></div>
        <div class="col-md-4" id="back">
          <h2>Add transaction</h2>
          <p>Add your transaction to track them further</p>
          <a class="btn btn-primary" href="/Transactions/addtransaction/"
            >Add transaction</a
          >
        </div>
      </div>

      <div class="row">
        <div class="col-md-4" id="back">
          <h2>View investments</h2>
          <p>Get your investment details here</p>
          <% int userId = (int)request.getAttribute("user"); %>
          <a
            class="btn btn-primary"
            href="/Investments/showinvestment/<%=userId%>"
            >Goto investments</a
          >
        </div>
        <div class="col-md-4"></div>
        <div class="col-md-4" id="back">
          <h2>View Transactions</h2>
          <p>Get your transaction details here</p>
          <a
            class="btn btn-primary"
            href="/Test/showtransaction/<%=userId%>"
            >Goto Transactions</a
          >
        </div>
      </div>

      <div class="row">
        <div class="col-md-4" id="back">
          <h2>My profile</h2>
          <p>Get your profile here</p>
          <a class="btn btn-primary" href="/Users/profile/<%=userId%>"
            >See your profile</a
          >
        </div>
        <div class="col-md-4"></div>
        <div class="col-md-4" id="back">
          <h2>Latest investment news</h2>
          <p>Get news and predictions stuff here</p>
          <a class="btn btn-primary" href="/news/">News and Prediction</a>
        </div>
      </div>
    </div>
    <footer>
      <p style="color: white; padding-top: 20px">
        &copy; Investment Portfolio Tracking Application, 2023. All rights
        reserved.
      </p>
    </footer>
  </body>
</html>
