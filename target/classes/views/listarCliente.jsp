<%@ page language="java" contentType="text/html" pageEncoding="UTF-8"%>
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
					<th class="small">R.U.N.</th>
					<th class="small">Nombre</th>
					<th class="small">Apellido</th>
					<th class="small">Fecha de nacimiento</th>
					<th class="small">A.F.P.</th>
					<th class="small">Direccion</th>
					<th class="small">Comuna</th>
					<th class="small">Telefono</th>
					<th class="small">Sistema de Salud</th>
					<th></th>
					<td><a href="formcliente" class="btn btn-info">Registrar</a></td>
                </tr>
            </thead>
        </tbody>
        <tbody>
        <% } %>
        <tr>
			<td class="small"><%= cliente.getRun() %></td>
			<td class="small"><%= cliente.getNombre() %></td>
			<td class="small"><%= cliente.getApellido() %></td>
			<td class="small"><%= cliente.getFechaNacimiento() %></td>
			<td class="small"><%= cliente.getAfp() %></td>
			<td class="small"><%= cliente.getDireccion() %></td>
			<td class="small"><%= cliente.getComuna() %></td>
			<td class="small"><%= cliente.getTelefono() %></td>
			<% int sS = cliente.getSistemaSalud();
			String sisS = sS == 1 ? "Fonasa" : "Isapres"; %>
			<td class="small"><%= sisS %></td>
			<td><a href="formeditarcliente?id=<%= cliente.getId() %>" class="btn btn-warning">Editar</a></td>
			<td><a href="borrarcliente?id=<%= cliente.getId() %>" class="btn btn-danger">Borrar</a></td>
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