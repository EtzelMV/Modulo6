package com.etzel.app.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.etzel.app.modelos.Capacitacion;

/**
 * @author
 * Etzel M. Valderrama
 */
@Repository
public class CapacitacionDao implements ICapacitacionDao {
	
	@Autowired
	JdbcTemplate template;
	
	private static final Logger logger = LoggerFactory.getLogger(CapacitacionDao.class);
	
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
    
    @Override
    public boolean create(Capacitacion c) {
    	
    	try {
    		// Declarando el query para insertar los datos de la capacitacion
            String query = "INSERT INTO capacitacion (nombre, horario, fecha) VALUES (?, ?, ?)";
            template.update(query, c.getNombreCapacitacion(), c.getHorario(), c.getFechaCapacitacion());
            
            // Log para mostrar la capacitacion creada en archivo de registro
            logger.info("Capacitacion creada (Logger.info): {}", c);
            
            // Mostrando la capacitacion creada por consola
            System.out.println("Capacitacion creada (println y toString): " + c.toString());

            return true;
        } catch (Exception e) {
        	
        	// Registrando el error
            logger.error("Error al crear la capacitacion: {}", e.getMessage());
            return false;
        }
    }

    @Override
    public List<Capacitacion> readAll() {
    	
    	String query = "select * from capacitacion";
    	
    	List<Capacitacion> capacitaciones = template.query(query, new CapacitacionRowMapper());
    	
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
            capacitaciones.add(capacitacion1);
            capacitaciones.add(capacitacion2);
            capacitaciones.add(capacitacion3);
    	}

        // Log para mostrar la lista de capacitaciones
        logger.info("Mostrando lista de capacitaciones: {}", capacitaciones);

        return capacitaciones;
    }

	@Override
	public Capacitacion readOne(int id) {

		String query = "select * from capacitacion where id = ?";
		
		return template.queryForObject(query, new Object[] {id}, new CapacitacionRowMapper());
		
		/*Capacitacion capacitacion = (Capacitacion) template.query(query, new CapacitacionRowMapper());
		return capacitacion;*/
		
		/* List<Capacitacion> capacitaciones = template.query(query, new Object[] { id }, new CapacitacionRowMapper());
	    if (capacitaciones.isEmpty()) {
	        return null; // Otra acción apropiada si no se encuentra ninguna capacitación con el ID dado
	    } else {
	        return capacitaciones.get(0);
	    } */
	}

	@Override
	public void update(Capacitacion c) {

		String query = "update capacitacion set nombre = ?, horario = ?, fecha = ? where id = ?";
		
		template.update(query, new Object[] {c.getNombreCapacitacion(), c.getHorario(), c.getFechaCapacitacion()});
	}

	@Override
	public void delete(int id) {

		String query = "delete capacitacion where id = ?";
		
		template.update(query, new Object[] {id});
	}
	
	class CapacitacionRowMapper implements RowMapper<Capacitacion> {
		public Capacitacion mapRow(ResultSet rs, int rowNum) throws SQLException {
			return new Capacitacion(rs.getInt("id"), rs.getString("nombre"), rs.getString("horario"), 
					rs.getString("fecha"));
		}
	}
}
