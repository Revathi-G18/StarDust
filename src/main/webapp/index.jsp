<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>StarDust.in</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<%@ include file="/WEB-INF/jsp/Header.jsp" %>
<div class="container-fluid">  
  <div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
      <li data-target="#myCarousel" data-slide-to="3"></li>
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner">
      <div class="item active">
      <a href="T-shirt">
       <img src="<c:url value='/resources/image/t-shirt.jpg'/>" alt="T-Shirts" width=1670 height="600px" />
       </a>
      </div>

      <div class="item">
        <img src="<c:url value='/resources/image/Backpacks.jpg'/>" alt="Backpacks" width=1670 height="600px">
      </div>
    
      <div class="item">
         <img src="<c:url value='/resources/image/intro.jpg'/>" alt="Introduction" width=1670  height="600px">
      </div>
      <div class="item">
        <img src="<c:url value='/resources/image/whistle.jpg'/>" alt="Backpacks" width=1670 height="600px">
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
      
  <div class="row">
      <img src="<c:url value='/resources/image/Wristbands.jpg'/>" alt="Wristbands" style="width:100%;">
  </div>

<div class="row">
      <img src="<c:url value='/resources/image/tote bags.jpg'/>" alt="Tote bags" style="width:100%;">
  </div>

<div class="row">
      <img src="<c:url value='/resources/image/Coaster.jpg'/>" alt="Coaster" style="width:100%;">
  </div>

<div class="row">
      <img src="<c:url value='/resources/image/Hoodies.jpg'/>" alt="Hoodies" style="width:100%;">
  </div>

<div class="row">
      <img src="<c:url value='/resources/image/badges.jpg'/>" alt="badges" style="width:100%;">
  </div>

<div class="row">
      <img src="<c:url value='/resources/image/mugs.jpg'/>" alt="mugs" style="width:100%;">
  </div>
  
<div class="row">
      <img src="<c:url value='/resources/image/Notebooks.jpg'/>" alt="Notebooks" style="width:100%;">
  </div>
  
  <div class="row">
      <img src="<c:url value='/resources/image/Posters.jpg'/>" alt="posters" style="width:100%;">
  </div>
  
  <div class="row">
      <img src="<c:url value='/resources/image/Stickers.jpg'/>" alt="Stickers" style="width:100%;">
  </div>  
</body>
</html>