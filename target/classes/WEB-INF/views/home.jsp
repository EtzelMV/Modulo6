<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<div class="container">
	<p class="h1 text-center">Desarrollo de Aplicaciones JEE</p>
	<p class="h3 text-center">Con Spring Tool Suite 3</p>
	<p class="h3">Spring Legacy Project | Spring MVC Project</p>
	<p class="h5">Spring Tool Suite (https://spring.io/tools) proporciona un excelente entorno para 
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
		<p class="h5">Generalmente el uso y explotación de bases de datos relacionales en Java se realiza a 
		través de herramientas de mapeo ORM como Hibernate o Apache OpenJPA que permiten desarrollar la capa 
		de persistencia de forma muy rápida con una alta abstracción sobre el modelo relacional.</p>
		<p class="h5">Sin embargo, la utilización de un ORM no es aplicable para todos los diseños de entidad 
		relación que soportan este tipo de implementación.</p>
		<p class="h5">Si bien JPA nos permite trabajar con SQL nativo y procedimientos almacenados (e Hibernate 
		ofrece funcionalidades adicionales), resulta más práctico trabajar directamente con JDBC ya que no 
		obtenemos ningún beneficio utilizando JPA.</p>
		<p class="h5">Spring nos ayuda en esta tarea simplificando y estandarizando el uso de JDBC gracias a las 
		clases que conforman Spring JDBC Template.</p>
	</div>
</div>