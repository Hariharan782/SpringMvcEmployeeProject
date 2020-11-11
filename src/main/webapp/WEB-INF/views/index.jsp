<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false" %>
<html>
<head>
<Title>Employee Web Application</Title>
</head>
<body>
	<h2>Employee Application</h2>

	<Form action="saveEmployee" method="post">
		<Table>
			<Tr>
				<Td>Employee Id</Td>
				<Td><input type="text" name="employeeId" /></Td>
			</Tr>

			<Tr>
				<Td>Employee Name</Td>
				<td><Input type="text" name="employeeName" /></td>
			</Tr>

			<tr>
				<td>City</td>
				<td><Input type="text" name="employeeCity" /></td>
			</tr>
			<tr>
				<td colspan=2><Input type="Submit" value="Submit" /></td>
			</tr>
		</Table>
	</Form>
	<h2>Employee Records - </h2>
	<Table>
		<Tr>
			<Th>Employee Id</Th>
			<Th>Employee Name</Th>
			<Th>Employee City</Th>
		</Tr>
		<c:forEach items="${employees}" var="emp">
		<Tr>
			<td>${emp.employeeId}</td>
			<td>${emp.employeeName}</td>
			<td>${emp.employeeCity}</td>
		</Tr>
		</c:forEach>
	</Table>
</body>
</html>
