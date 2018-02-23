<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SignUp</title>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<%@ include file="/WEB-INF/jsp/Header.jsp" %>
<div class="container">
  <div class="row">
    <div class="col-md-5 col-md-offset-6">
      <div class="panel panel-default">
        <div class="panel-heading"> <strong class="">Register</strong>
	    </div>
      <div class="panel-body">
<form class="form-horizontal" action="" method="get">
         <div class="form-group">
           <label for="UserName"></label>
             <div class="col-sm-9">
             <input type="text" class="form-control" id="username" placeholder="UserName" required="">
             <p class="help-block">Username can contain any letters or numbers, without spaces</p>
               </div>
               </div>
   <div class="form-group">
       <label for="email"></label>
        <div class="col-sm-9">
        <input type="email" class="form-control" id="email" placeholder="Enter Email" required="">
        <p class="help-block">Please provide your E-mail</p>             
  </div>
  </div>
 <div class="form-group">
  <label for="password" ></label>
  <div class="col-sm-9">
     <input type="password" class="form-control" id="password" placeholder="Password" required="">
      <p class="help-block">Password should be at least 6 characters</p>
        </div>
        </div>
 <div class="form-group">
  <label for="password" ></label>
  <div class="col-sm-9">
     <input type="password" class="form-control" id="password_confirm" placeholder="Confirm Password" required="">
      <p class="help-block">Please confirm password</p>
        </div>
        </div>
<div class="form-group last">
           <div class="col-sm-offset-4 col-sm-6">
              <button type="Register" class="btn btn-success btn-sm">SignUp</button>
           </div>
          </div>
          </form>
          </div>
          </div>
          </div>
          </div>
          </div>                           
</body>
</html>