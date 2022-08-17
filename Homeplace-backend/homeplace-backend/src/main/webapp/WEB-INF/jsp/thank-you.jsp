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
</style>
<!-- Custom styles for this template -->
<link href="cover.css" rel="stylesheet">
</head>


<body class="text-center">
	<div class="cover-container d-flex w-100 h-100 p-3 mx-auto flex-column">
		<header class="masthead mb-auto">
			<div class="inner">
				<h3 class="masthead-brand">Home Contacts</h3>

			</div>
		</header>

		<main role="main" class="inner cover">
			<h1 class="cover-heading">Thank You for registering!</h1>
			<p class="lead">Thank you ${newUsers.firstName}
				${newUsers.lastName} for signing up for our application.</p>
			<p class="lead">You can sign into your account with email
				${newUsers.email}.</p>
			<p class="lead">
				<a class="glyphicon glyphicon-log-in" href="/login"
					class="btn btn-lg btn-secondary">Login</a>
			</p>
		</main>

		<footer class="mastfoot mt-auto">
			<div class="innerfoot">
				<p>&copy; Copyright 2022 Home Contacts.</p>
			</div>
		</footer>

	</div>


</body>

</html>
