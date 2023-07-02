<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page import="java.util.List"%>
<%@ page import="com.etzel.app.Capacitacion"%>

<div class="container text-center">
    <h1>Lista de Capacitaciones</h1>
    <table class="table table-dark table-bordered">
        <tbody>
            <% int count = 0; %>
            <% for (Capacitacion capacitacion : (List<Capacitacion>) request.getAttribute("listacapacitaciones")) { %>
            <% if (count % 10 == 0) { %>
            <% if (count != 0) { %>
            <% } %>
            <thead>
                <tr>
					<th>Capacitaci�n</th>
					<th>Horario</th>
					<th>Fecha de la capacitaci�n</th>
					<% //<th></th> %>
                </tr>
            </thead>
        </tbody>
        <tbody>
        <% } %>
        <tr>
			<td><%= capacitacion.getNombreCapacitacion() %></td>
			<td><%= capacitacion.getHorario() %></td>
			<td><%= capacitacion.getFechaCapacitacion() %></td>
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