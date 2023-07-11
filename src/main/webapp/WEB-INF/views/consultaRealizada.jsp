<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<div class="container mt-3 text-center">
	<div class="col-md-7 mx-auto">
		<p class="h1">Tu consulta ha sido enviada exitosamente</p>
		<p class="h5">
			Estimado <%= request.getAttribute("nombre") %> <%= request.getAttribute("apellido") %></p>
		<p class="h5">
			En la brevedad de lo posible le estaremos dando respuesta a su correo
			electrónico <%= request.getAttribute("email") %> con respecto a su consulta:
		</p>
		<p class="h5"><%= request.getAttribute("consulta") %></p>
	</div>
</div>