<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page session="false" %>
<html>
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<br>
<div class="container" style="width:400px;background-color:rgb(230, 230, 255)">
<h1>
	Customer Registration
</h1>
<c:url var="addAction" value="/customer/add" ></c:url>

<form action="${addAction}" commandName="customer"  method="post">
<div>&nbsp;</div>
	<div class="form-group">
      <label for="firstName">FIRST NAME</label>
      <input type="text" class="form-control" name="firstName" placeholder="Enter First Name">
    </div>
    <div>&nbsp;</div>
    <div class="form-group">
      <label for="lastName">LAST NAME</label>
      <input type="text" class="form-control" name="lastName" placeholder="Enter Last Name">
    </div>
    <div>&nbsp;</div>
    <div class="form-group">
      <label for="phoneNo">PHONE</label>
      <input type="text" class="form-control" name="phoneNo" placeholder="Enter Phone Number">
    </div>
    <div>&nbsp;</div>
	<div class="form-group">
      <label for="email">EMAIL</label>
      <input type="email" class="form-control" name="email" placeholder="Enter email">
    </div>
    <div>&nbsp;</div>
    <input type="submit" class="btn btn-default" value="Register">
</form>
</div>

</body>
</html>