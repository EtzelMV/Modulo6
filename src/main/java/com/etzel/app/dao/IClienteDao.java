package com.etzel.app.dao;

import java.util.List;

import com.etzel.app.modelos.Cliente;

/**
 * @author
 * Etzel M. Valderrama
 */
public interface IClienteDao {

	public boolean create(Cliente cliente);
	
	public void createRest(Cliente cliente);
	
	public List<Cliente> readAll();
	
	public Cliente readOne(int id);
	
	public void update(Cliente cliente);
	
	public void delete(int id);
}
