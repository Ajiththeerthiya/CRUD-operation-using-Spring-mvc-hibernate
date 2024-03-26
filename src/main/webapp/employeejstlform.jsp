<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form:form action="saveemployee" modelAttribute="employeeobj">
		Name : <form:input type="text"  path="name"  />
		<br>
		Email :<form:input type="email" path="email"  />
		<br>
		Phone Number : <form:input type="number" path="number"  />
		<br>
		Date of joining : <form:input type="date" path="dateofJoining"  />
		<br>
		<input type="submit">
	</form:form>
</body>
</html>