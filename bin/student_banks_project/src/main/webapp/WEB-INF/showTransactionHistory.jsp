<%@ page language="java" contentType="text/html; charset=US-ASCII" pageEncoding="US-ASCII" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
    <head>
        <title>Transaction</title>
    </head>
    <body>
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
    </body>
</html>