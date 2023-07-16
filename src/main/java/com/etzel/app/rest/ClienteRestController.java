package com.etzel.app.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.etzel.app.dao.ClienteDao;
import com.etzel.app.dto.ClienteDto;
import com.etzel.app.modelos.Cliente;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author
 * Etzel M. Valderrama
 */
@RestController
public class ClienteRestController {

    @Autowired
    private ClienteDao clienteDao;

    @RequestMapping(method = RequestMethod.GET)
    public List<Cliente> getAllClientes() {
        return clienteDao.readAll();
    }

    @RequestMapping(value = "/api/listadoclientes/{id}", method = RequestMethod.GET)
    public Cliente getCliente(@PathVariable int id) {
        return clienteDao.readOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public void createCliente(@RequestBody Cliente cliente) {
        clienteDao.create(cliente);
    }

    @RequestMapping(value = "/api/editarcliente/{id}", method = RequestMethod.PUT)
    public void updateCliente(@PathVariable int id, @RequestBody Cliente cliente) {
        cliente.setId(id);
        clienteDao.update(cliente);
    }

    @RequestMapping(value = "/api/borrarcliente/{id}", method = RequestMethod.DELETE)
    public void deleteCliente(@PathVariable int id) {
        clienteDao.delete(id);
    }
    
    @RequestMapping(value = "/api/listadoclientes", method = RequestMethod.GET, produces = "application/json")
    public String getClientesListado() throws JsonProcessingException {
        List<Cliente> clientes = clienteDao.readAll();
        List<ClienteDto> clientesDTO = new ArrayList<>();

        for (Cliente cliente : clientes) {
        	ClienteDto clienteDTO = new ClienteDto(cliente.getId(), cliente.getRun(), cliente.getNombre(), 
        			cliente.getApellido(), cliente.getFechaNacimiento(), cliente.getAfp(), cliente.getDireccion(), 
        			cliente.getComuna(), cliente.getTelefono(), cliente.getSistemaSalud());
            clientesDTO.add(clienteDTO);
        }

        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.writeValueAsString(clientesDTO);
    }
}
