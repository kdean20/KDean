<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<html>
<head>
    <meta charset="utf-8">
    <title>Home Contacts</title>

    <link rel="canonical" href="https://getbootstrap.com/docs/4.4/examples/cover/">

    <!-- Bootstrap core CSS -->
<link href="https://getbootstrap.com/docs/4.4/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">


    <style>
      .bd-placeholder-img {
        font-size: 1.125rem;
        text-anchor: middle;
        -webkit-user-select: none;
        -moz-user-select: none;
        -ms-user-select: none;
        user-select: none;
      }

      @media (min-width: 768px) {
        .bd-placeholder-img-lg {
          font-size: 3.5rem;
        }
        
        body{
        background-color: #E0E0E0;
        }
        
        #background-image{
        height: 100px;
        width: 10%;
        background: url("assets/images/home.jpeg");
        }
      }
    </style>
    <!-- Custom styles for this template -->
    <link href="cover.css" rel="stylesheet">
  </head>
  
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
  <div class="container-fluid">
    <a class="navbar-brand" href="/">Home Contacts</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNav">
      <ul class="navbar-nav">
        <li class="nav-item">          
        </li>
        <li class="nav-item">
          <a class="nav-link" href="/login">Login</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="/register">Register</a>
        </li>        
      </ul>
    </div>
  </div>
</nav>


<body class="text-center">
    <div class="cover-container d-flex w-100 h-100 p-3 mx-auto flex-column">
  <header class="masthead mb-auto">
<!--   <header class="background-image"> -->
    <div class="inner">
      <h3 class="masthead-brand">Home Contacts</h3>      
    </div>
<!--     <div> <p> Visit Site</p></div> -->
  </header>

  <main role="main" class="inner cover">
  	<img src="assets/images/homeOriginal.jpeg" alt="" height="400" width="50%">
  
    <h1 class="cover-heading">Manage Contractors For Your Home</h1>
    <p class="lead">Login or Register to view contractor listings and manage your home contacts.</p>
    
  </main>

  <footer class="mastfoot mt-auto">
    <div class="inner">
      <p> &copy; Copyright 2022 Home Contacts.</p>
    </div>
  </footer>
</div>


</body>

</html>

