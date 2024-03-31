<!DOCTYPE html>
<%@page import="Cngstation.Getset"%>
<html>
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- Main CSS-->
    <link rel="stylesheet" type="text/css" href="css/main.css">
    <!-- Font-icon css-->
    <link rel="stylesheet" type="text/css" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    <title>Enter amount</title>
  </head>
  <body >
  <%Getset.setMob(request.getParameter("mobile")); %>
    <section class="material-half-bg">
      <div class="cover"></div>
    </section>
    <section class="lockscreen-content">
      <div class="logo">
        <h1>Maharashtra CNG Station</h1>
      </div>
      <div class="lock-box">
        <h4 class="text-center user-name">Enter Amount</h4>
        <p class="text-center text-muted"></p>
        <form class="unlock-form" action="Book.jsp">
          <div class="form-group">
            <label class="control-label">Book</label>
            <input class="form-control" type="text" placeholder="Enter amount" name="amount">
          </div>
          <div class="form-group btn-container">
            <button class="btn btn-primary btn-block" type="submit">Book </button>
          </div>
        </form>
        <p><a href="viewuser.html">go back.</a></p>
      </div>
    </section>
    <!-- Essential javascripts for application to work-->
    <script src="js/jquery-3.3.1.min.js"></script>
    <script src="js/popper.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/main.js"></script>
    <!-- The javascript plugin to display page loading on top-->
    <script src="js/plugins/pace.min.js"></script>
  </body>
</html>