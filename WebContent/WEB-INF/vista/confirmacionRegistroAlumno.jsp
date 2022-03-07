<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Confirmacion Registro</title>
</head>
<body>
 <h1> El alumno con nombre ${elAlumno.nombre} y apellido ${elAlumno.apellido}, edad ${elAlumno.edad}, email ${elAlumno.email}
 se registro con exito. Las asignaturas: ${elAlumno.optativa}.
 La ciudad donde comenzará los estudios el amumno es: ${elAlumno.ciudadEstudios}.
 Los idiomas del alumno son: ${elAlumno.idiomasAlumno}</h1>
</body>
</html>