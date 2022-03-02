<!-- Este es el formulario -->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- El action es el mismo requestmapping del controlador-->
	<form action="procesarFormulario2" method="get">
<!-- 	El name viaja como parametro -->
		<input type="text" name="nombreAlumno">
		<input type="submit">
	</form>
</body>
</html>