<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<html>
<head>
<meta charset="utf-8">
<title>Home Contacts</title>

<link rel="canonical"
	href="https://getbootstrap.com/docs/4.4/examples/cover/">

<!-- Bootstrap core CSS -->
<link
	href="https://getbootstrap.com/docs/4.4/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">


<style>
.bd-placeholder-img {
	font-size: 1.125rem;
	text-anchor: middle;
	-webkit-user-select: none;
	-moz-user-select: none;
	-ms-user-select: none;
	user-select: none;
}

@media ( min-width : 768px) {
	.bd-placeholder-img-lg {
		font-size: 3.5rem;
	}
}

theead{
padding: 30px 10px;
}

.mybutton{
box-shadow: 0px 10px 14px -7px #276873;
	background:linear-gradient(to bottom, #599bb3 5%, #408c99 100%);
	background-color:#599bb3;
	border-radius:8px;
	display:inline-block;
	cursor:pointer;
	color:#ffffff;
	font-family:Arial;
	font-size:10px;
	font-weight:bold;
	padding:13px 32px;
	text-decoration:none;
	text-shadow:0px 1px 0px #3d768a;
}

.mybutton:hover{
	background:linear-gradient(to bottom, #408c99 5%, #599bb3 100%);
	background-color:#408c99;
}

.header {
		margin-bottom: 100px;
		height: 100px;
	}
</style>
<!-- Custom styles for this template -->
<link href="cover.css" rel="stylesheet">
</head>


<body class="text-center">
	<div class="cover-container d-flex w-100 h-100 p-3 mx-auto flex-column">
		<header class="header">
			<div class="inner">
				<h3 class="masthead-brand">Contacts List</h3>
			</div>
		</header>

		<main role="main" class="inner cover">
			<div class="row align-items-end">
				<div class="col">
					<h5>Contractor Name</h5>
				</div>
				<div class="col">
					<h5>Phone Number</h5>
				</div>
				<div class="col">
					<h5>Street Address</h5>
				</div>
				<div class="col">
					<h5>City</h5>
				</div>
				<div class="col">
					<h5>State</h5>
				</div>
				<div class="col">
					<h5>Zip</h5>
				</div>
				<div class="col">
					<h5>Notes</h5>
				</div>
				<div class="col">
					<a href="#" class="myButton">Delete Contact</a>
				</div>
				<div class="col">
					<a href="#" class="myButton">Update Notes</a>
				</div>
				
			</div>	
			
			<div>
			<table>
<!-- 				<thead> -->
<!-- 					<tr> -->
<!-- 						<th>Contractor Name</th> -->
<!-- 						<th>Contractor Phone</th> -->
<!-- 						<th>Street Address</th> -->
<!-- 						<th>City</th> -->
<!-- 						<th>State</th> -->
<!-- 						<th>Zip</th> -->
<!-- 						<th>Notes</th> -->
				<tbody>
					<c:forEach items="${contactsList}" var="item">
					<tr>
						<td>${item.contactsId}${item.user.email}</td>
					</tr>
					</c:forEach>

				</tbody>

			</table> 
			
			</div>

<%-- 			<c:forEach items="${contactsList}" var="item">
				<p>${item.contactsId}${item.user.email}</p>
<!-- 				<br> -->

			</c:forEach> --%>
			
		
		</main>

		<footer class="mastfoot mt-auto">
			<div class="innerfoot">
				<p>&copy; Copyright 2022 Home Contacts.</p>
			</div>
		</footer>
	</div>


</body>

</html>
