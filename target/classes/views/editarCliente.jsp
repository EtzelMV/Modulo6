<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<div class="container">
	<p class="h1 text-center">Editar Cliente</p>
	<div class="row">
        <div class="col-md-3 mx-auto">
            <form class="custom-form" method="post" action="editarcliente">
            	<div class="form-group mb-3">
		            <input type="hidden" class="" id="id" name="id" value="${cliente.id}" readonly>
		        </div>
				<div class="form-group mb-3">
		            <label for="run">R.U.N.:</label>
		            <input type="text" class="form-control" id="run" name="run" value="${cliente.run}" readonly>
		        </div>
				<div class="form-group mb-3">
		            <label for="nombre"><span class="text-danger">*</span>Nombre:</label>
		            <input type="text" class="form-control" id="nombre" name="nombre" value="${cliente.nombre}" 
		            		required>
		        </div>
				<div class="form-group mb-3">
		            <label for="apellido"><span class="text-danger">*</span>Apellido:</label>
		            <input type="text" class="form-control" id="apellido" name="apellido" value="${cliente.apellido}" 
		            		required>
		        </div>
				<div class="form-group mb-3">
		            <label for="fechaNacimiento"><span class="text-danger">*</span>Fecha de Nacimiento:</label>
		            <input type="text" class="form-control" id="fechaNacimiento" name="fechaNacimiento" 
		            		value="${cliente.fechaNacimiento}" required>
		            <div class="form-text">Ej: 09/03/1983</div>
		        </div>
		        <div class="form-group mb-3">
		            <label for="afp"><span class="text-danger">*</span>A.F.P.:</label>
		            <input type="text" class="form-control" id="afp" name="afp" value="${cliente.afp}" 
		            		required>
		        </div>
		        <div class="form-group mb-3">
		            <label for="direccion"><span class="text-danger">*</span>Direccion:</label>
		            <input type="text" class="form-control" id="direccion" name="direccion" value="${cliente.direccion}" 
		            		required>
		        </div>
		        <div class="form-group mb-3">
		            <label for="comuna"><span class="text-danger">*</span>Comuna:</label>
		            <input type="text" class="form-control" id="comuna" name="comuna" value="${cliente.comuna}" 
		            		required>
		        </div>
		        <div class="form-group mb-3">
		            <label for="telefono"><span class="text-danger">*</span>Telefono:</label>
		            <input type="text" class="form-control" id="telefono" name="telefono" value="${cliente.telefono}" 
		            		required>
		        </div>
		        <div class="form-group mb-3">
		            <label for="sistemaSalud"><span class="text-danger">*</span>Sistema de Salud:</label>
		            <input type="number" class="form-control" id="sistemaSalud" name="sistemaSalud" min="1" max="2" 
		            	value="${cliente.sistemaSalud}" required>
		            <div class="form-text">1 para Fonasa, 2 para Isapres</div>
		        </div>
				<button type="submit" class="btn btn-info">Actualizar</button>
			</form>
        </div>
    </div>
</div>