<%@ page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<div class="container">
	<p class="h1 text-center">Editar Usuario</p>
	<div class="row">
        <div class="col-md-3 mx-auto">
            <form class="custom-form" method="post" action="editarusuario">
            	<div class="form-group mb-3">
		            <input type="hidden" class="" id="id" name="id" value="${usuario.id}" readonly>
		        </div>
				<div class="form-group mb-3">
		            <label for="run">R.U.N.:</label>
		            <input type="text" class="form-control" id="run" name="run" value="${usuario.run}" readonly>
		        </div>
				<div class="form-group mb-3">
		            <label for="nombre"><span class="text-danger">*</span>Nombre:</label>
		            <input type="text" class="form-control" id="nombre" name="nombre" value="${usuario.nombre}" 
		            		required>
		        </div>
				<div class="form-group mb-3">
		            <label for="apellido"><span class="text-danger">*</span>Apellido:</label>
		            <input type="text" class="form-control" id="apellido" name="apellido" value="${usuario.apellido}" 
		            		required>
		        </div>
				<div class="form-group mb-3">
		            <label for="fechaNacimiento"><span class="text-danger">*</span>Fecha de Nacimiento:</label>
		            <input type="text" class="form-control" id="fechaNacimiento" name="fechaNacimiento" 
		            		value="${usuario.fechaNacimiento}" required>
		            <div class="form-text">Ej: 17/07/1997</div>
		        </div>
				<button type="submit" class="btn btn-info">Actualizar</button>
			</form>
        </div>
    </div>
</div>