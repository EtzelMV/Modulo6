package com.etzel.app.dao;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.etzel.app.CapacitacionService;
import com.etzel.app.modelos.Capacitacion;

/**
 * @author
 * Etzel M. Valderrama
 */
@Repository
public class CapacitacionDao implements ICapacitacionDao {
	
	private static final Logger logger = LoggerFactory.getLogger(CapacitacionDao.class);

    @Autowired
    private CapacitacionService capacitacionService;

    @Override
    public List<Capacitacion> obtenerCapacitaciones() {
    	List<Capacitacion> capacitaciones = capacitacionService.obtenerTodasLasCapacitaciones();
    	
    	if (capacitaciones.isEmpty()) {
    		
    		// Crear las capacitaciones por defecto
            Capacitacion capacitacion1 = new Capacitacion();
            capacitacion1.setIdCapacitacion(1);
            capacitacion1.setNombreCapacitacion("Curso Básico Java");
            capacitacion1.setHorario("10:00 - 13:00");
            capacitacion1.setFechaCapacitacion("18/07/2023");

            Capacitacion capacitacion2 = new Capacitacion();
            capacitacion2.setIdCapacitacion(2);
            capacitacion2.setNombreCapacitacion("Curso Básico MySQL");
            capacitacion2.setHorario("14:00 - 17:00");
            capacitacion2.setFechaCapacitacion("18/07/2023");

            Capacitacion capacitacion3 = new Capacitacion();
            capacitacion3.setIdCapacitacion(3);
            capacitacion3.setNombreCapacitacion("Curso Básico HTML5 y Bootstrap");
            capacitacion3.setHorario("17:00 - 20:00");
            capacitacion3.setFechaCapacitacion("19/07/2023");

            // Agregar las capacitaciones por defecto a la lista
            capacitacionService.agregarCapacitacion(capacitacion1);
            capacitacionService.agregarCapacitacion(capacitacion2);
            capacitacionService.agregarCapacitacion(capacitacion3);
    	}
    	
    	
    	
        // Obtener la lista actualizada de capacitaciones desde el servicio o repositorio
        capacitaciones = capacitacionService.obtenerTodasLasCapacitaciones();

        // Log para mostrar la lista de capacitaciones
        logger.info("Mostrando lista de capacitaciones: {}", capacitaciones);

        return capacitaciones;
    }

    @Override
    public boolean crearCapacitacion(Capacitacion capacitacion) {
        // Agregar la capacitacion a través del servicio o repositorio
        capacitacionService.agregarCapacitacion(capacitacion);

        // Log para mostrar la capacitacion creada
        logger.info("Capacitacion creada (Logger.info): {}", capacitacion);
        
        System.out.println("Capacitacion creada (println y toString): " + capacitacion.toString());

        // En este ejemplo, se retorna siempre true para indicar que la capacitacion se creó correctamente
        return true;
    }
}
