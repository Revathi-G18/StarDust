<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<style>
body { 
    background-image:url("/resources/image/bg.jpg"); 
    background-repeat: no-repeat;
    background-attachment: fixed;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
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
    <div class="col-md-4 col-md-offset-7">
      <div class="panel panel-default">
        <div class="panel-heading"> <strong class="">Login</strong>
	    </div>
      <div class="panel-body">
<form class="form-horizontal" action="">
                        <div class="form-group">
                            <label for="email"></label>
                            <div class="col-sm-9">
                                <input type="email" class="form-control" id="email" placeholder="Enter Email" required="">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="password" ></label>
                            <div class="col-sm-9">
                                <input type="password" class="form-control" id="password" placeholder="Password" required="">
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-sm-9">
                                <div class="checkbox">
                                    <label class="">
                                        <input type="checkbox" class="">Remember me</label>
                                </div>
                            </div>
                        </div>
                        <div class="form-group last">
                            <div class="col-sm-offset-3 col-sm-9">
                                <button type="submit" class="btn btn-success btn-sm">Login</button>
                                <button type="reset" class="btn btn-default btn-sm">Reset</button>
                            </div>
                        </div>
                    </form>
</div>
<div class="panel-footer">Not Registered? <a href="SignUp" class="">Register here</a>
</div>
</div>
</div>
</div>
</div>                
</body>
</html>