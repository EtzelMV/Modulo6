package com.etzel.app.dao;

import java.util.List;

import com.etzel.app.modelos.Capacitacion;

/**
 * @author
 * Etzel M. Valderrama
 */
public interface ICapacitacionDao {
    
    public boolean create(Capacitacion c);
    
    public List<Capacitacion> readAll();
    
    public Capacitacion readOne(int id);
    
    public void update(Capacitacion c);
    
    public void delete(int id);
}
