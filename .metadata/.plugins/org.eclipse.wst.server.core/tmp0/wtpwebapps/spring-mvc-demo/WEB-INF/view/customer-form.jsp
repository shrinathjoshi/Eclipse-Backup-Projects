<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="mvc" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer Registration from</title>

<style >
	.error{color:red}
</style>

</head>
<body>
Fill Out the Form
<mvc:form action="processForm" modelAttribute="customer">

	First name <mvc:input path="firstName"/>
	<br><br>
	
	Last Name <mvc:input path="lastName"/>
	<mvc:errors path="lastName" cssClass="error"></mvc:errors>
	<br><br>
	
	 Free Passes <mvc:input path="freePasses"/>
	<mvc:errors path="freePasses" cssClass="error"></mvc:errors>
	<br><br>
	
	 Postal Code <mvc:input path="postalCode"/>
	<mvc:errors path="postalCode" cssClass="error"></mvc:errors>
	<br><br>
	
	Course Code <mvc:input path="courseCode"/>
	<mvc:errors path="courseCode" cssClass="error"></mvc:errors>
	<br><br>
	
	
	<input type="submit" value="Submit"/>
</mvc:form>
</body>
</html>