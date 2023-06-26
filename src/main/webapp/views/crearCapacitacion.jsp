<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<div class="container">
	<p class="h1 text-center">Crear Capacitación</p>
	<div class="row">
        <div class="col-md-3 mx-auto">
            <form class="custom-form" method="post" action="listacapacitaciones">
				<div class="mb-3">
					<label for="nombreCapacitacion" class="form-label"><span class="text-danger">*</span>Capacitación:</label>
					<input type="text" class="form-control" placeholder="Ingrese el nombre de la capacitación..." 
					id="nombreCapacitacion" name="nombreCapacitacion" required>
				</div>
				<div class="mb-3">
					<label for="horario" class="form-label"><span class="text-danger">*</span>Horario:</label>
					<input type="text" class="form-control" placeholder="10:00-13:00" id="horario" name="horario" required>
				</div>
				<div class="mb-3">
					<label for="fechaCapacitacion" class="form-label"><span class="text-danger">*</span>Fecha de la capacitación:</label>
					<input type="text" class="form-control" placeholder="30/03/1999" id="fechaCapacitacion" name="fechaCapacitacion" required>
				</div>
				<button type="submit" class="btn btn-success">Guardar</button>
			</form>
        </div>
    </div>
</div>