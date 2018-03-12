<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<%@include file="Header.jsp" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register</title>
<style>
.register
{
font-size:50px;
}
</style>
</head>
<body>
<c:url value='/all/registercustomer' var="url"></c:url>
<form:form action="${url}" modelAttribute="customer">
<div class="boxed" style="border:1px solid">
<span class="register">Enter Customer Details</span>
<div class="form-group">
<form:label path="FirstName">Enter Firstname</form:label>
<form:input path="FirstName"  class="form-control"></form:input></div>

<div class="form-group">
<form:label path="LastName">Enter Lastname</form:label>
<form:input path="LastName"  class="form-control"></form:input></div>

<div class="form-group">
<form:label path="Email">Email</form:label>
<form:input path="Email" type="email" class="form-control" title="Please enter valid email address"></form:input></div>

<div class="form-group">
<form:label path="Phone">PhoneNumber</form:label>
<form:input path="Phone"  class="form-control"></form:input></div></div>

<div class="boxed" style="border:1px solid">
<span class="register">Enter login credentials</span>
<div class="form-group">
<form:label path="user.username">Username</form:label>
<form:input path="user.username"  class="form-control"></form:input></div>

<div class="form-group">
<form:label path="user.userpassword">Password</form:label>
<form:input path="user.userpassword" type="password" class="form-control"></form:input></div></div>

<div class="boxed" style="border:1px solid">
<span class="register">Enter Billing Address</span>
<div class="form-group">
<form:label path="billingadd.apartmentnumber">Apartment Number</form:label>
<form:input path="billingadd.apartmentnumber"  class="form-control"></form:input></div>

<div class="form-group">
<form:label path="billingadd.streetname">Streetname</form:label>
<form:input path="billingadd.streetname"  class="form-control"></form:input></div>

<div class="form-group">
<form:label path="billingadd.city">City</form:label>
<form:input path="billingadd.city"  class="form-control"></form:input></div>

<div class="form-group">
<form:label path="billingadd.State">State</form:label>
<form:input path="billingadd.State"  class="form-control"></form:input></div>

<div class="form-group">
<form:label path="billingadd.zipcode">Zipcode</form:label>
<form:input path="billingadd.zipcode"  class="form-control"></form:input></div></div>

<div class="boxed" style="border:1px solid">
<span class="register">Enter Shipping Address</span>
<div class="form-group">
<form:label path="shippingadd.apartmentnumber">Apartment Number</form:label>
<form:input path="shippingadd.apartmentnumber"  class="form-control"></form:input></div>

<div class="form-group">
<form:label path="shippingadd.streetname">Streetname</form:label>
<form:input path="shippingadd.streetname"  class="form-control"></form:input></div>

<div class="form-group">
<form:label path="shippingadd.city">City</form:label>
<form:input path="shippingadd.city"  class="form-control"></form:input></div>

<div class="form-group">
<form:label path="shippingadd.State">State</form:label>
<form:input path="shippingadd.State"  class="form-control"></form:input></div>

<div class="form-group">
<form:label path="shippingadd.zipcode">Zipcode</form:label>
<form:input path="shippingadd.zipcode"  class="form-control"></form:input></div></div>

<input type="submit" value="Register"></form:form>

</body>
</html>