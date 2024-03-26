<%@page import="com.dto.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Employees List</h1>
	<%
	List<Employee> employee = (List<Employee>) request.getAttribute("empdata");
	%>

	<table border="2" cellPadding="15">
		<thead>
			<tr>
				<td>Id</td>
				<td>Name</td>
				<td>Email</td>
				<td>PhoneNumber</td>
				<td>Date of Joining</td>
				<td>Update</td>
				<td>Delete</td>
			</tr>
		</thead>
		<tbody>
			<%
			if (employee != null) {
				for (Employee e : employee) {
			%>

			<tr>
				<td><%=e.getId()%></td>
				<td><%=e.getName()%></td>
				<td><%=e.getEmail()%></td>
				<td><%=e.getNumber()%></td>
				<td><%=e.getDateofJoining()%></td>
				<td><a href="updateemp?id=<%=e.getId()%>">Update</a></td>
				<td><a href="deleteemp?id=<%=e.getId()%>">Delete</a></td>
			</tr>

			<%
			}
			} else {
			%>
			<h1>No data</h1>
			<%
			}
			%>
			<a href="home">Home</a>
</body>
</html>