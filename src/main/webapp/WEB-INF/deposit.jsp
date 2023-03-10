<%@ page language="java" contentType="text/html; charset=US-ASCII" pageEncoding="US-ASCII" %>

<html>
    <title>
        welcome
    </title>
    <link href="../login.css" rel="stylesheet" type="text/css">
    <head>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    </head>
    <body>
        <div class="login-page ml-2">
        <h1>Deposit Funds</h1>
        <div>
            <form action="/depositMoney" method="POST">
                <h4>Enter Account ID :- <input name="accountID" type="number" /></h4>
                <h4>Enter Amount :- <input name="depositAmount" type="number" /></h4>
                <input type="submit" value="Submit" class="btn btn-dark" />
                <button class="btn btn-dark"><a href="/payment">Go Back to Payment Page</a></button>
            </form>
        </div>  
        </div>  
    </body>
</html>