<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="css/EstiloJSP.css">

<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js" type="text/javascript"></script>  
<script type="text/javascript">
$(document).ready(function() {
	$('a').mouseover(function() {
		$('audio')[0].play();
	});
	$('a').mouseover(function() {
		$('color.green');
	});
});
</script> 

<title>Insert title here</title>
</head>
<body>

<h1>Base de Datos Listado Bomberos Parque 41</h1>
<a href="indexBajabombero.html">Volver al formulario de Baja</a>
<br/><br/>

<h1 style="color:red">${mensajeError}</h1>
<h1 style="color:blue">${mensaje}</h1>

<table border="1">
<tr> 
	<th>Idbombero</th>
	<th>Categoria</th>
	<th>Turno</th>
	<th>Nombre</th>
	</tr>
	
	<c:forEach items="${listaBomberos}" var="bombero">
	<tr>
	<td>${bombero.idbombero}</td>
	<td>${bombero.categoria}</td>
	<td>${bombero.turno}</td>
	<td>${bombero.nombre}</td>
	</tr>
	</c:forEach>
	
</table>

<audio>
<source src="SonidoBoton.mp3" type="audio/mp3">
<source src="SonidoBoton.ogg" type="audio/ogg"> <!-- Audio solo para FireFox y Mozilla -->
</audio>

</body>
</html>