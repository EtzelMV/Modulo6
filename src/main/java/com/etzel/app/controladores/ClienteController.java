package com.etzel.app.controladores;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.etzel.app.modelos.Cliente;
import com.etzel.app.servicios.ClienteService;

/**
 * @author
 * Etzel M. Valderrama
 */
@Controller
public class ClienteController {
	
	private static boolean clienteCreado = false;
	private final ClienteService clienteService;
	
	private static final Logger logger = LoggerFactory.getLogger(ClienteController.class);

    @Autowired
    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }
    
    @RequestMapping(value = "/formcliente", method = RequestMethod.GET)
    public String 	formCliente(Locale locale, Model model) {
		logger.info("Mostrando formulario para crear un cliente.");
		
		fechaSistema(locale, model);
		
		// Establecer la pagina a incluir en la plantilla
		model.addAttribute("contenido", "crearCliente.jsp");
		
		return "plantilla";
	}
    
    @RequestMapping(value = "/crearcliente", method = RequestMethod.POST)
    public String crearCliente(Cliente cliente, Locale locale, Model model) {
    	
    	Integer sistemaSalud = cliente.getSistemaSalud();
        
        if (cliente.getRun() != null && !cliente.getRun().isEmpty() && cliente.getNombre() != null && 
        !cliente.getNombre().isEmpty() && cliente.getApellido() != null && !cliente.getApellido().isEmpty() && 
        cliente.getFechaNacimiento() != null && !cliente.getFechaNacimiento().isEmpty() && cliente.getAfp() 
        != null && !cliente.getAfp().isEmpty() && cliente.getDireccion() != null && !cliente.getDireccion().isEmpty()
        && cliente.getComuna() != null && !cliente.getComuna().isEmpty() && cliente.getTelefono() != null 
        && !cliente.getTelefono().isEmpty() && sistemaSalud != null && !String.valueOf(sistemaSalud).isEmpty()) {
        	
        	// Crear el cliente a traves del DAO
            clienteCreado = clienteService.create(cliente);
        }
        
        if (clienteCreado) {
            // Llamar al metodo listarClientes() para mostrar la lista de clientes
        	return listarClientes(locale, model);
        } else {
        	fechaSistema(locale, model);
    		
    		return formCliente(locale, model);
        }
    }
    
    @RequestMapping(value = "/listaclientes", method = RequestMethod.GET)
    public String listarClientes(Locale locale, Model model) {
        // Obtener la lista de clientes desde el DAO
        List<Cliente> clientes = clienteService.getAll();
        
        fechaSistema(locale, model);

        // Agregar la lista de clientes al model
        model.addAttribute("listaclientes", clientes);

        // Establecer la pagina a incluir en la plantilla
        model.addAttribute("contenido", "listarCliente.jsp");

        return "plantilla";
    }
    
    @RequestMapping(value = "/formeditarcliente", method = RequestMethod.GET)
    public String 	formEditarCliente(int id, Locale locale, Model model) {
		logger.info("Mostrando formulario para actualizar un cliente.");
		
		// Tomando data del cliente desde la base de datos
		Cliente cliente = clienteService.getOne(id);
		
		fechaSistema(locale, model);
		
		// Enviando data del cliente a la vista
		model.addAttribute("cliente", cliente);
		
		// Establecer la pagina a incluir en la plantilla
		model.addAttribute("contenido", "editarCliente.jsp");
		
		return "plantilla";
	}
    
    @RequestMapping(value = "/editarcliente", method = RequestMethod.POST)
    public String editarCliente(Cliente cliente, Locale locale, Model model) {
    	
    	Integer sistemaSalud = cliente.getSistemaSalud();
        
        if (cliente.getRun() != null && !cliente.getRun().isEmpty() && cliente.getNombre() != null && 
        !cliente.getNombre().isEmpty() && cliente.getApellido() != null && !cliente.getApellido().isEmpty() && 
        cliente.getFechaNacimiento() != null && !cliente.getFechaNacimiento().isEmpty() && cliente.getAfp() 
        != null && !cliente.getAfp().isEmpty() && cliente.getDireccion() != null && !cliente.getDireccion().isEmpty()
        && cliente.getComuna() != null && !cliente.getComuna().isEmpty() && cliente.getTelefono() != null 
        && !cliente.getTelefono().isEmpty() && sistemaSalud != null && !String.valueOf(sistemaSalud).isEmpty()) {
        	
        	// Editar el cliente a traves del DAO
            clienteService.update(cliente);
        }
        
        // Llamar al metodo listarClientes() para mostrar la lista de clientes
    	return listarClientes(locale, model);
        
    }
    
    @RequestMapping(value = "/borrarcliente", method = RequestMethod.GET)
    public String 	borrarCliente(int id, Locale locale, Model model) {
    	// Tomando data del cliente desde la base de datos
    	Cliente cliente = clienteService.getOne(id);
    	
    	logger.info("El cliente (" + cliente.getRun() + ", " + cliente.getNombre() + ", " + 
    			cliente.getApellido() + ") ha sido borrado.");
		
		// Eliminando cliente
		clienteService.delete(id);
		
		fechaSistema(locale, model);
		
		// Establecer la pagina a incluir en la plantilla
		model.addAttribute("contenido", "clienteBorrado.jsp");
		
		return "plantilla";
	}
    
    public Model fechaSistema(Locale locale, Model model) {
    	
    	Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		return model.addAttribute("serverTime", formattedDate );
    }
}
