<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script type="text/javascript" src="js/jquery-2.1.4.js"></script>
<!-- Bootstrap CSS -->
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
<!-- Bootstrap JS -->
<script src="bootstrap/js/bootstrap.min.js"></script>
<link rel="stylesheet" type="text/css" href="estilos.css" />
</head>

<body>
	<div id="container">
		<header>
			<jsp:include page="encabezado.jsp" flush="false" />
			<jsp:include page="menuPublic.jsp" flush="false" />
		</header>
		<div id="content">

			<h3 style="text-align: center; text-decoration: underline;">JRuteros - Compañeros de ruta</h3>
			<p style="padding-top: 25px; font-size: 15px;text-align: center">JRuteros es un
				sitio para descubrir y compartir rutas al aire libre a pie, en bici
				y de muchas otras actividades.</p>
		</div>
		<div class="clearfooter"></div>
	</div>
	<footer>
		<p>Sistema para Socialización de Rutas - Copyright (c) 2016</p>
	</footer>
</body>
</html>