<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer Confirmation</title>
</head>
<body>
The Customer is confirmed
<br><br>
First Name : ${customer.firstName }
<br><br>
Last Name : ${customer.lastName }
<br><br>
Free Passes : ${customer.freePasses }
<br><br>
Postal code : ${customer.postalCode }
<br><br>
Course code : ${customer.courseCode }
<br><br>
</body>
</html>