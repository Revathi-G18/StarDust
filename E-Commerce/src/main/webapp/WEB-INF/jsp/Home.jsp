<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<html>
<head>
<%@include file="Header.jsp"%> 
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container-fluid">  
  <div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
      <li data-target="#myCarousel" data-slide-to="3"></li>
      <li data-target="#myCarousel" data-slide-to="4"></li>
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner">
      <div class="item active">
       <img src="<c:url value='/resources/images/t-shirt%20jmbotron.jpg'/>" alt="T-Shirts" width=1670 height="600px" />      
      </div>
      
      <div class="item">
        <img src="<c:url value='/resources/images/joey%20food.jpg'/>" alt="joey_food" width=1670 height="600px"/>
      </div>
    
      <div class="item">
         <img src="<c:url value='/resources/images/mugs.jpg'/>" alt="Mugs" width=1670  height="600px"/>
      </div>
      <div class="item">
        <img src="<c:url value='/resources/images/Posters.jpg'/>" alt="Poster" width=1670 height="600px"/>
      </div>
      <div class="item">
        <img src="<c:url value='/resources/images/Coaster.jpg'/>" alt="Coaster" width=1670 height="600px"/>
      </div>
    </div>

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
</div>


<%-- <c:url value="/all/getallproducts" var="productsUrl"></c:url>
<a href="${productsUrl}">Browse all products</a>
<a href="add">ADD</a>
<a href="category">Category</a>
<a href="Product">Product</a> --%>
<%@include file="Footer.jsp"%>
</body>
</html>
