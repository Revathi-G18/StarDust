<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<%@include file="Header.jsp"%>
<div class="Container">
<div class="row">
<div class="col-md-4">
<img src="<c:url value='/resources/image/HarryPotter_Doodle.jpg'/>" style="width:80%;">
<center><h4>HarryPotter Doodle Mug</h4>
<input type="submit" value="buy now"></center>
</div>
<div class="col-md-4">
<img src="<c:url value='/resources/image/Friends_Doodle.jpg'/>"style="width:80%;">
</div>
<div class="col-md-4">
<img src="<c:url value='/resources/image/TypesofCoffee.jpg'/>"style="width:80%;">
</div>
</div>
</div>
</body>
</html>