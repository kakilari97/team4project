<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/deleteproduct">
Enter Id:<input type="text" name="p_id"/><br>
<input type="submit" value="Delete"/>
</body>
</html> --%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>

<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css" href="header2.css" />
<style>
body {font-family: Arial, Helvetica, sans-serif;}
* {box-sizing: border-box;}

.form-inline {  
  display: flex;
  flex-flow: row wrap;
  align-items: center;
}

.form-inline label {
  margin: 5px 10px 5px 0;
}

.form-inline input {
  vertical-align: middle;
  margin: 5px 10px 5px 0;
  padding: 10px;
  background-color: #fff;
  border: 1px solid #ddd;
}

.form-inline button {
  padding: 10px 20px;
  background-color: dodgerblue;
  border: 1px solid #ddd;
  color: white;
}

.form-inline button:hover {
  background-color: royalblue;
}

@media (max-width: 800px) {
  .form-inline input, .form-inline .button {
    margin: 10px 0;
  }
  
  .form-inline {
    flex-direction: column;
    align-items: stretch;
  }
}
</style>
</head>
<body >

<h2>Show product from Inventory</h2>

<form class="form-inline" action="/productsbyid">
  <label for="Product id">Product Id:</label>
  <input type="text" id="p_id" placeholder="Enter product id" name="p_id">
  
  <button type="submit" class="button">show</button>
</form>



		<%-- <table class="table">
			<tr>
				<th class="trow">Id</th>
				<th class="trow">Name</th>
				<th class="trow">Company name</th>
				<th class="trow">Price</th>
			</tr>
			<c:forEach items="${prod}" var="obj">
			<tr>
				<td class="trow">${obj.p_id}</td>
				<td class="trow">${obj.p_name}</td>
				<td class="trow">${obj.p_companyname}</td>
			    <td class="trow">${obj.p_price}</td>
				
			</tr>
			 </c:forEach> 
		</table>
 --%>
	</div>


</body>
</html>
</body>
</html>
