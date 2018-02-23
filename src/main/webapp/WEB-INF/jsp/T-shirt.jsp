<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>T-shirts</title>
</head>
<body>
<%@ include file="/WEB-INF/jsp/Header.jsp" %>
<div class="Container">
<div class="row">
<div class="col-md-3">
<img src="<c:url value='/resources/image/tvs.jpg'/>" style="width:80%;">
</div>
<div class="col-md-3">
<img src="<c:url value='/resources/image/TEE Society.jpg'/>"style="width:80%;">
</div>
<div class="col-md-3">
<img src="<c:url value='/resources/image/shutup.jpg'/>"style="width:80%;">
</div>
<div class="col-md-3">
<img src="<c:url value='/resources/image/shutup.jpg'/>"style="width:80%;">
</div>
</div>
</div>
</body>
</html>