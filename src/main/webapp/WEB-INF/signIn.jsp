<%@ page language="java" contentType="text/html; charset=US-ASCII" pageEncoding="US-ASCII" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link href="../login.css" rel="stylesheet" type="text/css">

<html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="http://www.thymeleaf.org"
        xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity3"
        xmlns:layout="http://www.ultraq.net.nz/thymeleaf/layout">

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
        <title>welcome</title>
            <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    </head>
   
   <title>Student Bank</title>
<body>
	
    <div class="login-page">
    <h1>Sign In</h1>
    <h3>Thanks for coming to our prestigous student bank, hope you have a nice day</h3>
    <div class="form">
    <form class="login-form" action="/signIn" method="post" submit ="">
      <input type="text" placeholder="userName"name="userName"/>
      <input type="password" placeholder="password" name="password"/>
      <button type="submit" value="Submit">login</button>
      <p class="message">Not registered? <a href="/registration">Create an account</a></p>
    </form>
  </div>
</div>
    </form>
</body>
</html>



