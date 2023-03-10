<%@ page language="java" contentType="text/html; charset=US-ASCII" pageEncoding="US-ASCII" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


    <html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="http://www.thymeleaf.org"
        xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity3"
        xmlns:layout="http://www.ultraq.net.nz/thymeleaf/layout">
        <link href="../login.css" rel="stylesheet" type="text/css">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
        <title>Get Balance</title>
        <link href="../login.css" rel="stylesheet" type="text/css">    
            <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    </head>

    <body class="ml-2 login-page">
        <h1>Balance</h1>
        <div class="login-page">
            <form action="/getBalance" method="POST">
                <h4>Enter Account ID :- <input name="accountNum" type="number" /></h4>
                <input type="submit" value="Submit" class="btn btn-dark"/>
                <button><a href="/payment" class="btn btn-dark">Go Back to Payment Page</a></button>
            </form>
        </div>
    </body>

    </html>