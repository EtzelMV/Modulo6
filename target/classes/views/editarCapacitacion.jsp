<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<div class="container mt-3">
	<p class="h1 text-center">Editar Capacitacion</p>
	<div class="row">
        <div class="col-md-3 mx-auto">
            <form class="custom-form" method="post" action="editarcapacitacion">
            	<div class="form-group mb-3">
		            <input type="hidden" class="" id="idCapacitacion" name="idCapacitacion" value="${capacitacion.idCapacitacion}" readonly>
		        </div>
				<div class="form-group mb-3">
		            <label for="nombreCapacitacion">Capacitacion:</label>
		            <input type="text" class="form-control" id="nombreCapacitacion" name="nombreCapacitacion" 
		            value="${capacitacion.nombreCapacitacion}" readonly>
		            <div class="form-text">Ingrese el nombre de la capacitación...</div>
		        </div>
				<div class="form-group mb-3">
		            <label for="horario"><span class="text-danger">*</span>Horario:</label>
		            <input type="text" class="form-control" id="horario" name="horario" 
		            	value="${capacitacion.horario}" required>
		            <div class="form-text">Ej: 10:00-13:00</div>
		        </div>
				<div class="form-group mb-3">
		            <label for="fechaCapacitacion"><span class="text-danger">*</span>Fecha de Capacitacion:</label>
		            <input type="text" class="form-control" id="fechaCapacitacion" name="fechaCapacitacion" 
		            value="${capacitacion.fechaCapacitacion}" required>
		            <div class="form-text">Ej: 19/11/1989</div>
		        </div>
				<button type="submit" class="btn btn-info">Actualizar</button>
			</form>
        </div>
    </div>
</div>