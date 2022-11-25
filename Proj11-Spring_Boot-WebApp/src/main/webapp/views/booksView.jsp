<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h2>Books Data</h2>

<table border="1">
	<thead>
		<tr>
			<th>Book ID</th>
			<th>Book Name</th>
			<th>Book Price</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${books}" var="books">
		<tr>
			<td>${books.bookId}</td>
			<td>${books.bookName}</td>
			<td>${books.bookPrice}</td>
		</tr>
		</c:forEach>
	</tbody>
</table>

</body>
</html>