package com.etzel.app.dao;

import java.util.List;

import com.etzel.app.modelos.Administrativo;

/**
 * @author
 * Etzel M. Valderrama
 */
public interface IAdministrativoDao {

	public boolean create(Administrativo adm);
    
    public List<Administrativo> readAll();
    
    public Administrativo readOne(int id);
    
    public void update(Administrativo adm);
    
    public void delete(int id);
}
