<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page isELIgnored="false" %>
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
<div class="row" >
<c:forEach items="${listproduct}" var="product"> 
 <div class="col-sm-4">
      <img src="<c:url value="/resources/images/${product.productId}.jpg"/>" width="200" height="200"/>
      <td>${product.productName}</td>
	  <td>${product.price}</td>
	  <security:authorize access="hasRole('ROLE_USER')">
      		<li><a href="<c:url value="/cart/addtocart/${product.productId }"/>"><span class="glyphicon glyphicon-shopping-cart"></span>Add To Cart</a></li>
	  </security:authorize>
	  
	  <%-- <td><a href="<c:url value=""/>">Add to Cart</a> --%>
	  </td>
	  </div>
  </div>
		<%-- <tr>
			<img src="<c:url value="/resources/images/${product.productId}.jpg"/>" width="200" height="200"/>
			<td>${product.productName}</td>
			<td>${product.price}</td>
			<td><a href="<c:url value=""/>">view info</a>
				
			</td>
		</tr> --%>
	</c:forEach></body>
</html>