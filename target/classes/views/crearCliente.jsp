<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<div class="container">
	<p class="h1 text-center">Registrar Cliente</p>
	<div class="row">
        <div class="col-md-3 mx-auto">
            <form class="custom-form" method="post" action="crearcliente">
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
					<label for="fechaNacimiento" class="form-label">
					<span class="text-danger">*</span>Fecha de nacimiento:</label>
					<input type="text" class="form-control" placeholder="11/07/1999" id="fechaNacimiento" 
						name="fechaNacimiento" required>
				</div>
				<div class="mb-3">
					<label for="afp" class="form-label"><span class="text-danger">*</span>A.F.P.:</label>
					<input type="text" class="form-control" placeholder="" id="afp" name="afp" required>
				</div>
				<div class="mb-3">
					<label for="direccion" class="form-label"><span class="text-danger">*</span>Direccion:</label>
					<input type="text" class="form-control" placeholder="" id="direccion" name="direccion" required>
				</div>
				<div class="mb-3">
					<label for="comuna" class="form-label"><span class="text-danger">*</span>Comuna:</label>
					<input type="text" class="form-control" placeholder="" id="comuna" name="comuna" required>
				</div>
				<div class="mb-3">
					<label for="telefono" class="form-label"><span class="text-danger">*</span>Telefono:</label>
					<input type="text" class="form-control" placeholder="" id="telefono" name="telefono" required>
				</div>
				<div class="mb-3">
					<label for="sistemaSalud" class="form-label"><span class="text-danger">*</span>Sistema de Salud:</label>
					<input type="number" class="form-control" placeholder="1 para Fonasa, 2 para Isapres" id="sistemaSalud" 
						name="sistemaSalud" min="1" max="2" required>
					<div class="form-text">1 para Fonasa, 2 para Isapres</div>
				</div>
				<button type="submit" class="btn btn-success">Guardar</button>
			</form>
        </div>
    </div>
</div>