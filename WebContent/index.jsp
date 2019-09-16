<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>A Really Bad Calculator</title>
</head>
<body>
<h1>A Really Bad Calculator</h1>
<form action="getCalculationServlet" method="post">
Enter a whole number:
<input type="text" name="firstUserNum" size="10">
Enter another whole number: 
<input type="text" name="secondUserNum" size="10">
<input type="submit" value="Calculate" />
</form>
</body>
</html>