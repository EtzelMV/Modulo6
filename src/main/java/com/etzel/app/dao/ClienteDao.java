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
	public void createRest(Cliente cliente) {
		
		try {
    		// Declarando el query para insertar los datos del cliente
            String query = "insert into usuariorest (run, nombre, apellido, fechaNacimiento, afp, direccion, "
            		+ "comuna, telefono, sistemaSalud) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            template.update(query, cliente.getRun(), cliente.getNombre(), cliente.getApellido(), 
            		cliente.getFechaNacimiento(), cliente.getAfp(), cliente.getDireccion(), 
            		cliente.getComuna(), cliente.getTelefono(), cliente.getSistemaSalud());
            
            // Log para mostrar el cliente creado en el  registro
            logger.info("Cliente creado (Logger.info): {}", cliente);
            
            // Mostrando el cliente creado por consola
            System.out.println("Cliente creado (println y toString): " + cliente.toString());
        } catch (Exception e) {
        	
        	// Registrando el error
            logger.error("Error al crear el cliente: {}", e.getMessage());
        }
	}

	@Override
	public List<Cliente> readAll() {

		String query = "select id, run, nombre, apellido, fechaNacimiento, afp, direccion, "
				+ "comuna, telefono, sistemaSalud from usuario";
    	
    	List<Cliente> clientes = template.query(query, new ClienteRowMapper());
    	
    	/* 
    	 * Solucion con java 8 en adelante:
    	 * clientes.removeIf(registro -> registro == null); 
    	 */
    	Iterator<Cliente> iterator = clientes.iterator();
        while (iterator.hasNext()) {
            Cliente registro = iterator.next();
            if (registro == null) {
                iterator.remove();
            }
        }
    	
    	if (clientes.isEmpty()) {
    		
    		// Crear el cliente por defecto
            Cliente clienteDefault = new Cliente();
            clienteDefault.setId(1);
            clienteDefault.setRun("18212019-1");
            clienteDefault.setNombre("Etzel Alexander");
            clienteDefault.setApellido("M. Valderrama");
            clienteDefault.setFechaNacimiento("22/04/1986");
            clienteDefault.setAfp("Mi AFP");
            clienteDefault.setDireccion("Las Lilas 1019");
            clienteDefault.setComuna("Lo Prado");
            clienteDefault.setTelefono("958235046");
            clienteDefault.setSistemaSalud(1);
            
         // Agregar el cliente por defecto a la lista
            clientes.add(clienteDefault);
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

		String query = "update usuario set nombre = ?, apellido = ?, fechaNacimiento = ?, "
				+ "afp = ?, direccion = ?, comuna = ?, telefono = ?, sistemaSalud = ? "
				+ "where id = ?";
		
		template.update(query, new Object[] {cliente.getNombre(), cliente.getApellido(), 
				cliente.getFechaNacimiento(), cliente.getAfp(), cliente.getDireccion(), 
				cliente.getComuna(), cliente.getTelefono(), cliente.getSistemaSalud(), 
				cliente.getId()});
		
		// Log para mostrar el cliente creado en el registro
        logger.info("Cliente actualizado (Logger.info): {}", cliente);
	}

	@Override
	public void delete(int id) {

		String query = "delete from usuario where id = ?";
		
		template.update(query, new Object[] {id});
	}

	class ClienteRowMapper implements RowMapper<Cliente> {
	    public Cliente mapRow(ResultSet rs, int rowNum) throws SQLException {
	        String afp = rs.getString("afp");
	        if (afp != null) {
	            return new Cliente(rs.getInt("id"), rs.getString("run"), rs.getString("nombre"), 
	                    rs.getString("apellido"), rs.getString("fechaNacimiento"), afp, 
	                    rs.getString("direccion"), rs.getString("comuna"), rs.getString("telefono"), 
	                    rs.getInt("sistemaSalud"));
	        } else {
	            return null; // Si afp es nulo, no se devuelve ningun objeto Cliente
	        }
	    }
	}
}
