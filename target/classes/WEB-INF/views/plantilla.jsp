<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Modulo 6</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" 
	integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
</head>
<body class="text-white" style="background-color: #B7950B;">
	<header class="bg-dark text-white">
        <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
            <div class="container">
                <a class="navbar-brand" href="home">Grupal 5</a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav"
                    aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarNav">
                    <ul class="navbar-nav ms-auto">
                        <li class="nav-item">
                            <a class="nav-link" href="home">Inicio</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="formcapacitacion">Crear Capacitacion</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="listacapacitaciones">Listar Capacitaciones</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="contacto">Contacto</a>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>
    </header>

	<main class="mb-3" style="min-height: 539px;">
		<jsp:include page="${contenido}"/>
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
                    	<li class="nav-item">
                            <a class="nav-link text-white">&copy; Copyright Jun 2023</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link text-white">${serverTime}</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link text-white" 
                            href="https://drive.google.com/file/d/1JP-KaN4tIBheXYiTGC5kzlOjdGeDMQtL/view?usp=sharing" 
                            target="_blank">Criterio de evaluación</a>
                        </li>
                    </ul>
                </div>
                <div class="col-lg-5">
                    <ul class="nav justify-content-end">
                        <li class="nav-item">
                            <a class="nav-link text-white" href="https://my.bible.com/es" target="_blank">'El temor de Jehová es aborrecer el mal; 
                            	La soberbia y la arrogancia, el mal camino, Y la boca perversa, aborrezco.' Proverbios 8:13</a>
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