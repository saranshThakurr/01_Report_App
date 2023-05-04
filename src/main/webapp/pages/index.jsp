<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Bootstrap demo</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ"
	crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<h1 class="pb-3 pt-3">REPORT APPLICATION</h1>
	</div>
	<form:form action="search" method="POST" modelAttribute="search">
		<table>
			<tr>
				<td>Plan Name:</td>
				<td><form:select path="planName">
						<form:option value="">-Select-</form:option>
						<form:options items="${name}"/>
					</form:select></td>

				<td>Plan Status:</td>
				<td><form:select path="planStatus">
						<form:option value="">-Select-</form:option>
					    <form:options items="${status}"/>
						
					</form:select></td>

				<td>Gender:</td>
				<td><form:select path="gender">
						<form:option value="">-Select-</form:option>
						<form:option value="Male">Male</form:option>
						<form:option value="Fe-Male">Fe-Male</form:option>

					</form:select></td>

			</tr>
			<tr>
				<td>Start Date:</td>
				<td><form:input path="startDate" type="date"/>
					</td>

				<td>End Date:</td>
				<td><form:input path="endDate" type="date"/>
					</td>

			</tr>
			<tr>
				<td><input type="submit" value="search" class="btn btn-primary"></td>
				<td><input type="reset" value="reset" class="btn btn-danger"></td>
			</tr>

		</table>

	</form:form>
	<hr/>
	<table class="table table-striped">
	<thead>
	<tr>
	<th>Id</th>
	<th>Holder Name</th>
	<th>Gender</th>
	<th>Plan Name</th>
	<th>Plan Status</th>
	<th>Start Date</th>
	<th>End Date</th>
	</tr>
	</thead>
	<tbody>
	<c:forEach items="${plans}" var="plan" varStatus="index">
	<tr>
	<td>${index.count}</td>
	<td>${plan.citizenName}</td>
	<td>${plan.gender}</td>
	<td>${plan.planName}</td>
	<td>${plan.planStatus}</td>
	<td>${plan.planStartDate}</td>
	<td>${plan.planEndDate}</td> 
	</tr>
	</c:forEach>
	</tbody>
	
	
	</table>
	
	<hr/>
	
	Export:<a href="">Excel</a> <a href="">Pdf</a>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe"
		crossorigin="anonymous"></script>
</body>
</html>