<!DOCTYPE HTML>
<html xmlns:th="https://www.thymeleaf.org">
<head> 
    <title>Student Bank</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
</head>
<body>
	<h1>Form</h1>
    <form action="#" th:action="@{/registration}" th:object="${registration}" method="post">
    	<p>Username: <input type="text" th:field="*{user}" /></p>
        <p>First Name: <input type="text" th:field="*{firstName}" /></p>
        <p>Last name: <input type="text" th:field="*{lastName}" /></p>
        <p>Middle Name: <input type="text" th:field="*{middleName}" /></p>
        <p>Password: <input type="text" th:field="*{pass}" /></p>
        <p>Address: <input type="text" th:field="*{address}" /></p>
        <p>City: <input type="text" th:field="*{city}" /></p>
        <p>Postal Code: <input type="text" th:field="*{postalCode}" /></p>
        <p>Phone Number: <input type="text" th:field="*{phoneNumber}" /></p>
        <p>Date of birth: <input type="text" th:field="*{dob}" /></p>
        <p>Email: <input type="text" th:field="*{email}" /></p>
        <p><input type="submit" value="Submit" /> <input type="reset" value="Reset" /></p>
    </form>
</body>
</html>