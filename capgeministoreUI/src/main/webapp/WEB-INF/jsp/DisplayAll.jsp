<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- <form action="/ListofAllMerchants"> -->

<a href="/ListofAllMerchants">display</a>
<!-- <input type="submit" value="display"> -->
<!-- </form> -->
</body>
</html> --%>

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

<title>Merchants</title>

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
		<h1 class="h3 mb-3 font-weight-normal main-heading">All Merchants</h1>
		<table class="table">
			<tr>
				<th class="trow">Id</th>
				<th class="trow">Name</th>
				<th class="trow">Type</th>
				<th class="trow">Organisation</th>
				
			</tr>
			<c:forEach items="${alldirmers}" var="obj1">
			<tr>
				<td class="trow">${obj1.id}</td>
				<td class="trow">${obj1.name}</td>
				<td class="trow">${obj1.type}</td>
				<td class="trow">${obj1.organisation}</td>
				
			</tr>
			 </c:forEach> 
		</table>

	</div>


</body>
</html>