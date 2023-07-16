<%@ page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<div class="container mt-3">
	<p class="h1 text-center">Desarrollo de Aplicaciones JEE</p>
	<p class="h3 text-center">Con Spring Tool Suite 3</p>
	<p class="h5">Spring Legacy Project | Spring MVC Project</p>
	<p class="mt-3 mb-3">Spring Tool Suite (https://spring.io/tools) proporciona un excelente entorno para 
	el desarrollo de aplicaciones que utilicen Spring Framework. Spring Tool Suite se integra sobre 
	la plataforma Eclipse (http://www.eclipse.org/) y también da soporte al servidor web (en nuestro 
	caso Tomcat); sin embargo, podemos preparar el entorno desde el IDE Ecplise con las librerias 
	necesarias.</p>
		
	<div class="row align-items-center" style="background-color: rgba(0, 0, 0, 0.5); height: 50vh;">
		<div class="col-4">
	       <div class="d-flex align-items-center justify-content-center">
	         <iframe class="img-fluid rounded shadow" src="https://giphy.com/embed/TnSuSTDljmD6LhIyKn" 
	         	style="position:relative;max-width: 100%;"></iframe>
	       </div>
	     </div>
	     <div class="col-4">
	       <div class="d-flex align-items-center justify-content-center">
	         <iframe class="img-fluid rounded shadow" src="https://giphy.com/embed/W05iUdqyFujrRFgnn1" 
	         	style="position:relative;max-width: 100%;"></iframe>
	       </div>
	     </div>
	     <div class="col-4">
	       <div class="d-flex align-items-center justify-content-center">
	         <iframe class="img-fluid rounded shadow" src="https://giphy.com/embed/ZnqfvC8BNlAXInRwG1" 
	         	style="position:relative;max-width: 100%;"></iframe>
	       </div>
	     </div>
	     <div>
	     	<p class="h5 text-center">El principio de la sabiduría es el temor de Jehová;
			Los insensatos desprecian la sabiduría y la enseñanza.</p>
		 	<p class="h5 text-center">Proverbios 1:7 RVR1960</p>
	     </div>
    </div>
    
	<div class="mt-3">
		<p class="mt-3 mb-3">Spring nos provee de un cliente Rest, RestTemplate, muy sencillo de usar. Él se encarga
		de realizar la conexión http, lo único que hace falta es pasarle la url del servicio contra el que conectar. 
		El mismo RestTemplate gestiona sus propios ‘messageConverters’, con los que parsear los datos enviados y 
		recibidos de/a json, por ejemplo. Solo es necesario añadir en nuestro proyecto la dependencia necesaria.</p>
	</div>
</div>