<%@ page language="java" contentType="text/html; charset=US-ASCII" pageEncoding="US-ASCII" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link href="../login.css" rel="stylesheet" type="text/css">


    <html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="http://www.thymeleaf.org"
        xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity3"
        xmlns:layout="http://www.ultraq.net.nz/thymeleaf/layout">

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">   
   		<title>Student Bank Dashboard</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    </head>
 
<body>
    <div class="ml-2 login-page">
        <p> Welcome to Student Bank  ${user.username} </p>
        <p> Checking Account Balance: ${account.accountBalance} </p>
        <button onclick="location.href='/logout'" type="button" class="btn btn-dark">
         Logout</button>
         <button onclick="location.href='/payment'" type="button" class="btn btn-dark">
         Payment</button>
    </div>
</body>
</html>

