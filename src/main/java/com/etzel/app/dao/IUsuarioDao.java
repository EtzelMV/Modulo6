package com.etzel.app.dao;

import java.util.List;

import com.etzel.app.modelos.Usuario;

/**
 * @author
 * Etzel M. Valderrama
 */
public interface IUsuarioDao {
	
	public boolean create(Usuario user);
    
    public List<Usuario> readAll();
    
    public Usuario readOne(int id);
    
    public void update(Usuario user);
    
    public void delete(int id);
}
