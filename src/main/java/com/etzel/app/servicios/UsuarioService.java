package com.etzel.app.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etzel.app.dao.UsuarioDao;
import com.etzel.app.modelos.Usuario;

/**
 * @author
 * Etzel M. Valderrama
 */
@Service
public class UsuarioService {
	
	private final UsuarioDao userDao;

	/**
	 * @param userDao
	 */
	@Autowired
	public UsuarioService(UsuarioDao userDao) {
		this.userDao = userDao;
	}

	public boolean  create(Usuario user) {
		return userDao.create(user);
	}
	
	public List<Usuario> getAll() {
		return userDao.readAll();
	}
	
	public Usuario getOne(int id) {
		return userDao.readOne(id);
	}
	
	public void update(Usuario user) {
		userDao.update(user);
	}
	
	public void delete(int id) {
		userDao.delete(id);
	}
}
