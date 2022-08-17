<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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
	body {
		background-color: #E0E0E0;
	}
	#background-image {
		height: 100px;
		width: 10%;
		background: url("assets/images/home.jpeg");
	}
	.header {
		margin-bottom: 100px;
		height: 100px;
	}
	.innerfoot {
		margin-top: 400px;
	}
}
</style>
<!-- Custom styles for this template -->
<link href="cover.css" rel="stylesheet">
</head>

<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
	<div class="container-fluid">
		<a class="navbar-brand" href="/">Home Contacts</a>
		<button class="navbar-toggler" type="button" data-bs-toggle="collapse"
			data-bs-target="#navbarNav" aria-controls="navbarNav"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarNav">
			<ul class="navbar-nav">
				<li class="nav-item"></li>
				<li class="nav-item"><a class="nav-link" href="/list-contacts">View
						Contacts</a></li>
				<!-- 				<li class="nav-item"><a class="nav-link" href="/register">View -->
				<!-- 						Contractor Listings</a></li> -->
			</ul>
		</div>
	</div>
</nav>


<body class="text-center">
	<div class="cover-container d-flex w-100 h-50 p-3 mx-auto flex-column">
		<header class="header">
			<!--   <header class="background-image"> -->
			<div class="inner">
				<h3 class="masthead-brand">Users Home Page</h3>
			</div>
			<!--     <div> <p> Visit Site</p></div> -->
		</header>

		<main role="main" class="inner cover">

			<div class="row align-items-end">
				<div class="col">
					<img src="assets/images/homeOriginal.jpeg" alt="" height="200"
						width="100%">
					<p>View All Contractors</p>
				</div>
				<div class="col">
					<img src="assets/images/Plumbing photo.jpg" alt="" height="200"
						width="100%">
					<p>View Plumbing Contractors</p>
				</div>
				<div class="col">
					<img src="assets/images/landscaping.jpg" alt="" height="200"
						width="100%">
					<p>View Landscaping Contractors</p>
				</div>
				<div class="col">
					<img src="assets/images/carpentry.jpg" alt="" height="200"
						width="100%">
					<p>View Carpentry Contractors</p>
				</div>
				<div class="col">
					<img src="assets/images/painter.jpg" alt="" height="200"
						width="100%">
					<p>View Painting Contractors</p>
				</div>

			
		
		</div>

		</main>

		<footer class="mastfoot mt-auto">
			<div class="innerfoot">
				<p>&copy; Copyright 2022 Home Contacts.</p>
			</div>
		</footer>


	</div>


</body>

</html>

