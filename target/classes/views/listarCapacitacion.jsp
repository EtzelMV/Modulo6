<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page import="java.util.List"%>
<%@ page import="com.etzel.app.modelos.Capacitacion"%>

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
					<th>Capacitación</th>
					<th>Horario</th>
					<th>Fecha de la capacitación</th>
					<th></th>
					<td><a href="formcapacitacion" class="btn btn-info">Registrar</a></td>
                </tr>
            </thead>
        </tbody>
        <tbody>
        <% } %>
        <tr>
			<td><%= capacitacion.getNombreCapacitacion() %></td>
			<td><%= capacitacion.getHorario() %></td>
			<td><%= capacitacion.getFechaCapacitacion() %></td>
			<td><a href="formeditarcapacitacion?id=<%= capacitacion.getIdCapacitacion() %>" class="btn btn-warning">Editar</a></td>
			<td><a href="borrarcapacitacion?id=<%= capacitacion.getIdCapacitacion() %>" class="btn btn-danger">Borrar</a></td>
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