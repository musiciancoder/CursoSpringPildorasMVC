<!-- Esto es lo que se devuelve al procesar -->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<!-- Para hoja de estilos hay que tener previamente configurada la ruta en archivo xml -->
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/recursos/estilos/miestilo.css">
</head>
<body>
Hola ${param.nombreAlumno}. Bienvenido al curso de Spring
<p><br>
<h2>Atención a todos</h2>
<!-- recupera los datos del modelo -->
${mensajeClaro}
</p>
<!-- Para arvhivos externos estaticos hay que tener previamente configurada la ruta en archivo xml -->
<img alt="FotoNoCarga" src="${pageContext.request.contextPath}/recursos/imgs/linux.jpg">
</body>
</html>