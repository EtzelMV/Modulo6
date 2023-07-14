package com.etzel.app.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etzel.app.dao.ClienteDao;
import com.etzel.app.modelos.Cliente;

/**
 * @author
 * Etzel M. Valderrama
 */
@Service
public class ClienteService {
	
	private final ClienteDao clienteDao;

	/**
	 * @param clienteDao
	 */
	@Autowired
	public ClienteService(ClienteDao clienteDao) {
		this.clienteDao = clienteDao;
	}

	public boolean  create(Cliente cliente) {
		return clienteDao.create(cliente);
	}
	
	public List<Cliente> getAll() {
		return clienteDao.readAll();
	}
	
	public Cliente getOne(int id) {
		return clienteDao.readOne(id);
	}
	
	public void update(Cliente cliente) {
		clienteDao.update(cliente);
	}
	
	public void delete(int id) {
		clienteDao.delete(id);
	}
}
