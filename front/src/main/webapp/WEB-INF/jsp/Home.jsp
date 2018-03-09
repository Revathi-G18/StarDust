<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%> --%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<html>
<head>
<%@include file="Header.jsp"%> 
</head>
<body>

<h2>Hello World!</h2>
<c:url value="/all/getallproducts" var="productsUrl"></c:url>
<a href="${productsUrl}">Browse all products</a>
<a href="add">ADD</a>
<a href="category">Category</a>
<a href="Product">Product</a>
<%@include file="Footer.jsp"%>
</body>
</html>
