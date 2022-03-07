<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Formulario de registro</title>
</head>
<body>
	<form:form action="procesarFormulario" modelAttribute="elAlumno">
		<!-- path="nombre" llama a setNombre de la clase alumno  -->
Nombre:<form:input path="nombre" />
		<br>
		<br>
		<br>
Apellido:<form:input path="apellido" />
		<br>
		<br>
		<br>
		Asignaturas optativas:<form:select path="optativa" multiple="true">
			<form:option value="Diseño" label="Diseño"></form:option>
			<form:option value="Karate" label="Karate"></form:option>
			<form:option value="Comercio" label="Comercio"></form:option>
			<form:option value="Diseño" label="Danza"></form:option>
		</form:select>
		<br>
		<br>
		Barcelona:<form:radiobutton path="ciudadEstudios" value="Barcelona" />
		Madrid:<form:radiobutton path="ciudadEstudios" value="Madrid" />
		Valencia:<form:radiobutton path="ciudadEstudios" value="Valencia" />
		Bilbao:<form:radiobutton path="ciudadEstudios" value="Bilbao" />
		<br>
		<br>
		<br>
		Ingles:<form:checkbox path="idiomasAlumno" value="Inglés" />
			Frances:<form:checkbox path="idiomasAlumno" value="Frances" />
				Aleman:<form:checkbox path="idiomasAlumno" value="Aleman" />
					Chino:<form:checkbox path="idiomasAlumno" value="Chino" />
		<input type="submit" value="enviar">
	</form:form>
</body>
</html>