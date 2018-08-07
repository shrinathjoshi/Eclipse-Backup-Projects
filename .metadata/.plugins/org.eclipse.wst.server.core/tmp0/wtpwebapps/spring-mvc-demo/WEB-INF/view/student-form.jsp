<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="mvc" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Regestration</title>
</head>
<body>

	<mvc:form action="processForm" modelAttribute="student">
	
	First Name: <mvc:input path="firstName"/>
	<br>
	<br>
	Last Name: <mvc:input path="lastName"/>
	<br><br>
	
	Country:
	<mvc:select path="country">
		<mvc:options items="${student.countryOptions}"/>
		
	</mvc:select>
	
	<br><br>
	Favourite Language:
	<br>
	Java <mvc:radiobutton path="favouriteLanguage" value="Java" />
	C++ <mvc:radiobutton path="favouriteLanguage" value="C++" />
	Python <mvc:radiobutton path="favouriteLanguage" value="Python" />
	R <mvc:radiobutton path="favouriteLanguage" value="R" />
	
	<br><br>
	Operating system:
	Windows<mvc:checkbox path="operatingSystem" value="Windows"/>
	Linux<mvc:checkbox path="operatingSystem" value="Linux"/>
	Mac OS<mvc:checkbox path="operatingSystem" value="Mac Os"/>
	<br><br>
	
	
	<input type="submit" value="Submit" />
	
	</mvc:form>



</body>
</html>