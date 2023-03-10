<%@ page language="java" contentType="text/html; charset=US-ASCII" pageEncoding="US-ASCII" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


    <html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="http://www.thymeleaf.org"
        xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity3"
        xmlns:layout="http://www.ultraq.net.nz/thymeleaf/layout">
        <link href="../login.css" rel="stylesheet" type="text/css">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
        <title>welcome</title>
            <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    </head>
    <title>
        welcome
    </title>

    <body>
        <div class="login-page">
        <h1>Send Money</h1>
        <div>
            <form action="/makeTransaction" method="POST" submit="">
                <h4>Enter Source Account ID :-</h4> <input name="sAcc" type="text" /><br><br>
                <h4>Enter Destination Account ID:-</h4> <input name="dAcc" type="text" /><br><br>
                <h4>Enter Transaction Amount ID:-</h4> <input name="tAmount" type="number" /><br><br>
                <input type="submit" value="Submit" />
                <button><a href="/payment">Go Back to Payment Page</a></button>
            </form>
        </div>
        </div>
    </body>

    </html>