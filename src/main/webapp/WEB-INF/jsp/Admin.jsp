<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
body { 
    background:url("bg.jpg");
    background-repeat: no-repeat;
    background-attachment: fixed; 
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin</title>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<%@ include file="/WEB-INF/jsp/Header.jsp" %>
<div class="container">
  <div class="row">
    <div class="col-md-4 col-md-offset-1">
      <div class="panel panel-default">
        <div class="panel-heading"> <strong class="">Insert</strong>
	    </div>
      <div class="panel-body">
<form class="form-horizontal" action="">
                        <div class="form-group">
                            <label for="Category_Id"></label>
                            <div class="col-sm-9">
                                <input type="Category_Id" class="form-control" id="Category_Id" placeholder="Category_Id" required="">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="Product_Id" ></label>
                            <div class="col-sm-9">
                                <input type="Product_Id" class="form-control" id="Produc_Id" placeholder="Product_Id" required="">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="Product_Desc" ></label>
                            <div class="col-sm-9">
                                <input type="Product_Desc" class="form-control" id="Produc_Desc" placeholder="Product_Desc" required="">
                            </div>
                        </div>
                        <div class="form-group last">
                            <div class="col-sm-offset-3 col-sm-9">
                                <button type="submit" class="btn btn-success btn-sm">Insert</button>
                                <button type="reset" class="btn btn-default btn-sm">Reset</button>
                            </div>
                        </div>
                    </form>
                    </div>
                    </div>
</div>
</div>
</div>
<div class="container">
  <div class="row">
    <div class="col-md-4 col-md-offset-1">
      <div class="panel panel-default">
        <div class="panel-heading"> <strong class="">Insert</strong>
	    </div>
      <div class="panel-body">
<form class="form-horizontal" action="">
                        <div class="form-group">
                            <label for="Category_Id"></label>
                            <div class="col-sm-9">
                                <input type="Category_Id" class="form-control" id="Category_Id" placeholder="Category_Id" required="">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="Product_Id" ></label>
                            <div class="col-sm-9">
                                <input type="Product_Id" class="form-control" id="Produc_Id" placeholder="Product_Id" required="">
                            </div>
                        </div>
                        <div class="form-group last">
                            <div class="col-sm-offset-3 col-sm-9">
                                <button type="Delete" class="btn btn-success btn-sm">Delete</button>
                                <button type="Retrieve" class="btn btn-default btn-sm">Retrieve</button>
                        </div>
                        </div>
                    </form>
                    </div>
                    </div>
</div>
</div>
</div>
</body>
</html>

