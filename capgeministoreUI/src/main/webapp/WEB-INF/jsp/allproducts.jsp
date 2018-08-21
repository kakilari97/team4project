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
		<a href="ProductOptions">Product Options</a>
		

	</div>
		<h1 class="h3 mb-3 font-weight-normal main-heading">All products</h1>
		<table class="table">
			<tr>
				<th class="trow">Id</th>
				<th class="trow">Name</th>
				<th class="trow">merchant</th>
				<th class="trow">price</th>
				<th class="trow">dom</th>
				<th class="trow">type</th>
				<th class="trow">merchant id</th>
				<th class="trow">coupon id</th>
				<th class="trow">quantity</th>
			</tr>
			<c:forEach items="${allprods}" var="obj">
			<tr>
				<td class="trow">${obj.p_id}</td>
				<td class="trow">${obj.p_name}</td>
				<td class="trow">${obj.p_companyname}</td>
				<td class="trow">${obj.p_price}</td>
				<td class="trow">${obj.p_dom}</td>
			    <td class="trow">${obj.p_type}</td>
				<td class="trow">${obj.p_merchantid}</td>
				<td class="trow">${obj.p_couponid}</td>
			    <td class="trow">${obj.p_quantity}</td>
				
			</tr>
			 </c:forEach> 
		</table>

	</div>


</body>
</html>