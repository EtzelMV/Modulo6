<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page import="java.util.List"%>
<%@ page import="com.etzel.app.modelos.Usuario"%>

<div class="container text-center">
    <h1>Lista de Usuarios</h1>
    <table class="table table-dark table-bordered">
        <tbody>
            <% int count = 0; %>
            <% for (Usuario usuario : (List<Usuario>) request.getAttribute("listausuarios")) { %>
            <% if (count % 10 == 0) { %>
            <% if (count != 0) { %>
            <% } %>
            <thead>
                <tr>
					<th>R.U.N.</th>
					<th>Nombre</th>
					<th>Apellido</th>
					<th>Fecha de nacimiento</th>
					<th></th>
					<td><a href="formusuario" class="btn btn-info">Registrar</a></td>
                </tr>
            </thead>
        </tbody>
        <tbody>
        <% } %>
        <tr>
			<td><%= usuario.getRun() %></td>
			<td><%= usuario.getNombre() %></td>
			<td><%= usuario.getApellido() %></td>
			<td><%= usuario.getFechaNacimiento() %></td>
			<td><a href="formeditarusuario?id=<%= usuario.getId() %>" class="btn btn-warning">Editar</a></td>
			<td><a href="borrarusuario?id=<%= usuario.getId() %>" class="btn btn-danger">Borrar</a></td>
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