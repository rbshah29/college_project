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
    <div class="login-page ml-2">
	<h1>Register</h1>
    <form class="login-form" action="/registration_sub" method="POST"submit="">
    	<p>Username: <input type="text" name="userName" /></p>
        <p>First Name: <input type="text" name="firstName" /></p>
        <p>Last name: <input type="text" name="lastName" /></p>
        <p>Middle Name: <input type="text" name="middleName" /></p>
        <p>Password: <input type="text" name="pass" /></p>
        <p>Address: <input type="text" name="address" /></p>
        <p>City: <input type="text" name="city" /></p>
        <p>Postal Code: <input type="text" name="postalCode" /></p>
        <p>Phone Number: <input type="text" name="phoneNumber" /></p>
        <p>Date of birth: <input type="text" name="dob" /></p>
        <p>Email: <input type="text" name="email" /></p>
        <p><input type="submit" value="Submit" class="btn btn-dark"/> <input type="reset" value="Reset" class="btn btn-dark"/></p>
    </form>
     </div>
</body>
</html>


   