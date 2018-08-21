<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">
<link rel="icon" href="../../../../favicon.ico">

<title>Scheduled Sessions</title>

<!-- Bootstrap core CSS -->
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
<!-- Custom styles for this template -->
<style>
.header {
	background-color: #f1f1f1;
	padding: 10px;
	text-align: center;
}

.navbar {
	overflow: hidden;
	background-color: #333;
	font-family: Arial, Helvetica, sans-serif;
}

.navbar a {
	float: left;
	font-size: 16px;
	color: white;
	text-align: center;

	text-decoration: none;
}</style>
</head>

<body class="text-center">
	<div class="card-3">

<div class="navbar">
		<a href="DirectMerchants">Direct Merchants</a>
		

	</div>
		<h1 class="h3 mb-3 font-weight-normal main-heading">All products</h1>
		<table class="table">
			<tr>
				<th class="trow">Id</th>
				<th class="trow">Name</th>
				<th class="trow">Model</th>
				<th class="trow">Price</th>
				
			</tr>
			<c:forEach items="${dirprods}" var="obj2">
			<tr>
				<td class="trow">${obj2.id}</td>
				<td class="trow">${obj2.name}</td>
				<td class="trow">${obj2.model}</td>
				<td class="trow">${obj2.price}</td>
				
			</tr>
			 </c:forEach> 
		</table>

	</div>


</body>
</html>