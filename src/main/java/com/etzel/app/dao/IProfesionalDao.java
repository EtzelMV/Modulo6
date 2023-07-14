package com.etzel.app.dao;

import java.util.List;

import com.etzel.app.modelos.Profesional;

/**
 * @author
 * Etzel M. Valderrama
 */
public interface IProfesionalDao {

	public boolean create(Profesional pro);
    
    public List<Profesional> readAll();
    
    public Profesional readOne(int id);
    
    public void update(Profesional pro);
    
    public void delete(int id);
}
