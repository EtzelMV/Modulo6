package com.etzel.app.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.etzel.app.modelos.Usuario;

/**
 * @author
 * Etzel M. Valderrama
 */
@Repository
public class UsuarioDao implements IUsuarioDao {
	
	@Autowired
	JdbcTemplate template;
	
	private static final Logger logger = LoggerFactory.getLogger(UsuarioDao.class);
	
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	@Override
    public boolean create(Usuario user) {
    	
    	try {
    		// Declarando el query para insertar los datos del usuario
            String query = "insert into usuario (run, nombre, apellido, fechaNacimiento) VALUES (?, ?, ?, ?)";
            template.update(query, user.getRun(), user.getNombre(), user.getApellido(), user.getFechaNacimiento());
            
            // Log para mostrar el usuario creado en el  registro
            logger.info("Usuario creado (Logger.info): {}", user);
            
            // Mostrando el usuario creado por consola
            System.out.println("Usuario creado (println y toString): " + user.toString());

            return true;
        } catch (Exception e) {
        	
        	// Registrando el error
            logger.error("Error al crear el usuario: {}", e.getMessage());
            return false;
        }
    }

	@Override
	public List<Usuario> readAll() {
		String query = "select id, run, nombre, apellido, fechaNacimiento, "
				+ "afp, titulo, area from usuario";
    	
    	List<Usuario> usuarios = template.query(query, new UsuarioRowMapper());
    	
    	/* 
    	 * Solución con java 8 en adelante:
    	 * clientes.removeIf(registro -> registro == null); 
    	 */
    	Iterator<Usuario> iterator = usuarios.iterator();
        while (iterator.hasNext()) {
        	Usuario registro = iterator.next();
            if (registro == null) {
                iterator.remove();
            }
        }
        
    	if (usuarios.isEmpty()) {
    		
    		// Crear usuario por defecto
            Usuario usuario1 = new Usuario();
            usuario1.setId(1);
            usuario1.setRun("18212019-1");
            usuario1.setNombre("Etzel Alexander");
            usuario1.setApellido("M. Valderrama");
            usuario1.setFechaNacimiento("22/04/1986");
            
         // Agregar usuario por defecto a la lista
            usuarios.add(usuario1);
    	}

        // Log para mostrar la lista de usuarios
        logger.info("Mostrando lista de usuarios: {}", usuarios);

        return usuarios;
	}

	@Override
	public Usuario readOne(int id) {
		
		String query = "select id, run, nombre, apellido, fechaNacimiento, afp, titulo, "
				+ "area from usuario where id = ?";
		
		return template.queryForObject(query, new Object[] {id}, new UsuarioRowMapper());
	}

	@Override
	public void update(Usuario user) {
		
		// Log para mostrar el usuario actualizado en el registro
        logger.info("Usuario actualizado (Logger.info): {}", user);

		String query = "update usuario set nombre = ?, apellido = ?, "
				+ "fechaNacimiento = ? where id = ?";
		
		template.update(query, new Object[] {user.getNombre(), user.getApellido(), 
				user.getFechaNacimiento(), user.getId()});
	}

	@Override
	public void delete(int id) {

		String query = "delete from usuario where id = ?";
		
		template.update(query, new Object[] {id});
	}
	
	class UsuarioRowMapper implements RowMapper<Usuario> {
	    public Usuario mapRow(ResultSet rs, int rowNum) throws SQLException {
	    	String afp = rs.getString("afp");
	    	String titulo = rs.getString("titulo");
	    	String area = rs.getString("area");
	    	
	    	if (afp == null && titulo == null && area == null) {
	    		return new Usuario(rs.getInt("id"), rs.getString("run"), 
	    				rs.getString("nombre"), rs.getString("apellido"), 
	    				rs.getString("fechaNacimiento"));
	    	} else {
	    		return null;
	    	}
	    }
	}
}
