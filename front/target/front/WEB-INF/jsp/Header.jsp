<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
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
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
      <a class="navbar-brand" href="#">StarDust</a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
      <c:forEach items="${categories}" var="c">
      <c:url value="all/viewallproducts?searchCondition=${c.categoryId}" var="url"></c:url>
      <li>
      <a href="${url}" >${c.categoryName } </a>
       </li>
      </c:forEach>
            
      <!--   <li class="active"><a href="#"><span class="glyphicon glyphicon-home"></span>Home</a></li> -->
        <!-- <li><a href="tshirt">T-Shirts</a></li>
        <li><a href="mobile covers">Mobile Covers</a></li>
        <li><a href="mugs">Mugs</a></li>
        <li><a href="posters">Posters</a></li>
        <li><a href="backpacks">Backpacks</a></li>
        <li><a href="coasters">Coasters</a></li> -->
      </ul>
      
      <!-- <ul class="nav navbar-nav navbar-right">
        <li><a href="Login"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
        <li><a href="all/registrationform"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>        
      </ul> -->
      <ul class="nav navbar-nav navbar-right">
      <security:authorize access="hasRole('ROLE_USER')">
      		<li><a href="/cart/getcart"><span class="glyphicon glyphicon-shopping-cart"></span>Cart</a></li>
			<%-- <li><a href="<c:url value='/cart/getcart'></c:url>">cart</a></li> --%>
			</security:authorize>
			<c:if test="${pageContext.request.userPrincipal.name==null }">
			<li><a href="Login"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
			<li><a href="all/registrationform"><span class="glyphicon glyphicon-user"></span>Sign Up</a></li>
			</c:if>
			<c:if test="${pageContext.request.userPrincipal.name!=null }">
			<li><a href="">Welcome ${pageContext.request.userPrincipal.name}</a></li>
			<li><a href="/j_spring_security_logout"><span class="glyphicon glyphicon-log-out"></span> Logout</a></li>
			</c:if>
			</ul>
    </div>
  </div>
</nav>
</body>
</html>