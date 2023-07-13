<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<div class="container">
	<p class="h1 text-center">Crear Usuario</p>
	<div class="row">
        <div class="col-md-3 mx-auto">
            <form class="custom-form" method="post" action="crearusuario">
				<div class="mb-3">
					<label for="run" class="form-label"><span class="text-danger">*</span>R.U.N.:</label>
					<input type="text" class="form-control" placeholder="18212019-7" id="run" name="run" required>
				</div>
				<div class="mb-3">
					<label for="nombre" class="form-label"><span class="text-danger">*</span>Nombre:</label>
					<input type="text" class="form-control" placeholder="" id="nombre" name="nombre" required>
				</div>
				<div class="mb-3">
					<label for="apellido" class="form-label"><span class="text-danger">*</span>Apellido:</label>
					<input type="text" class="form-control" placeholder="" id="apellido" name="apellido" required>
				</div>
				<div class="mb-3">
					<label for="fechaNacimiento" class="form-label"><span class="text-danger">*</span>Fecha de nacimiento:</label>
					<input type="text" class="form-control" placeholder="11/07/1999" id="fechaNacimiento" name="fechaNacimiento" required>
				</div>
				<button type="submit" class="btn btn-success">Guardar</button>
			</form>
        </div>
    </div>
</div>