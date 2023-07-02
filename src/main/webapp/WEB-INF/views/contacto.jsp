<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<div class="container">
	<p class="h1 text-center">Contactanos</p>
	<div class="row">
        <div class="col-md-3 mx-auto">
            <form class="custom-form" method="post" action="contactoexitoso">
				<div class="mb-3">
					<label for="nombre" class="form-label"><span class="text-danger">*</span>Nombre:</label>
					<input type="text" class="form-control" placeholder="" id="nombre" name="nombre" required>
				</div>
				<div class="mb-3">
					<label for="apellido" class="form-label"><span class="text-danger">*</span>Apellido:</label>
					<input type="text" class="form-control" placeholder="" id="apellido" name="apellido" required>
				</div>
				<div class="mb-3">
					<label for="email" class="form-label"><span class="text-danger">*</span>Email:</label>
					<input type="text" class="form-control" placeholder="" id="email" name="email" required>
				</div>
				<div class="mb-3">
					<label for="consulta" class="form-label"><span class="text-danger">*</span>Consulta:</label>
					<textarea class="form-control" id="consulta" rows="5" 
					placeholder="Ingrese el motivo de su consulta aquí..." name="consulta" required></textarea>
				</div>
				<button type="submit" class="btn btn-success">Guardar</button>
			</form>
        </div>
    </div>
</div>