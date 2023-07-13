<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page import="java.util.List"%>
<%@ page import="com.etzel.app.modelos.Usuario"%>

<div class="container text-center">
    <h1>Lista de Capacitaciones</h1>
    <table class="table table-dark table-bordered">
        <tbody>
            <% int count = 0; %>
            <% for (Usuario capacitacion : (List<Usuario>) request.getAttribute("listausuarios")) { %>
            <% if (count % 10 == 0) { %>
            <% if (count != 0) { %>
            <% } %>
            <thead>
                <tr>
					<th>R.U.N.</th>
					<th>Nombre</th>
					<th>Apellido</th>
					<th>Fecha de nacimiento</th>
					<% //<th></th> %>
                </tr>
            </thead>
        </tbody>
        <tbody>
        <% } %>
        <tr>
			<td><%= capacitacion.getRun() %></td>
			<td><%= capacitacion.getNombre() %></td>
			<td><%= capacitacion.getApellido() %></td>
			<td><%= capacitacion.getFechaNacimiento() %></td>
			<% //<td><a href="#" class="btn btn-success">Editar</a></td> %>
        </tr>
        <% count++; %>
        <% } %>
        </tbody>
    </table>
    <ul class="pagination">
        <% int pages = count / 10 + 1; %>
        <li class="page-item"><a class="page-link" href="?pages=<%= pages %>"><%= pages %></a></li>
    </ul>
</div>