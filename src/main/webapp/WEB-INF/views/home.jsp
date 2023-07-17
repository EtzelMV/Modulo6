<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
<body class="text-white" style="background-color: #0D3D03;">
	<header class="bg-dark text-white">
        <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
            <div class="container">
                <a class="navbar-brand" href="crearclientesrest">Grupal 6</a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav"
                    aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarNav">
                    <ul class="navbar-nav ms-auto">
                        <li class="nav-item">
                            <a class="nav-link" href="">Inicio</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="capacitaciones">Capacitaciones</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="contacto">Contacto</a>
                        </li>
                        <!-- Verificar si el usuario ha iniciado sesion -->
                        <c:if test="${pageContext.request.userPrincipal != null}">
						    <li class="nav-item">
						        <a class="nav-link" href="logout">Cerrar Sesión</a>
						    </li>
						</c:if>
                    </ul>
                </div>
            </div>
        </nav>
    </header>

	<main class="mb-3" style="min-height: 539px;">
		<div class="container text-center">
			<h1>Desarrollo de aplicaciones web dinámicas con Java</h1>
			<p class="h4"></p>
			<div class="d-flex align-items-center justify-content-center" style="background-color: rgba(0, 0, 0, 0.5); height: 50vh;">
		  		<p><img src="https://media.giphy.com/media/v1.Y2lkPTc5MGI3NjExcXZwdndzOTRlYWJvdTM4ZXV5MWNkam82NWdubnY2aXFsYTNvNDdoMSZlcD1
		  		2MV9pbnRlcm5hbF9naWZfYnlfaWQmY3Q9Zw/l4JyQqyt9S1WTiE6c/giphy.gif" alt="GIF" style="max-width: 100%;"></p>
			</div>
			<p class="h4">El principio de la sabiduría es el temor de Jehová; Los insensatos desprecian la sabiduría y la enseñanza.</p>
		  	<p class="h4">Proverbios 1:7 RVR1960</p>
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
                    </ul>
                    <ul class="nav">
                    	<li class="nav-item">
                            <a class="nav-link text-white">&copy; Copyright Jun 2023</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link text-white" 
                            href="https://drive.google.com/file/d/1y9YIBB-h4y6uOnP63ewNofEBbkQndigM/view?usp=sharing" 
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