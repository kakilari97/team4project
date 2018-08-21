
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
	padding: 14px 16px;
	text-decoration: none;
}

.dropdown {
	float: left;
	overflow: hidden;
}

.dropdown .dropbtn {
	font-size: 16px;
	border: none;
	outline: none;
	color: white;
	padding: 14px 16px;
	background-color: inherit;
	font-family: inherit;
	margin: 0;
}

.navbar a:hover, .dropdown:hover .dropbtn {
	background-color: blue;
}

.dropdown-content {
	display: none;
	position: absolute;
	background-color: #f9f9f9;
	min-width: 160px;
	box-shadow: 0px 8px 16px 0px rgba(0, 0, 0, 0.2);
	z-index: 1;
}

.dropdown-content a {
	float: none;
	color: black;
	padding: 12px 16px;
	text-decoration: none;
	display: block;
	text-align: left;
}

.dropdown-content a:hover {
	background-color: #ddd;
}

.dropdown:hover .dropdown-content {
	display: block;
}
</style>
</head>
<body>
	<div class="header">
		<h1>Manage Merchants</h1>
	</div>
	<div class="navbar">
		<a href="index">Inventory</a>
		<div class="dropdown">
			<button class="dropbtn">
				Merchants <i class="fa fa-caret-down"></i>
			</button>
			<div class="dropdown-content">
				<a href="DirectMerchants">Direct Merchant</a> <a
					href="ThirdPartyMerchants2">Third Party Merchant</a> 
			</div>
		</div>

	</div>



<center>
<a href="mindex"><h3><font color="black">Add a merchant</font></h3></a>
<a href="Delete"><h3><font color="black">Delete a merchant</font></h3></a>
<a href="Display"><h3><font color="black">Show a merchant</font></h3></a>
<a href="/ListofAllMerchants"><h3><font color="black">Display all merchant</font></h3></a>
<a href="ManageProducts"><h3><font color="black">Manage Products</font></h3></a>
</center>
</body>
</html>
</body>
</html>