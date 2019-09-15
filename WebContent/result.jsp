<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>True Result</title>
</head>
<body>
<p>
Your answer is: 
${userInput.getResult()}
</p>
<a href="index.jsp">Do another "calculation"</a>
</body>
</html>