<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Product</title>
<style>
@charset "ISO-8859-1";

* {
	box-sizing: border-box;
}

input[type=text], select, textarea {
	width: 100%;
	padding: 12px;
	border: 1px solid #ccc;
	border-radius: 4px;
	resize: vertical;
}

label {
	padding: 12px 12px 12px 0;
	display: inline-block;
}

input[type=submit] {
	background-color: #4CAF50;
	color: white;
	padding: 12px 20px;
	border: none;
	border-radius: 4px;
	cursor: pointer;
	float: right;
}

input[type=submit]:hover {
	background-color: #45a049;
}

.container {
	border-radius: 5px;
	background-color: #f2f2f2;
	padding: 20px;
}

.col-25 {
	float: left;
	width: 25%;
	margin-top: 6px;
}

.col-75 {
	float: left;
	width: 75%;
	margin-top: 6px;
}

/* Clear floats after the columns */
.row:after {
	content: "";
	display: table;
	clear: both;
}
.button {
  padding: 10px 20px;
  background-color: dodgerblue;
  border: 1px solid #ddd;
  color: white;
}

/* Responsive layout - when the screen is less than 600px wide, make the two columns stack on top of each other instead of next to each other */
@media screen and (max-width: 600px) {
	.col-25, .col-75, input[type=submit] {
		width: 100%;
		margin-top: 0;
	}
}
</style>

</head>
<body>

	<!-- <form action="/addproducts"> -->
	<!-- 	product id<input type="text" name="p_id"> <br>
						product-name<input type="text" name="p_name"> <br>
						company name<input type="text" name="p_companyname"> <br>
						price<input type="text" name="p_price"> <br> date of
						m<input type="text" name="p_dom"> <br> type<input
							type="text" name="p_type"> <br> merchant id<input
							type="text" name="p_merchantid"> <br> coupon id<input
							type="text" name="p_couponid"> <br> quantity<input
							type="text" name="p_quantity"> <br> <input
							type="submit" name="submit" formaction="success.jsp">
					</form> -->
<h3><center>Add product to inventory</center></h3>

	<div class="container">
		<form action="/addproducts">
			<div class="row">
				<div class="col-25">
					<label for="p_id">Product Id</label>
				</div>
				<div class="col-75">
					<input type="text" id="p_id" name="p_id" placeholder="product id..">
				</div>
			</div>
			<div class="row">
				<div class="col-25">
					<label for="p_name">Product Name</label>
				</div>
				<div class="col-75">
					<input type="text" id="p_name" name="p_name"
						placeholder="product name..">
				</div>
			</div>
			<div class="row">
				<div class="col-25">
					<label for="p_companyname">company name</label>
				</div>
				<div class="col-75">
					<select id="p_companyname" name="p_companyname">
						<option value="Capgemini">Capgemini</option>
						<option value="Other">Other</option>
						<option value="Third-Party">Third-Party</option>
					</select>
				</div>
			</div>
			<div class="row">
				<div class="col-25">
					<label for="p_price">Price</label>
				</div>
				<div class="col-75">
					<input type="text" id="p_price" name="p_price"
						placeholder="price..">
				</div>
			</div>
			<div class="row">
				<div class="col-25">
					<label for="p_dom">Price</label>
				</div>
				<div class="col-75">
					<input type="Date" id="p_dom" name="p_dom"
						placeholder="date of manufacture">
				</div>
			</div>
			<div class="row">
				<div class="col-25">
					<label for="p_type">Category</label>
				</div>
				<div class="col-25">
					<input type="text" id="p_type" name="p_type"
						placeholder="category....">
				</div>
			</div>

			<div class="row">
				<div class="col-25">
					<label for="p_merchantid">Merchant Id</label>
				</div>
				<div class="col-75">
					<input type="text" id="p_merchantid" name="p_merchantid"
						placeholder="merchant id..">
				</div>
			</div>

			<div class="row">
				<div class="col-25">
					<label for="p_couponid">Coupon Id</label>
				</div>
				<div class="col-75">
					<input type="text" id="p_couponid" name="p_couponid"
						placeholder="coupon id..">
				</div>
			</div>

			<div class="row">
				<div class="col-25">
					<label for="p_quantity">Quantity</label>
				</div>
				<div class="col-75">
					<input type="text" id="p_quantity" name="p_quantity"
						placeholder="quantity..">
				</div>
			</div>

			<div class="row">
				<button type="submit" class="button">Add</button>
			</div>
	</div>
	</form>
</body>
</html>
