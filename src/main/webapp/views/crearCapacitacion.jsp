<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Modulo 6</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" 
	integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
</head>
<body class="text-white" style="background-color: #1A4377;">
	<header class="bg-dark text-white">
        <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
            <div class="container">
                <a class="navbar-brand" href="#">Grupal 01</a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav"
                    aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarNav">
                    <ul class="navbar-nav ms-auto">
                        <li class="nav-item">
                            <a class="nav-link" href="inicio">Inicio</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="crearcapacitacion">Crear Capacitacion</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="contacto">Contacto</a>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>
    </header>

	<main class="mb-3 mt-3" style="min-height: 530px;">

		<div class="container">
			<p class="h1 text-center">Crear capacitación</p>
			<div class="row">
		        <div class="col-md-3 mx-auto">
		            <form class="custom-form" method="post" action="capacitaciones">
						<div class="mb-3">
							<label for="name" class="form-label">Nombre:</label>
							<input type="text" class="form-control" placeholder="" id="name" name="name">
						</div>
						<div class="mb-3">
							<label for="time" class="form-label">Horario:</label>
							<input type="text" class="form-control" placeholder="10:00-13:00" id="time" name="time">
						</div>
						<div class="mb-3">
							<label for="date" class="form-label">Fecha:</label>
							<input type="text" class="form-control" placeholder="30/03/1999" id="date" name="date">
						</div>
						<button type="submit" class="btn btn-success">Guardar</button>
					</form>
		        </div>
		    </div>
		</div>

	</main>
	
	<footer class="bg-dark text-white">
        <div class="container py-4">
            <div class="row">
                <div class="col-lg-7">
                    <ul class="nav">
                        <li class="nav-item">
                            <a class="nav-link text-white" href="https://www.facebook.com/iEtzel" target="_blank">Etzel M. Valderrama</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link text-white" href="#">Ricardo Silva</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link text-white" href="#">Fernando Bermudez</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link text-white" href="#">Matías Muñoz</a>
                        </li>
                    </ul>
                    <ul class="nav">
                    	<li class="col-6 nav-item">
                            <a class="nav-link text-white">&copy; Copyright Jun 2023</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link text-white" href="evaluacionuno" target="_blank">Criterio de evalución</a>
                        </li>
                    </ul>
                </div>
                <div class="col-lg-5">
                    <ul class="nav justify-content-end">
                        <li class="nav-item">
                            <a class="nav-link text-white" href="https://my.bible.com/es" target="_blank">'El temor de Jehová es aborrecer el mal; La soberbia y 
                            	la arrogancia, el mal camino, Y la boca perversa, aborrezco.' Proverbios 8:13</a>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
    </footer>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.min.js" 
		integrity="sha384-cuYeSxntonz0PPNlHhBs68uyIAVpIIOZZ5JqeqvYYIcEL727kskC66kF92t6Xl2V" crossorigin="anonymous"></script>
</body>
</html>
