<%@ page language="java" contentType="text/html; charset=US-ASCII" pageEncoding="US-ASCII" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


    <html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="http://www.thymeleaf.org"
        xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity3"
        xmlns:layout="http://www.ultraq.net.nz/thymeleaf/layout">

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
        <title>Transaction History</title>
            <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    </head>

    <body>
        <h1>Transaction History</h1>
        <div>
            <form action="/transactionHistoryData" method="POST">
                <h4>Select Account :- <input name="accountNum" type="number" /></h4>
                <input type="submit" value="Submit" />
                <button><a href="/payment">Go Back to Payment Page</a></button>
            </form>
        </div>
    </body>

    </html>