<!DOCTYPE HTML>
<html xmlns:th="https://www.thymeleaf.org">
<head> 
    <title>Getting Started: Handling Form Submission</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
</head>
<body>
	<h1>Result</h1>
    <p th:text="'Thank you for registering ' + ${registration.user}" />
    <p th:text="'A link has been sent to your email ' + ${registration.email}" />
    <a href="/registration">Submit another message</a>
</body>
</html>