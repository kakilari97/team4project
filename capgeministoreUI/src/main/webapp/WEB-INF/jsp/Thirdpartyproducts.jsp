<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
body {
	margin: 0;
}

/* Style the header */
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
}

</style>
</head>
<body>
<div class="header">
  <h1>Manage Products</h1>
</div>
<div class="navbar">
		<a href="ThirdPartyMerchants2">Third Party Merchants</a>
		</div>
<center>
<a href="addthirdpartyproducts"><h3><font color="black">Add a Product</font></h3></a>
<a href="deletethirdpartyproduct"><h3><font color="black">Delete a Product</font></h3></a>
<a href="displaythirdpartyproduct"><h3><font color="black">Show a Product</font></h3></a>
<a href="/ListofAllThirdPartyProducts"><h3><font color="black">Display all Products</font></h3></a>
</center>
</body>
</html>