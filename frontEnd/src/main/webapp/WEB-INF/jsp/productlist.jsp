<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:forEach items="${productsAttr}" var="pro">
<table>
<tr><td>Product_Id</td>
<td>Product_Name</td>
<td>Price</td>
<td>Stock</td></tr>
<tr><td>${pro.productId}</td>
<td>${pro.productName }</td>
<td>${pro.price }</td>
<td>${pro.stock}</td></tr>
</table>
</c:forEach>
</body>
</html>