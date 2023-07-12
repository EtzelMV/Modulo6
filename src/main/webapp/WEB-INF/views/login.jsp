<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<div class="container">
	<p class="h1 text-center">Iniciar sesi�n</p>
	<div class="row">
        <div class="col-md-3 mx-auto">
            <form class="custom-form" method="post" action="login-process">
				<div class="mb-3">
					<label for="usuario" class="form-label"><span class="text-danger">*</span>Usuario:</label>
					<input type="text" class="form-control" placeholder="" id="usuario" name="usuario" required>
				</div>
				<div class="mb-3">
					<label for="contrasenna" class="form-label"><span class="text-danger">*</span>Contrase�a:</label>
					<input type="password" class="form-control" placeholder="" id="contrasenna" name="contrasenna" required>
				</div>
				<button type="submit" class="btn btn-primary">Ingresar</button>
			</form>
        </div>
    </div>
</div>