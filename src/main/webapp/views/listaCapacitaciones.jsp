<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List"%>

<div class="container text-center">
    <h1>Lista de Capacitaciones</h1>
    <table class="table table-dark table-bordered">
        <tbody>
            <% int count = 0; %>
            <% for (modelo.Capacitacion capacitacion : (List<modelo.Capacitacion>) request.getAttribute("listacapacitaciones")) { %>
            <% if (count % 10 == 0) { %>
            <% if (count != 0) { %>
            <% } %>
            <thead>
                <tr>
					<th>Capacitación</th>
					<th>Horario</th>
					<th>Fecha de la capacitación</th>
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