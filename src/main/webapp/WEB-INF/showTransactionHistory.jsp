<%@ page language="java" contentType="text/html; charset=US-ASCII" pageEncoding="US-ASCII" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
    <link href="../login.css" rel="stylesheet" type="text/css">
    <head>
        <title>Transaction</title>
    </head>
    <body>
        <div class="login-page">
        <h1>Transaction history</h1>
        <p><b>Available balance = ${balance}</b></p>
        <c:forEach var="abcd" items="${tranData}">
            <tr>
                <td>
                    <c:out value="${abcd}" />
                </td>
                <br/>
            </tr>
        </c:forEach>
        </div>
    </body>
</html>