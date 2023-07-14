<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page import="java.util.List"%>
<%@ page import="com.etzel.app.modelos.Cliente"%>

<div class="container text-center">
    <h1>Lista de Clientes</h1>
    <table class="table table-dark table-bordered">
        <tbody>
            <% int count = 0; %>
            <% for (Cliente cliente : (List<Cliente>) request.getAttribute("listaclientes")) { %>
            <% if (count % 10 == 0) { %>
            <% if (count != 0) { %>
            <% } %>
            <thead>
                <tr>
					<th>R.U.N.</th>
					<th>Nombre</th>
					<th>Apellido</th>
					<th>Fecha de nacimiento</th>
					<th>A.F.P.</th>
					<th>Direccion</th>
					<th>Comuna</th>
					<th>Telefono</th>
					<th>Sistema de Salud</th>
					<th></th>
					<td><a href="formcliente" class="btn btn-info">Registrar</a></td>
                </tr>
            </thead>
        </tbody>
        <tbody>
        <% } %>
        <tr>
			<td><%= cliente.getRun() %></td>
			<td><%= cliente.getNombre() %></td>
			<td><%= cliente.getApellido() %></td>
			<td><%= cliente.getFechaNacimiento() %></td>
			<td><%= cliente.getAfp() %></td>
			<td><%= cliente.getDireccion() %></td>
			<td><%= cliente.getComuna() %></td>
			<td><%= cliente.getTelefono() %></td>
			<% int sS = cliente.getSistemaSalud();
			String sisS = null;
			if (sS == 1) {sisS = "Fonasa";} else {sisS = "Isapres";}%>
			<td><%= sisS %></td>
			<td><a href="formeditarcliente?id=<%= cliente.getId() %>" class="btn btn-warning">Editar</a></td>
			<td><a href="eliminarcliente?id=<%= cliente.getId() %>" class="btn btn-danger">Eliminar</a></td>
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