<%@ page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<div class="container">
	<p class="h1 text-center">Iniciar sesión</p>
	<div class="row">
        <div class="col-md-3 mx-auto">
        <% 
        String error = (String) request.getAttribute("error");
        if(error != null && error.equals("true")) {
        	out.println("<p class='alert alert-danger'>Clave o usuario incorrecto.</p>");
        }
        %>
            <form class="custom-form" method="post" action="login-process">
				<div class="mb-3">
					<label for="usuario" class="form-label"><span class="text-danger">*</span>Usuario:</label>
					<input type="text" class="form-control" placeholder="" id="usuario" name="usuario" required>
				</div>
				<div class="mb-3">
					<label for="contrasenna" class="form-label"><span class="text-danger">*</span>Contraseña:</label>
					<input type="password" class="form-control" placeholder="" id="contrasenna" name="contrasenna" required>
				</div>
				<button type="submit" class="btn btn-primary">Ingresar</button>
			</form>
        </div>
    </div>
</div>