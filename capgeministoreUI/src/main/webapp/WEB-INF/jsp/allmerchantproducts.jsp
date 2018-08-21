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

</head>

<body class="text-center">
	<div class="card-3">


		<h1 class="h3 mb-3 font-weight-normal main-heading">All products</h1>
		<table class="table">
			<tr>
				<th class="trow">Id</th>
				<th class="trow">Name</th>
				<th class="trow">model</th>
				<th class="trow">price</th>
				
			</tr>
			<c:forEach items="${merprods}" var="obj">
			<tr>
				<td class="trow">${obj.id}</td>
				<td class="trow">${obj.p_name}</td>
				<td class="trow">${obj.p_model}</td>
				 <td class="trow">${obj.p_price}</td>
				
				
				
			</tr>
			 </c:forEach> 
		</table>

	</div>


</body>
</html>