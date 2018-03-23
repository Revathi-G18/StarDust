<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page isELIgnored="false" %>
<%@include file="Header.jsp"%>
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
<h4>Product Details</h4><br>
<c:forEach items="${listproduct}" var="product"> 
<form action="<c:url value='/cart/addtocart/${product.productId}'></c:url>">
<%-- <c:forEach items="${listproduct}" var="product">  --%>
 <div class="col-sm-4">
<img src="<c:url value="/resources/images/${product.productId}.jpg"/>" width="200" height="200" alt="Image Not Available"/>
<pre>

<b>Product Name:</b> ${product.productName }<br>
<b>Product Description:</b>${product.productDesc }<br>
<b>Price:</b>${product.price }<br>
 <b>Available Quantity:</b>${product.stock }<br>
<b>Category </b>${product.category.categoryName }<br>

<security:authorize access="hasRole('ROLE_USER')">
<b>Enter Quantity</b><input type="text" name="quantity" value="1">
<button type="submit"  value='Add To Cart'  class="btn btn-info btn-lg glyphicon" >
<span class="glyphicon-shopping-cart"></span>Add to Cart </button>
</security:authorize>
</pre>
</div>
</c:forEach>
</form>
</body>
</html>