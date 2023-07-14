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

import com.etzel.app.modelos.Cliente;

/**
 * @author
 * Etzel M. Valderrama
 */
@Repository
public class ClienteDao implements IClienteDao {
	
	@Autowired
	JdbcTemplate template;
	
	private static final Logger logger = LoggerFactory.getLogger(ClienteDao.class);
	
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	@Override
	public boolean create(Cliente cliente) {

		try {
    		// Declarando el query para insertar los datos del cliente
            String query = "insert into usuario (run, nombre, apellido, fechaNacimiento, afp, direccion, "
            		+ "comuna, telefono, sistemaSalud) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            template.update(query, cliente.getRun(), cliente.getNombre(), cliente.getApellido(), 
            		cliente.getFechaNacimiento(), cliente.getAfp(), cliente.getDireccion(), 
            		cliente.getComuna(), cliente.getTelefono(), cliente.getSistemaSalud());
            
            // Log para mostrar el cliente creado en el  registro
            logger.info("Cliente creado (Logger.info): {}", cliente);
            
            // Mostrando el cliente creado por consola
            System.out.println("Cliente creado (println y toString): " + cliente.toString());

            return true;
        } catch (Exception e) {
        	
        	// Registrando el error
            logger.error("Error al crear el cliente: {}", e.getMessage());
            return false;
        }
	}

	@Override
	public List<Cliente> readAll() {

		String query = "select id, run, nombre, apellido, fechaNacimiento, afp, direccion, "
				+ "comuna, telefono, sistemaSalud from usuario";
    	
    	List<Cliente> clientes = template.query(query, new ClienteRowMapper());
    	
    	if (clientes.isEmpty()) {
    		
    		// Crear el cliente por defecto
            Cliente cliente1 = new Cliente();
            cliente1.setId(1);
            cliente1.setRun("18212019-1");
            cliente1.setNombre("Etzel Alexander");
            cliente1.setApellido("M. Valderrama");
            cliente1.setFechaNacimiento("22/04/1986");
            cliente1.setAfp("Mi AFP");
            cliente1.setDireccion("Las Lilas 1019");
            cliente1.setComuna("Lo Prado");
            cliente1.setTelefono("958235046");
            cliente1.setSistemaSalud(1);
            
         // Agregar el cliente por defecto a la lista
            clientes.add(cliente1);
    	}

        // Log para mostrar la lista de clientes
        logger.info("Mostrando lista de clientes: {}", clientes);

        return clientes;
	}

	@Override
	public Cliente readOne(int id) {

		String query = "select id, run, nombre, apellido, fechaNacimiento, afp, direccion, "
				+ "comuna, telefono, sistemaSalud from usuario where id = ?";
		
		return template.queryForObject(query, new Object[] {id}, new ClienteRowMapper());
	}

	@Override
	public void update(Cliente cliente) {

		// Log para mostrar el cliente creado en el registro
        logger.info("Cliente creado (Logger.info): {}", cliente);

		String query = "update usuario set nombre = ?, apellido = ?, fechaNacimiento = ?,  "
				+ "afp = ?, direccion = ?, comuna = ?, telefono = ?, sistemaSalud = ? "
				+ "where id = ?";
		
		template.update(query, new Object[] {cliente.getNombre(), cliente.getApellido(), 
				cliente.getFechaNacimiento(), cliente.getAfp(), cliente.getDireccion(), 
				cliente.getComuna(), cliente.getTelefono(), cliente.getSistemaSalud(), 
				cliente.getId()});
	}

	@Override
	public void delete(int id) {

		String query = "delete from usuario where id = ?";
		
		template.update(query, new Object[] {id});
	}

	class ClienteRowMapper implements RowMapper<Cliente> {
	    public Cliente mapRow(ResultSet rs, int rowNum) throws SQLException {
	        return new Cliente(rs.getInt("id"), rs.getString("run"), rs.getString("nombre"), 
	                rs.getString("apellido"), rs.getString("fechaNacimiento"));
	    }
	}
}
