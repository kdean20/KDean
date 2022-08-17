<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author"
	content="Mark Otto, Jacob Thornton, and Bootstrap contributors">
<meta name="generator" content="Hugo 0.88.1">
<title>Home Contacts Login</title>

<link rel="canonical"
	href="https://getbootstrap.com/docs/5.1/examples/sign-in/">
<!-- Bootstrap core CSS -->
<link
	href="https://getbootstrap.com/docs/4.4/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">



<!-- Bootstrap core CSS -->
<link href="../assets/dist/css/bootstrap.min.css" rel="stylesheet">

<style>
.bd-placeholder-img {
	font-size: 1.125rem;
	text-anchor: middle;
	-webkit-user-select: none;
	-moz-user-select: none;
	user-select: none;
}

@media ( min-width : 768px) {
	.bd-placeholder-img-lg {
		font-size: 3.5rem;
	}
}

.form-row{
margin-left: 500px;
}
</style>


<!-- Custom styles for this template -->
<link href="login.css" rel="stylesheet">
</head>
<body class="text-center">

	<main class="form-signin">
		<form:form method="POST" action="/login" modelAttribute="users">
			<!-- <img class="mb-4" src="../assets/brand/bootstrap-logo.svg" alt=""
				width="72" height="57"> -->
			<h1 class="h3 mb-3 fw-normal">Please sign in</h1>
			<div class="form-row">
				<div class="form-group col-md-6">
					<form:input path="email" type="email" class="form-control"
						id="inputEmail4" placeholder="" />
					<label for="inputEmail4">Email address</label>
				</div>
			</div>

			<div class="form-row">
				<div class="form-group col-md-6">
					<form:input path="password" type="password" class="form-control"
						id="inputPassword4" placeholder="" />
					<label for="inputPassword4">Password</label>
				</div>
			</div>			
			<button class="w-25 btn btn-lg btn-primary" type="submit">Sign
				in</button>
			<div><b>${error}</b></div>
			<!-- <p class="mt-5 mb-3 text-muted">&copy; 2017–2021</p> -->
		</form:form>
	</main>



</body>
</html>
