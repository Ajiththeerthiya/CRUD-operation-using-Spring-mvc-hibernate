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
	<form:form action="todisplayupdated" modelAttribute="empdata">
		Employee Id : <form:input path="id" readonly="true" />
		<br>
		Employee name : <form:input path="name" type="text" />
		<br>
		Employee Email : <form:input path="email" type="email" />
		<br>
		Employee PhoneNumber :<form:input path="number" type="number" />
		<br>
		Employee Date of Joining : <form:input path="dateofJoining"
			type="date" />
		<br>
		<input type="submit">
	</form:form>
</body>
</html>