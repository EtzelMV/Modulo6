package com.etzel.app.dao;

import java.util.List;

import com.etzel.app.modelos.Capacitacion;

public interface ICapacitacionDao {
	
	List<Capacitacion> obtenerCapacitaciones();
	
    boolean crearCapacitacion(Capacitacion capacitacion);
}
